package org.everythingiswrong.jsf.component.highcharts;


//abstract 
public class AbstractUIMarker extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		enabled, fillColor, lineColor, lineWidth, raduis;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.Boolean getEnabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.enabled, null);
	}
	public void setEnabled(java.lang.Boolean _enabled) {
		getStateHelper().put(PropertyKeys.enabled, _enabled);
		handleAttribute("enabled", _enabled);
	}
	
	public java.lang.String getFillColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.fillColor, null);
	}
	public void setFillColor(java.lang.String _fillColor) {
		getStateHelper().put(PropertyKeys.fillColor, _fillColor);
		handleAttribute("fillColor", _fillColor);
	}
	
	public java.lang.String getLineColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.lineColor, null);
	}
	public void setLineColor(java.lang.String _lineColor) {
		getStateHelper().put(PropertyKeys.lineColor, _lineColor);
		handleAttribute("lineColor", _lineColor);
	}
	
	public java.lang.String getLineWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.lineWidth, null);
	}
	public void setLineWidth(java.lang.String _lineWidth) {
		getStateHelper().put(PropertyKeys.lineWidth, _lineWidth);
		handleAttribute("lineWidth", _lineWidth);
	}
	
	public java.lang.String getRaduis() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.raduis, null);
	}
	public void setRaduis(java.lang.String _raduis) {
		getStateHelper().put(PropertyKeys.raduis, _raduis);
		handleAttribute("raduis", _raduis);
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer();

		dataBuffer.append(writeAttribute(PropertyKeys.enabled.name(), getEnabled(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.fillColor.name(), getFillColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.lineColor.name(), getLineColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.lineWidth.name(), getLineWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.raduis.name(), getRaduis(), updateFirstAttribute(dataBuffer.toString())));
		
		return dataBuffer.toString();
	}
	
}
