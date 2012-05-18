package org.everythingiswrong.jsf.component.highcharts;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;

@ResourceDependencies({
	@ResourceDependency(library="jquery", name="1.7.1/jquery.min.js"),
	@ResourceDependency(library="highcharts", name="highcharts.js")
})
@FacesComponent("org.everythingiswrong.jsf.chart.Chart")
public class UIHighChart extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	private static final String DEFAULT_RENDERER = "org.everythingiswrong.jsf.Chart";
	
	protected enum PropertyKeys {

		type, width, height, marginTop, marginLeft, marginBottom, marginRight;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public UIHighChart() {
		setRendererType(DEFAULT_RENDERER);
	}

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.type, null);
	}
	public void setType(java.lang.String _type) {
		getStateHelper().put(PropertyKeys.type, _type);
		handleAttribute("type", _type);
	}
	
	public java.lang.String getWitdh() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.width, null);
	}
	public void setWidth(java.lang.String _width) {
		getStateHelper().put(PropertyKeys.width, _width);
		handleAttribute("width", _width);
	}
	
	public java.lang.String getHeight() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.height, null);
	}
	public void setHeight(java.lang.String _height) {
		getStateHelper().put(PropertyKeys.height, _height);
		handleAttribute("height", _height);
	}
	
	public java.lang.String getMarginTop() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.marginTop, null);
	}
	public void setMarginTop(java.lang.String _marginTop) {
		getStateHelper().put(PropertyKeys.marginTop, _marginTop);
		handleAttribute("marginTop", _marginTop);
	}
	public java.lang.String getMarginBottom() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.marginBottom, null);
	}
	public void setMarginBottom(java.lang.String _marginBottom) {
		getStateHelper().put(PropertyKeys.marginBottom, _marginBottom);
		handleAttribute("marginBottom", _marginBottom);
	}
	public java.lang.String getMarginLeft() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.marginLeft, null);
	}
	public void setMarginLeft(java.lang.String _marginLeft) {
		getStateHelper().put(PropertyKeys.marginLeft, _marginLeft);
		handleAttribute("marginLeft", _marginLeft);
	}
	public java.lang.String getMarginRight() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.marginRight, null);
	}
	public void setMarginRight(java.lang.String _marginRight) {
		getStateHelper().put(PropertyKeys.marginRight, _marginRight);
		handleAttribute("marginRight", _marginRight);
	}
	
}
