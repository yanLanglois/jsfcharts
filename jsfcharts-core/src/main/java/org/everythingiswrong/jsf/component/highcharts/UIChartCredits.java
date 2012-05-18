package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;
import java.util.List;

import javax.el.ValueExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.Credit")
public class UIChartCredits extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		enabled, position, href, text, style;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getEnabled() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.enabled, null);
	}
	public void setEnabled(java.lang.String _enabled) {
		getStateHelper().put(PropertyKeys.enabled, _enabled);
		handleAttribute("enabled", _enabled);
	}
	
	public java.lang.String getPosition() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.position, null);
	}
	public void setPosition(java.lang.String _position) {
		getStateHelper().put(PropertyKeys.position, _position);
		handleAttribute("position", _position);
	}

	public java.lang.String getHref() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.href, null);
	}
	public void setHref(java.lang.String _href) {
		getStateHelper().put(PropertyKeys.href, _href);
		handleAttribute("href", _href);
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
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		String data = ", credits: {";
		int nbAtt = 0;
		if (getEnabled() != null && !getEnabled().equals("")) {
			data += "enabled:" + getEnabled();
			nbAtt++;
		}
		if (getPosition() != null && !getPosition().equals("")) {
			if (nbAtt > 0) data += ", ";
			data += "position:" + getPosition();
			nbAtt++;
		}
		if (getHref() != null && !getHref().equals("")) {
			if (nbAtt > 0) data += ", ";
			data += "href:'" + getHref() + "'";
			nbAtt++;
		}
		if (getStyle() != null && !getStyle().equals("")) {
			if (nbAtt > 0) data += ", ";
			data += "style:" + getStyle();
			nbAtt++;
		}
		if (getText() != null && !getText().equals("")) {
			if (nbAtt > 0) data += ", ";
			data += "text:'" + getText() + "'";
			nbAtt++;
		}
		data += "}";
		ResponseWriter writer = context.getResponseWriter();
		writer.write(data);
	}
}
