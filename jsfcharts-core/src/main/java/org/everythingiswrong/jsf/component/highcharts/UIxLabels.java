package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


@FacesComponent("org.everythingiswrong.jsf.chart.XLabels")
public class UIxLabels extends AbstractUIComponent {

	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		align, enabled, rotation, staggerLines, style, step, x, y;

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
	
	public java.lang.Boolean getEnabled() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.enabled, null);
	}
	public void setEnabled(java.lang.Boolean _enabled) {
		getStateHelper().put(PropertyKeys.enabled, _enabled);
		handleAttribute("enabled", _enabled);
	}
	
	public java.lang.String getRotation() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.rotation, null);
	}
	public void setRotation(java.lang.String _rotation) {
		getStateHelper().put(PropertyKeys.rotation, _rotation);
		handleAttribute("rotation", _rotation);
	}

	public java.lang.String getStaggerLines() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.staggerLines, null);
	}
	public void setStaggerLines(java.lang.String _staggerLines) {
		getStateHelper().put(PropertyKeys.staggerLines, _staggerLines);
		handleAttribute("staggerLines", _staggerLines);
	}

	public java.lang.String getStep() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.step, null);
	}
	public void setStep(java.lang.String _step) {
		getStateHelper().put(PropertyKeys.step, _step);
		handleAttribute("step", _step);
	}
	
		
	public java.lang.String getStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.style, null);
	}
	public void setStyle(java.lang.String _style) {
		getStateHelper().put(PropertyKeys.style, _style);
		handleAttribute("style", _style);
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
		StringBuffer dataBuffer = new StringBuffer();
		if (!(getParent() instanceof UIXAxisComponent)) {
			throw new IllegalAccessError("Parent of " + getClass() + " must be " + UIXAxisComponent.class);
		}
		UIXAxisComponent parent = (UIXAxisComponent) getParent();
		if (!parent.isFirstAttribute()) {
			dataBuffer.append(", ");
		} else {
			parent.setFirstAttribute(false);
		}
		dataBuffer.append("labels: { ");
		ResponseWriter writer = context.getResponseWriter();
		writer.append(dataBuffer.toString());
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
		dataBuffer.append(writeAttribute(PropertyKeys.rotation.name(), getRotation(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.enabled.name(), getEnabled(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.staggerLines.name(), getStaggerLines(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.step.name(), getStep(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.style.name(), getStyle(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.x.name(), getX(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.y.name(), getY(), updateFirstAttribute(dataBuffer.toString())));
		
		return dataBuffer.toString();
	}
}
