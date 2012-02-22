/*
 * GAMA - V1.4 http://gama-platform.googlecode.com
 * 
 * (c) 2007-2011 UMI 209 UMMISCO IRD/UPMC & Partners (see below)
 * 
 * Developers :
 * 
 * - Alexis Drogoul, UMI 209 UMMISCO, IRD/UPMC (Kernel, Metamodel, GAML), 2007-2012
 * - Vo Duc An, UMI 209 UMMISCO, IRD/UPMC (SWT, multi-level architecture), 2008-2012
 * - Patrick Taillandier, UMR 6228 IDEES, CNRS/Univ. Rouen (Batch, GeoTools & JTS), 2009-2012
 * - Beno�t Gaudou, UMR 5505 IRIT, CNRS/Univ. Toulouse 1 (Documentation, Tests), 2010-2012
 * - Phan Huy Cuong, DREAM team, Univ. Can Tho (XText-based GAML), 2012
 * - Pierrick Koch, UMI 209 UMMISCO, IRD/UPMC (XText-based GAML), 2010-2011
 * - Romain Lavaud, UMI 209 UMMISCO, IRD/UPMC (RCP environment), 2010
 * - Francois Sempe, UMI 209 UMMISCO, IRD/UPMC (EMF model, Batch), 2007-2009
 * - Edouard Amouroux, UMI 209 UMMISCO, IRD/UPMC (C++ initial porting), 2007-2008
 * - Chu Thanh Quang, UMI 209 UMMISCO, IRD/UPMC (OpenMap integration), 2007-2008
 */
package msi.gaml.commands;

import msi.gama.common.interfaces.IKeyword;
import msi.gama.metamodel.shape.ILocation;
import msi.gama.precompiler.GamlAnnotations.facet;
import msi.gama.precompiler.GamlAnnotations.facets;
import msi.gama.precompiler.GamlAnnotations.inside;
import msi.gama.precompiler.GamlAnnotations.symbol;
import msi.gama.runtime.*;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gama.util.IContainer;
import msi.gaml.compilation.*;
import msi.gaml.descriptions.IDescription;
import msi.gaml.expressions.IExpression;
import msi.gaml.operators.Cast;
import msi.gaml.types.IType;

/**
 * IfPrototype.
 * 
 * @author drogoul 14 nov. 07
 */
@symbol(name = { IKeyword.MATCH, IKeyword.MATCH_BETWEEN, IKeyword.MATCH_ONE, IKeyword.DEFAULT }, kind = ISymbolKind.SEQUENCE_COMMAND)
@inside(symbols = IKeyword.SWITCH)
@facets(value = { @facet(name = IKeyword.VALUE, type = IType.NONE_STR, optional = true) }, omissible = IKeyword.VALUE)
public class MatchCommand extends AbstractCommandSequence {

	final IExpression value;
	Object constantValue;
	final MatchExecuter executer;

	public MatchCommand(final IDescription desc) throws GamlException {
		super(desc);
		value = getFacet(IKeyword.VALUE);
		String keyword = desc.getKeyword();
		setName(keyword + " " + (value == null ? "" : value.toGaml()));
		executer =
			keyword.equals(IKeyword.MATCH) ? new SimpleMatch() : keyword.equals(IKeyword.MATCH_ONE)
				? new MatchOne() : keyword.equals(IKeyword.MATCH_BETWEEN) ? new MatchBetween()
					: new MatchDefault();
		executer.acceptValue();
	}

	public boolean matches(final IScope scope, final Object switchValue)
		throws GamaRuntimeException {
		return executer.matches(scope, switchValue);
	}

	abstract class MatchExecuter {

		abstract boolean matches(IScope scope, Object switchValue) throws GamaRuntimeException;

		void acceptValue() throws GamlException {
			if ( value.isConst() ) {
				constantValue = value.value(GAMA.getDefaultScope());
			}
		}

		Object getValue(final IScope scope) throws GamaRuntimeException {
			return constantValue == null ? value.value(scope) : constantValue;
		}
	}

	class MatchDefault extends MatchExecuter {

		@Override
		boolean matches(final IScope scope, final Object switchValue) throws GamaRuntimeException {
			return false;
		}

		@Override
		void acceptValue() throws GamlException {

		}

		@Override
		Object getValue(final IScope scope) throws GamaRuntimeException {
			return null;
		}

	}

	class SimpleMatch extends MatchExecuter {

		@Override
		public boolean matches(final IScope scope, final Object switchValue)
			throws GamaRuntimeException {
			Object val = getValue(scope);
			return val == null ? switchValue == null : val.equals(switchValue);
		}

	}

	class MatchOne extends MatchExecuter {

		@Override
		public boolean matches(final IScope scope, final Object switchValue)
			throws GamaRuntimeException {
			Object val = getValue(scope);
			if ( val instanceof IContainer ) { return ((IContainer) val).contains(switchValue); }
			return Cast.asList(scope, val).contains(switchValue);
		}

		@Override
		public void acceptValue() throws GamlException {
			super.acceptValue();
			if ( constantValue != null ) {
				if ( !(constantValue instanceof IContainer) ) {
					if ( !(constantValue instanceof ILocation) ) {
						constantValue = Cast.asList(GAMA.getDefaultScope(), constantValue);
					}
				}
			}
		}
	}

	class MatchBetween extends MatchExecuter {

		@Override
		public boolean matches(final IScope scope, final Object switchValue)
			throws GamaRuntimeException {
			if ( !(switchValue instanceof Number) ) { throw new GamaRuntimeException(
				"Can only match if a number is in an interval. " + switchValue + " is not a number"); }
			Object val = value.value(scope);
			if ( !(val instanceof ILocation) ) {
				val = Cast.asPoint(scope, val);
			}
			double min = ((ILocation) val).getX();
			double max = ((ILocation) val).getY();
			double in = ((Number) switchValue).doubleValue();
			return in >= min && in <= max;
		}

		/**
		 * @see msi.gaml.commands.MatchCommand.MatchExecuter#acceptValue()
		 */
		@Override
		public void acceptValue() throws GamlException {
			super.acceptValue();
			if ( constantValue != null ) {
				if ( !(constantValue instanceof ILocation) ) {
					constantValue = Cast.asPoint(GAMA.getDefaultScope(), constantValue);
				}
			}

		}
	}

}