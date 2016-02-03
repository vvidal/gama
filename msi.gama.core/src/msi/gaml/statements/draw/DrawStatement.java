/*********************************************************************************************
 *
 *
 * 'DrawStatement.java', in plugin 'msi.gama.core', is part of the source code of the
 * GAMA modeling and simulation platform.
 * (c) 2007-2014 UMI 209 UMMISCO IRD/UPMC & Partners
 *
 * Visit https://code.google.com/p/gama-platform/ for license information and developers contact.
 *
 *
 **********************************************************************************************/
package msi.gaml.statements.draw;

import static msi.gama.common.interfaces.IKeyword.*;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import msi.gama.common.interfaces.*;
import msi.gama.precompiler.GamlAnnotations.*;
import msi.gama.precompiler.ISymbolKind;
import msi.gama.runtime.IScope;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gaml.compilation.IDescriptionValidator;
import msi.gaml.descriptions.*;
import msi.gaml.expressions.IExpression;
import msi.gaml.statements.AbstractStatementSequence;
import msi.gaml.statements.draw.DrawStatement.DrawValidator;
import msi.gaml.types.*;

// A command that is used to draw shapes, figures, text on the display

@symbol(name = DRAW, kind = ISymbolKind.SINGLE_STATEMENT, with_sequence = false)
@facets(value = {
	// Allows to pass any arbitrary geometry to the drawing command
	@facet(name = IKeyword.GEOMETRY,
		type = IType.NONE,
		optional = true,
		doc = @doc("any type of data (it can be geometry, image, text)") ),
	// AD 18/01/13: geometry is now accepting any type of data
	@facet(name = TEXTURE,
		type = { IType.STRING, IType.LIST },
		optional = true,
		doc = @doc("the texture that should be applied to the geometry") ),
	@facet(name = EMPTY,
		type = IType.BOOL,
		optional = true,
		doc = @doc("a condition specifying whether the geometry is empty or full") ),
	@facet(name = BORDER,
		type = { IType.COLOR, IType.BOOL },
		optional = true,
		doc = @doc("if used with a color, represents the color of the geometry border. If set to false, expresses that no border should be drawn. If not set, the borders will be drawn using the color of the geometry.") ),
	@facet(name = ROUNDED,
		type = IType.BOOL,
		optional = true,
		doc = @doc(value = "specify whether the geometry have to be rounded (e.g. for squares)",
			deprecated = "Use the squircle operator to draw rounded squares") ),
	@facet(name = AT, type = IType.POINT, optional = true, doc = @doc("location where the shape/text/icon is drawn") ),
	@facet(name = SIZE,
		type = { IType.FLOAT, IType.POINT },
		optional = true,
		doc = @doc("size of the object to draw, expressed as a bounding box (width, height, depth). If expressed as a float, represents the size in the three directions. ") ),
	@facet(name = COLOR,
		type = IType.COLOR,
		optional = true,
		doc = @doc("the color to use to display the object. In case of images, will try to colorize it") ),
	@facet(name = ROTATE,
		type = { IType.FLOAT, IType.INT, IType.PAIR },
		optional = true,
		doc = @doc("orientation of the shape/text/icon; can be either an int/float (angle) or a pair float::point (angle::rotation axis). The rotation axis, when expressed as an angle, is by defaut {0,0,1}") ),
	@facet(name = FONT,
		type = { IType.FONT, IType.STRING },
		optional = true,
		doc = @doc("the font used to draw the text, if any. Applying this facet to geometries or images has no effect.") ),
	@facet(name = DEPTH,
		type = IType.FLOAT,
		optional = true,
		doc = @doc("(only if the display type is opengl) Add an artificial depth to the geometry previously defined (a line becomes a plan, a circle becomes a cylinder, a square becomes a cube, a polygon becomes a polyhedron with height equal to the depth value). Note: This only works if the geometry is not a point ") ),
	@facet(name = DrawStatement.BEGIN_ARROW,
		type = { IType.INT, IType.FLOAT },
		optional = true,
		doc = @doc("the size of the arrow, located at the beginning of the drawn geometry") ),
	@facet(name = DrawStatement.END_ARROW,
		type = { IType.INT, IType.FLOAT },
		optional = true,
		doc = @doc("the size of the arrow, located at the end of the drawn geometry") ),
	@facet(name = PERSPECTIVE,
		type = IType.BOOL,
		optional = true,
		doc = @doc(value = "Whether to render the text in perspective or facing the user. Default is true.") ),
	@facet(name = "bitmap",
		type = IType.BOOL,
		optional = true,
		doc = @doc(deprecated = "use 'perspective' instead.", value = "Whether to render the text in 3D or not") ) },

	omissible = IKeyword.GEOMETRY)
