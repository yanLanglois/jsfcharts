package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.Title")
public class UIChartTitle extends UIChartSubtitle {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		margin;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getMargin() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.margin, null);
	}
	public void setMargin(java.lang.String _margin) {
		getStateHelper().put(PropertyKeys.margin, _margin);
		handleAttribute("margin", _margin);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		UIComponent parent = getParent();
		boolean isFirstAttribute = false;
		if (parent instanceof AbstractUIComponent) {
			AbstractUIComponent new_name = (AbstractUIComponent) parent;
			isFirstAttribute = new_name.isFirstAttribute();
			new_name.setFirstAttribute(false);
		}
		
		StringBuffer dataBuffer = new StringBuffer();
		if (!isFirstAttribute) {
			dataBuffer.append(", ");
		}
		dataBuffer.append("title: {");
		dataBuffer.append(getData());
		dataBuffer.append(writeAttribute(PropertyKeys.margin.name(), getMargin(), false));
		ResponseWriter writer = context.getResponseWriter();
		writer.append(dataBuffer.toString());
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.write("}");
	}
	
}
