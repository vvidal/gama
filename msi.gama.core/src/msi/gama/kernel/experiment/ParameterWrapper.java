/**
 * Created by drogoul, 2 sept. 2013
 * 
 */
package msi.gama.kernel.experiment;

import java.util.List;
import msi.gama.runtime.IScope;
import msi.gama.runtime.exceptions.GamaRuntimeException;
import msi.gaml.types.IType;

/**
 * Class ParameterWrapper. Wraps entirely another parameter, allowing to redefine some of its methods in anonymous
 * subclasses
 * 
 * @author drogoul
 * @since 2 sept. 2013
 * 
 */
public abstract class ParameterWrapper implements IParameter {

	final IParameter wrapped;

	public ParameterWrapper(final IParameter wrapped) {
		this.wrapped = wrapped;
	}

	@Override
	public String getName() {
		return wrapped.getName();
	}

	@Override
	public String getTitle() {
		return wrapped.getTitle();
	}

	@Override
	public String getCategory() {
		return wrapped.getCategory();
	}

	@Override
	public String getUnitLabel() {
		return wrapped.getUnitLabel();
	}

	@Override
	public void setUnitLabel(final String label) {
		wrapped.setUnitLabel(label);
	}

	@Override
	public Integer getDefinitionOrder() {
		return wrapped.getDefinitionOrder();
	}

	@Override
	public void setValue(final Object value) {
		wrapped.setValue(value);
	}

	@Override
	public Object value(final IScope scope) throws GamaRuntimeException {
		return wrapped.value(scope);
	}

	@Override
	public IType getType() {
		return wrapped.getType();
	}

	//
	// @Override
	// public IType getContentType() {
	// return wrapped.getContentType();
	// }

	@Override
	public String toGaml() {
		return wrapped.toGaml();
	}

	@Override
	public Object getInitialValue(final IScope scope) {
		return wrapped.getInitialValue(scope);
	}

	@Override
	public Number getMinValue() {
		return wrapped.getMinValue();
	}

	@Override
	public Number getMaxValue() {
		return wrapped.getMaxValue();
	}

	@Override
	public List getAmongValue() {
		return wrapped.getAmongValue();
	}

	@Override
	public boolean isEditable() {
		return wrapped.isEditable();
	}

	@Override
	public Number getStepValue() {
		return wrapped.getStepValue();
	}

}
