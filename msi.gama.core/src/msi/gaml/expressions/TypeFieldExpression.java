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
package msi.gaml.expressions;

import msi.gaml.compilation.GamaHelper;
import msi.gaml.types.*;

public class TypeFieldExpression extends UnaryOperator {

	final static int[] nullInts = new int[0];

	public TypeFieldExpression(final String n, final int tProv, final int ctProv, final int ktProv, final GamaHelper g) {
		super(Types.NO_TYPE, g, true, tProv, ctProv, ktProv, nullInts, false, null);
		setName(n);
	}

	@Override
	public TypeFieldExpression copy() {
		TypeFieldExpression copy =
			new TypeFieldExpression(name, typeProvider, contentTypeProvider, keyTypeProvider, helper);
		copy.doc = doc;
		return copy;
	}

	@Override
	public String toGaml() {
		return child.toGaml() + "." + name;
	}

	@Override
	public String toString() {
		if ( child == null ) { return signature.toString() + "." + name; }
		return child.toGaml() + "." + name;
	}

	@Override
	public String getDocumentation() {
		if ( child != null ) { return "Defined on objects of type " + child.getType().getTitle(); }
		// return "Available for objects of type " + signature.get(0);
		return "";
	}

	@Override
	public String getTitle() {
		return "field " + getName() + " of type " + getType().getTitle();
	}

	public void setSignature(final IType t) {
		signature = new Signature(t);
	}

}
