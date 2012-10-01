package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


@FacesComponent("org.everythingiswrong.jsf.chart.Tooltip")
public class UITooltip extends AbstractUIComponent {

	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		borderColor, borderRadius, borderWidth, crosshairs, valueDecimals, valuePrefix, valueSuffix, shared;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getBorderColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.borderColor, null);
	}
	public void setBorderColor(java.lang.String _borderColor) {
		getStateHelper().put(PropertyKeys.borderColor, _borderColor);
		handleAttribute("borderColor", _borderColor);
	}
	
	public java.lang.String getBorderRadius() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.borderRadius, null);
	}
	public void setBorderRadius(java.lang.String _borderRadius) {
		getStateHelper().put(PropertyKeys.borderRadius, _borderRadius);
		handleAttribute("borderRadius", _borderRadius);
	}
	
	public java.lang.String getCrosshairs() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.crosshairs, null);
	}
	public void setCrosshairs(java.lang.String _crosshairs) {
		getStateHelper().put(PropertyKeys.crosshairs, _crosshairs);
		handleAttribute("crosshairs", _crosshairs);
	}
	
	public java.lang.String getBorderWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.borderWidth, null);
	}
	public void setBorderWidth(java.lang.String _borderWidth) {
		getStateHelper().put(PropertyKeys.borderWidth, _borderWidth);
		handleAttribute("borderWidth", _borderWidth);
	}
	
	public java.lang.String getValueDecimals() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.valueDecimals, null);
	}
	public void setValueDecimals(java.lang.String _valueDecimals) {
		getStateHelper().put(PropertyKeys.valueDecimals, _valueDecimals);
		handleAttribute("valueDecimals", _valueDecimals);
	}
	
	public java.lang.String getValuePrefix() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.valuePrefix, null);
	}
	public void setValuePrefix(java.lang.String _valuePrefix) {
		getStateHelper().put(PropertyKeys.valuePrefix, _valuePrefix);
		handleAttribute("valuePrefix", _valuePrefix);
	}
	
	public java.lang.String getValueSuffix() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.valueSuffix, null);
	}
	public void setValueSuffix(java.lang.String _valueSuffix) {
		getStateHelper().put(PropertyKeys.valueSuffix, _valueSuffix);
		handleAttribute("valueSuffix", _valueSuffix);
	}
	
	public java.lang.Boolean getShared() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.shared, null);
	}
	public void setShared(java.lang.Boolean _shared) {
		getStateHelper().put(PropertyKeys.shared, _shared);
		handleAttribute("shared", _shared);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append(", tooltip: { ");
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append(getData());
		writer.append("}");
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer();
		
		dataBuffer.append(writeAttribute(PropertyKeys.borderColor.name(), getBorderColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.borderRadius.name(), getBorderRadius(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.borderWidth.name(), getBorderWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.crosshairs.name(), getCrosshairs(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.valueDecimals.name(), getValueDecimals(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.valuePrefix.name(), getValuePrefix(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.valueSuffix.name(), getValueSuffix(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.shared.name(), getShared(), updateFirstAttribute(dataBuffer.toString())));
		updateFirstAttribute(dataBuffer.toString());
		return dataBuffer.toString();
	}
	
}
