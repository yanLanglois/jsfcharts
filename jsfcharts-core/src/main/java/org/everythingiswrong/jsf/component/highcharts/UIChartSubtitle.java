package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.Subtitle")
public class UIChartSubtitle extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		align, floating, text, style, verticalAlign, x, y;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getAlign() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.align, null);
	}
	public void setAlign(java.lang.String _align) {
		getStateHelper().put(PropertyKeys.align, _align);
		handleAttribute("align", _align);
	}
	
	public java.lang.String getFloating() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.floating, null);
	}
	public void setFloating(java.lang.String _floating) {
		getStateHelper().put(PropertyKeys.floating, _floating);
		handleAttribute("floating", _floating);
	}
	
	public java.lang.String getText() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.text, null);
	}
	public void setText(java.lang.String _text) {
		getStateHelper().put(PropertyKeys.text, _text);
		handleAttribute("text", _text);
	}
	
	
	public java.lang.String getStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.style, null);
	}
	public void setStyle(java.lang.String _style) {
		getStateHelper().put(PropertyKeys.style, _style);
		handleAttribute("style", _style);
	}
	
	
	public java.lang.String getVerticalAlign() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.verticalAlign, null);
	}
	public void setVerticalAlign(java.lang.String _verticalAlign) {
		getStateHelper().put(PropertyKeys.verticalAlign, _verticalAlign);
		handleAttribute("verticalAlign", _verticalAlign);
	}
	
	
	public java.lang.String getX() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.x, null);
	}
	public void setX(java.lang.String _x) {
		getStateHelper().put(PropertyKeys.align, _x);
		handleAttribute("x", _x);
	}
	
	public java.lang.String getY() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.y, null);
	}
	public void setY(java.lang.String _y) {
		getStateHelper().put(PropertyKeys.y, _y);
		handleAttribute("y", _y);
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		String data = ", subtitle: {";
		data += getData();
		data += "}";
		ResponseWriter writer = context.getResponseWriter();
		writer.write(data);
		
	}
	
	protected String getData() {
		if (getText() == null || getText().equals("")) {
			throw new IllegalArgumentException("text is mandatory for " + this.getClass().getName());
		}
		StringBuffer dataBuffer = new StringBuffer();
		
		dataBuffer.append(writeAttribute(PropertyKeys.text.name(), getText(), true));
		dataBuffer.append(writeAttribute(PropertyKeys.align.name(), getAlign(), false));
		dataBuffer.append(writeAttribute(PropertyKeys.floating.name(), getFloating(), false));
		dataBuffer.append(writeAttribute(PropertyKeys.style.name(), getStyle(), false));
		dataBuffer.append(writeAttribute(PropertyKeys.verticalAlign.name(), getVerticalAlign(), false));
		dataBuffer.append(writeAttribute(PropertyKeys.x.name(), getX(), false));
		dataBuffer.append(writeAttribute(PropertyKeys.y.name(), getY(), false));
		
		return dataBuffer.toString();
	}
}
