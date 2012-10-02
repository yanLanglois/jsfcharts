package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.PlotOptions")
public class UIPlotOptions extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		allowPointSelect, animation, color, connectNulls, cropThreshold, cursor, dashStyle, enableMouseTracking,
		//id,
		lineWidth, pointStart, stacking;

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

	public java.lang.Boolean getAnimation() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.animation, null);
	}
	public void setAnimation(java.lang.Boolean _animation) {
		getStateHelper().put(PropertyKeys.animation, _animation);
		handleAttribute("animation", _animation);
	}

	public java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.color, null);
	}
	public void setColor(java.lang.String _color) {
		getStateHelper().put(PropertyKeys.color, _color);
		handleAttribute("color", _color);
	}

	public java.lang.Boolean getConnectNulls() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.connectNulls, null);
	}
	public void setConnectNulls(java.lang.Boolean _connectNulls) {
		getStateHelper().put(PropertyKeys.connectNulls, _connectNulls);
		handleAttribute("connectNulls", _connectNulls);
	}

	public java.lang.String getCropThreshold() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.cropThreshold, null);
	}
	public void setCropThreshold(java.lang.String _cropThreshold) {
		getStateHelper().put(PropertyKeys.cropThreshold, _cropThreshold);
		handleAttribute("cropThreshold", _cropThreshold);
	}

	public java.lang.String getCursor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.cursor, null);
	}
	public void setCursor(java.lang.String _cursor) {
		getStateHelper().put(PropertyKeys.cursor, _cursor);
		handleAttribute("cursor", _cursor);
	}

	public java.lang.String getDashStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.dashStyle, null);
	}
	public void setDashStyle(java.lang.String _dashStyle) {
		getStateHelper().put(PropertyKeys.dashStyle, _dashStyle);
		handleAttribute("dashStyle", _dashStyle);
	}

	public java.lang.Boolean getEnableMouseTracking() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.enableMouseTracking, null);
	}
	public void setEnableMouseTracking(java.lang.Boolean _enableMouseTracking) {
		getStateHelper().put(PropertyKeys.enableMouseTracking, _enableMouseTracking);
		handleAttribute("enableMouseTracking", _enableMouseTracking);
	}

	public java.lang.String getLineWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.lineWidth, null);
	}
	public void setLineWidth(java.lang.String _lineWidth) {
		getStateHelper().put(PropertyKeys.lineWidth, _lineWidth);
		handleAttribute("lineWidth", _lineWidth);
	}

	public java.lang.String getPointStart() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.pointStart, null);
	}
	public void setPointStart(java.lang.String _pointStart) {
		getStateHelper().put(PropertyKeys.pointStart, _pointStart);
		handleAttribute("pointStart", _pointStart);
	}
	
	public java.lang.String getStacking() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.stacking, null);
	}
	public void setStacking(java.lang.String _stacking) {
		getStateHelper().put(PropertyKeys.stacking, _stacking);
		handleAttribute("stacking", _stacking);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		if (!(getParent() instanceof UIHighChart)) {
			throw new IllegalAccessError("Parent of " + getClass() + " must be " + UIHighChart.class);
		}
		ResponseWriter writer = context.getResponseWriter();
		writer.append(", plotOptions : { ");
		String type = ((UIHighChart) getParent()).getType();
		if (type == null) {
			type = "series";
		}
		writer.append(type).append(": {");
		writer.append(getData());
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append("}}");
	}
	
	protected String getData() {
		StringBuffer dataBuffer = new StringBuffer("");
		dataBuffer.append(writeAttribute(PropertyKeys.allowPointSelect.name(), getAllowPointSelect(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.animation.name(), getAnimation(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.color.name(), getColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.connectNulls.name(), getConnectNulls(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.cropThreshold.name(), getCropThreshold(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.cursor.name(), getCursor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.dashStyle.name(), getDashStyle(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.enableMouseTracking.name(), getEnableMouseTracking(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.lineWidth.name(), getLineWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.pointStart.name(), getPointStart(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.stacking.name(), getStacking(), updateFirstAttribute(dataBuffer.toString())));
		updateFirstAttribute(dataBuffer.toString());
		return dataBuffer.toString();
	}
}
