package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.Marker")
public class UIMarker extends AbstractUIMarker {

	public static final String COMPONENT_FAMILY = "org.everythingiswrong";

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		symbol;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getSymbol() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.symbol, null);
	}
	public void setSymbol(java.lang.String _symbol) {
		getStateHelper().put(PropertyKeys.symbol, _symbol);
		handleAttribute("symbol", _symbol);
	}
	
	public java.lang.Boolean getEnabled() {
		return super.getEnabled();
	}
	public void setEnabled(java.lang.Boolean _enabled) {
		super.setEnabled(_enabled);
	}
	
	public java.lang.String getFillColor() {
		return super.getFillColor();
	}
	public void setFillColor(java.lang.String _fillColor) {
		super.setFillColor(_fillColor);
	}
	
	public java.lang.String getLineColor() {
		return super.getLineColor();
	}
	public void setLineColor(java.lang.String _lineColor) {
		super.setLineColor(_lineColor);
	}
	
	public java.lang.String getLineWidth() {
		return super.getLineWidth();
	}
	public void setLineWidth(java.lang.String _lineWidth) {
		super.setLineWidth(_lineWidth);
	}
	
	public java.lang.String getRaduis() {
		return super.getRaduis();
	}
	public void setRaduis(java.lang.String _raduis) {
		super.setRaduis(_raduis);
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
		dataBuffer.append("marker: { states :{");
		ResponseWriter writer = context.getResponseWriter();
		writer.append(dataBuffer.toString());
		
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append("}");	// End of states
		writer.append(super.getData());
		writer.append(getData());
		writer.append("}");
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer();

		dataBuffer.append(writeAttribute(PropertyKeys.symbol.name(), getSymbol(), updateFirstAttribute(dataBuffer.toString())));
		updateFirstAttribute(dataBuffer.toString());
		return dataBuffer.toString();
	}
	
}
