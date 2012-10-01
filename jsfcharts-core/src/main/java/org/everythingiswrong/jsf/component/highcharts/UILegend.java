package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


@FacesComponent("org.everythingiswrong.jsf.chart.Legend")
public class UILegend extends AbstractUIComponent {

	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		align, backgroundColor, borderColor, borderRadius, borderWidth, enabled, floating, 
		// itemHiddenStyle, itemHoverStyle, itemStyle
		itemWidth, layout,
		// labelFormatter, lineHeight, margin,
		reversed,
		// rtl,
		shadow, style,
		// symbolPadding, symbolWidth,
		verticalAlign, width, x, y
		;

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
	
	public java.lang.String getBackgroundColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.backgroundColor, null);
	}
	public void setBackgroundColor(java.lang.String _backgroundColor) {
		getStateHelper().put(PropertyKeys.backgroundColor, _backgroundColor);
		handleAttribute("backgroundColor", _backgroundColor);
	}
	
	public java.lang.Boolean getEnabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.enabled, null);
	}
	public void setEnabled(java.lang.Boolean _enabled) {
		getStateHelper().put(PropertyKeys.enabled, _enabled);
		handleAttribute("enabled", _enabled);
	}

	public java.lang.Boolean getFloating() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.floating, null);
	}
	public void setFloating(java.lang.Boolean _floating) {
		getStateHelper().put(PropertyKeys.floating, _floating);
		handleAttribute("floating", _floating);
	}
	
	public java.lang.String getItemWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.itemWidth, null);
	}
	public void setItemWidth(java.lang.String _itemWidth) {
		getStateHelper().put(PropertyKeys.itemWidth, _itemWidth);
		handleAttribute("itemWidth", _itemWidth);
	}

	public java.lang.String getLayout() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.layout, null);
	}
	public void setLayout(java.lang.String _layout) {
		getStateHelper().put(PropertyKeys.layout, _layout);
		handleAttribute("layout", _layout);
	}
	
	public java.lang.Boolean getReversed() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.reversed, null);
	}
	public void setReversed(java.lang.Boolean _reversed) {
		getStateHelper().put(PropertyKeys.reversed, _reversed);
		handleAttribute("reversed", _reversed);
	}
	
	public java.lang.Boolean getShadow() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.shadow, null);
	}
	public void setShadow(java.lang.Boolean _shadow) {
		getStateHelper().put(PropertyKeys.shadow, _shadow);
		handleAttribute("shadow", _shadow);
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

	public java.lang.String getBorderWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.borderWidth, null);
	}
	public void setBorderWidth(java.lang.String _borderWidth) {
		getStateHelper().put(PropertyKeys.borderWidth, _borderWidth);
		handleAttribute("borderWidth", _borderWidth);
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
	
	public java.lang.String getWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.width, null);
	}
	public void setWidth(java.lang.String _width) {
		getStateHelper().put(PropertyKeys.width, _width);
		handleAttribute("width", _width);
	}
	
	public java.lang.String getX() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.x, null);
	}
	public void setX(java.lang.String _x) {
		getStateHelper().put(PropertyKeys.x, _x);
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
	public void encodeBegin(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append(", legend: { ");
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append(getData());
		writer.append("}");
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer();
		
		dataBuffer.append(writeAttribute(PropertyKeys.align.name(), getAlign(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.backgroundColor.name(), getBackgroundColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.borderColor.name(), getBorderColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.borderRadius.name(), getBorderRadius(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.borderWidth.name(), getBorderWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.enabled.name(), getEnabled(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.floating.name(), getFloating(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.itemWidth.name(), getItemWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.layout.name(), getLayout(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.reversed.name(), getReversed(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.shadow.name(), getShadow(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.style.name(), getStyle(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.verticalAlign.name(), getVerticalAlign(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.width.name(), getWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.x.name(), getX(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.y.name(), getY(), updateFirstAttribute(dataBuffer.toString())));
		updateFirstAttribute(dataBuffer.toString());
		return dataBuffer.toString();
	}
}