@inside(symbols = { ASPECT }, kinds = { ISymbolKind.SEQUENCE_STATEMENT, ISymbolKind.LAYER })
@doc(
	value = "`" + DRAW +
		"` is used in an aspect block to expresse how agents of the species will be drawn. It is evaluated each time the agent has to be drawn. It can also be used in the graphics block.",
	usages = {
		@usage(
			value = "Any kind of geometry as any location can be drawn when displaying an agent (independently of his shape)",
			examples = { @example(value = "aspect geometryAspect {", isExecutable = false),
				@example(value = "	draw circle(1.0) empty: !hasFood color: #orange ;", isExecutable = false),
				@example(value = "}", isExecutable = false) }),
		@usage(value = "Image or text can also be drawn",
			examples = { @example(value = "aspect arrowAspect {", isExecutable = false),
				@example(
					value = "	draw \"Current state= \"+state at: location + {-3,1.5} color: #white font: font('Default', 12, #bold) ;",
					isExecutable = false),
				@example(value = "	draw file(ant_shape_full) rotate: heading at: location size: 5",
					isExecutable = false),
				@example(value = "}", isExecutable = false) }),
		@usage(
			value = "Arrows can be drawn with any kind of geometry, using " + DrawStatement.BEGIN_ARROW + " and " +
				DrawStatement.END_ARROW +
				" facets, combined with the empty: facet to specify whether it is plain or empty",
			examples = { @example(value = "aspect arrowAspect {", isExecutable = false),
				@example(value = "	draw line([{20, 20}, {40, 40}]) color: #black begin_arrow:5;",
					isExecutable = false),
				@example(
					value = "	draw line([{10, 10},{20, 50}, {40, 70}]) color: #green end_arrow: 2 begin_arrow: 2 empty: true;",
					isExecutable = false),
				@example(value = "	draw square(10) at: {80,20} color: #purple begin_arrow: 2 empty: true;",
					isExecutable = false),
				@example(value = "}", isExecutable = false) }) })
@validator(DrawValidator.class)
public class DrawStatement extends AbstractStatementSequence {

	public static class DrawValidator implements IDescriptionValidator {

		/**
		 * Method validate()
		 * @see msi.gaml.compilation.IDescriptionValidator#validate(msi.gaml.descriptions.IDescription)
		 */
		@Override
		public void validate(final IDescription description) {
			IExpressionDescription geom = description.getFacets().get(GEOMETRY);
			if ( geom != null ) {
				for ( String s : Arrays.asList(TEXT, SHAPE, IMAGE) ) {
					IExpressionDescription other = description.getFacets().getDescr(s);
					if ( other != null ) {
						description.warning("'" + s + "' has no effect here", IGamlIssue.CONFLICTING_FACETS, s);
					}
				}

			}

			IExpressionDescription rotate = description.getFacets().get(ROTATE);
			if ( rotate != null ) {
				IExpression exp = rotate.getExpression();
				if ( !exp.getType().isTranslatableInto(Types.FLOAT) &&
					!exp.getType().isTranslatableInto(GamaType.from(Types.PAIR, Types.FLOAT, Types.POINT)) ) {
					description.error("the type of rotate must be either a float/int or a pair<float,point>",
						IGamlIssue.WRONG_TYPE, ROTATE);
				}
			}
		}

	}

	public static final String END_ARROW = "end_arrow";
	public static final String BEGIN_ARROW = "begin_arrow";

	private final DrawExecuter executer;
	private final DrawingData data;

	public DrawStatement(final IDescription desc) throws GamaRuntimeException {
		super(desc);
		IExpression item = getFacet(IKeyword.GEOMETRY);
		if ( item == null ) {
			executer = null;
			data = null;
		} else {
			data = new DrawingData(getFacet(SIZE), getFacet(DEPTH), getFacet(ROTATE), getFacet(AT), getFacet(EMPTY),
				getFacet(BORDER), getFacet(COLOR), getFacet(FONT), getFacet(TEXTURE), getFacet("bitmap", PERSPECTIVE));

			if ( item.getType().id() == IType.FILE ) {
				executer = new FileExecuter(item);
			} else if ( item.getType().id() == IType.STRING ) {
				executer = new TextExecuter(item);
			} else {
				// item is supposed to be castable into a geometry
				executer = new ShapeExecuter(item, getFacet(BEGIN_ARROW), getFacet(END_ARROW));
			}
		}
	}

	@Override
	public Rectangle2D privateExecuteIn(final IScope scope) throws GamaRuntimeException {
		final IGraphics g = scope.getGraphics();
		if ( g == null ) { return null; }
		try {
			return executer.executeOn(scope, g, data.computeAttributes(scope));
		} catch (GamaRuntimeException e) {
			throw e;
		} catch (Exception e) {
			java.lang.System.err.println("Error when drawing in a display : " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}