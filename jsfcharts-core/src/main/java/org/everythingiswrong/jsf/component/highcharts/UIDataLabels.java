package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


@FacesComponent("org.everythingiswrong.jsf.chart.DataLabels")
public class UIDataLabels extends UIxLabels {

	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		shadow;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.Boolean getShadow() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.shadow, null);
	}
	public void setShadow(java.lang.Boolean _shadow) {
		getStateHelper().put(PropertyKeys.shadow, _shadow);
		handleAttribute("shadow", _shadow);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		UIComponent parent = getParent();
		boolean isFirstAttribute = false;
		if (parent instanceof UIPlotOptions) {
			AbstractUIComponent new_name = (UIPlotOptions) parent;
			isFirstAttribute = new_name.isFirstAttribute();
			new_name.setFirstAttribute(false);
		} else {
			throw new IllegalAccessError("Parent of " + getClass() + " must be " + UIPlotOptions.class);
		}
		
		StringBuffer dataBuffer = new StringBuffer();
		if (!isFirstAttribute) {
			dataBuffer.append(", ");
		}
		dataBuffer.append("dataLabels: { ");
		ResponseWriter writer = context.getResponseWriter();
		writer.append(dataBuffer.toString());
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append(super.getData());
		writer.append(getData());
		writer.append("}");
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer();

		dataBuffer.append(writeAttribute(PropertyKeys.shadow.name(), getShadow(), updateFirstAttribute(dataBuffer.toString())));
		updateFirstAttribute(dataBuffer.toString());
		return dataBuffer.toString();
	}
}
