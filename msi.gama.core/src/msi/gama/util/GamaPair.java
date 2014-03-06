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
package msi.gama.util;

import java.util.Map;
import msi.gama.common.util.StringUtils;
import msi.gama.metamodel.shape.ILocation;
import msi.gama.precompiler.GamlAnnotations.getter;
import msi.gama.precompiler.GamlAnnotations.var;
import msi.gama.precompiler.GamlAnnotations.vars;
import msi.gama.precompiler.*;
import msi.gama.runtime.*;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gama.util.matrix.IMatrix;
import msi.gaml.operators.Cast;
import msi.gaml.types.*;

/**
 * The Class GamaPair.
 */
@vars({ @var(name = GamaPair.KEY, type = ITypeProvider.FIRST_KEY_TYPE),
	@var(name = GamaPair.VALUE, type = ITypeProvider.FIRST_CONTENT_TYPE) })
public class GamaPair<K, V> implements IContainer<Integer, Object>, IContainer.Addressable<Integer, Object>,
	Map.Entry<K, V> {

	// TODO Makes it inherit from Map.Entry<K,V> in order to tighten the link between it and GamaMap
	// (have the entrySet() of GamaMap built from GamaPairs)
	// FIXME: This has still to be implemented

	public static final String KEY = "key";
	public static final String VALUE = "value";

	public K key;
	public V value;

	public GamaPair(final K k, final V v) {
		key = k;
		value = v;
	}

	public GamaPair(final Map.Entry<K, V> entry) {
		this(entry.getKey(), entry.getValue());
	}

	public boolean equals(final GamaPair p) {
		return key.equals(p.key) && value.equals(p.value);
	}

	@Override
	public boolean equals(final Object a) {
		if ( a == null ) { return false; }
		if ( a instanceof GamaPair ) { return equals((GamaPair) a); }
		return false;
	}

	@Override
	@getter(KEY)
	public K getKey() {
		return key;
	}

	// FIXME: To be removed
	public K first() {
		return key;
	}

	@Override
	@getter(VALUE)
	public V getValue() {
		return value;
	}

	// FIXME: To be removed
	public V last() {
		return value;
	}

	@Override
	public String stringValue(final IScope scope) throws GamaRuntimeException {
		return Cast.asString(scope, key) + "::" + Cast.asString(scope, value);
	}

	@Override
	public String toGaml() {
		return StringUtils.toGaml(key) + "::" + StringUtils.toGaml(value);
	}

	@Override
	public String toString() {
		return (key == null ? "nil" : key.toString()) + "::" + (value == null ? "nil" : value.toString());
	}

	@Override
	public GamaPair<K, V> copy(final IScope scope) {
		return new GamaPair(key, value);
	}

	@Override
	public V setValue(final V value) {
		this.value = value;
		return value;
	}

	/**
	 * Method get()
	 * @see msi.gama.util.IContainer#get(msi.gama.runtime.IScope, java.lang.Object)
	 */
	@Override
	public Object get(final IScope scope, final Integer index) throws GamaRuntimeException {
		return index == 0 ? key : value;
	}

	/**
	 * Method getFromIndicesList()
	 * @see msi.gama.util.IContainer#getFromIndicesList(msi.gama.runtime.IScope, msi.gama.util.IList)
	 */
	@Override
	public Object getFromIndicesList(final IScope scope, final IList indices) throws GamaRuntimeException {
		return null;
	}

	/**
	 * Method contains()
	 * @see msi.gama.util.IContainer#contains(msi.gama.runtime.IScope, java.lang.Object)
	 */
	@Override
	public boolean contains(final IScope scope, final Object o) throws GamaRuntimeException {
		return o == null ? key == null || value == null : o.equals(key) || o.equals(value);
	}

	/**
	 * Method firstValue()
	 * @see msi.gama.util.IContainer#firstValue(msi.gama.runtime.IScope)
	 */
	@Override
	public Object firstValue(final IScope scope) throws GamaRuntimeException {
		return key;
	}

	/**
	 * Method lastValue()
	 * @see msi.gama.util.IContainer#lastValue(msi.gama.runtime.IScope)
	 */
	@Override
	public Object lastValue(final IScope scope) throws GamaRuntimeException {
		return value;
	}

	/**
	 * Method length()
	 * @see msi.gama.util.IContainer#length(msi.gama.runtime.IScope)
	 */
	@Override
	public int length(final IScope scope) {
		return 2;
	}

	/**
	 * Method isEmpty()
	 * @see msi.gama.util.IContainer#isEmpty(msi.gama.runtime.IScope)
	 */
	@Override
	public boolean isEmpty(final IScope scope) {
		return false;
	}

	/**
	 * Method reverse()
	 * @see msi.gama.util.IContainer#reverse(msi.gama.runtime.IScope)
	 */
	@Override
	public IContainer reverse(final IScope scope) throws GamaRuntimeException {
		return new GamaPair(value, key);
	}

	/**
	 * Method anyValue()
	 * @see msi.gama.util.IContainer#anyValue(msi.gama.runtime.IScope)
	 */
	@Override
	public Object anyValue(final IScope scope) {
		int i = GAMA.getRandom().between(0, 1);
		return i == 0 ? key : value;
	}

	/**
	 * Method listValue()
	 * @see msi.gama.util.IContainer#listValue(msi.gama.runtime.IScope, msi.gaml.types.IType)
	 */
	@Override
	public IList listValue(final IScope scope, final IType contentType) {
		return GamaList.with(key, value);
	}

	/**
	 * Method matrixValue()
	 * @see msi.gama.util.IContainer#matrixValue(msi.gama.runtime.IScope, msi.gaml.types.IType)
	 */
	@Override
	public IMatrix matrixValue(final IScope scope, final IType contentType) {
		return GamaMatrixType.from(scope, listValue(scope, Types.NO_TYPE));
	}

	/**
	 * Method matrixValue()
	 * @see msi.gama.util.IContainer#matrixValue(msi.gama.runtime.IScope, msi.gaml.types.IType,
	 *      msi.gama.metamodel.shape.ILocation)
	 */
	@Override
	public IMatrix matrixValue(final IScope scope, final IType contentType, final ILocation size) {
		return GamaMatrixType.from(scope, listValue(scope, Types.NO_TYPE));
	}

	/**
	 * Method mapValue()
	 * @see msi.gama.util.IContainer#mapValue(msi.gama.runtime.IScope, msi.gaml.types.IType, msi.gaml.types.IType)
	 */
	@Override
	public GamaMap mapValue(final IScope scope, final IType keyType, final IType contentType) {
		return new GamaMap(new GamaPair(keyType.cast(scope, key, null), contentType.cast(scope, value, null)));
	}

	/**
	 * Method iterable()
	 * @see msi.gama.util.IContainer#iterable(msi.gama.runtime.IScope)
	 */
	@Override
	public java.lang.Iterable iterable(final IScope scope) {
		return listValue(scope, Types.NO_TYPE);
	}

}
