package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


@FacesComponent("org.everythingiswrong.jsf.chart.SeriesOptions")
public class UISeriesOptions extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		allowPointSelect;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getAllowPointSelect() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.allowPointSelect, null);
	}
	public void setAllowPointSelect(java.lang.String _allowPointSelect) {
		getStateHelper().put(PropertyKeys.allowPointSelect, _allowPointSelect);
		handleAttribute("allowPointSelect", _allowPointSelect);
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
		dataBuffer.append("series: {");
		dataBuffer.append(getData());
		ResponseWriter writer = context.getResponseWriter();
		writer.append(dataBuffer.toString());
		
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append("}");
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer("");
		dataBuffer.append(writeAttribute(PropertyKeys.allowPointSelect.name(), getAllowPointSelect(), updateFirstAttribute(dataBuffer.toString())));
		
		return dataBuffer.toString();
	}
	
}
