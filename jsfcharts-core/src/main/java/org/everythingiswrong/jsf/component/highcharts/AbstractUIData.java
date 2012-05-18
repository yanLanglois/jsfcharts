package org.everythingiswrong.jsf.component.highcharts;

import java.util.List;

import javax.el.ValueExpression;
import javax.faces.component.UIComponentBase;
import javax.faces.component.UIData;

public abstract class AbstractUIData extends UIData {

	public void handleAttribute(String name, Object value) {
		List<String> setAttributes = (List<String>) this.getAttributes().get("javax.faces.component.UIComponentBase.attributesThatAreSet");
		if(setAttributes != null) {
			if(value == null) {
				ValueExpression ve = getValueExpression(name);
				if(ve == null) {
					setAttributes.remove(name);
				} else if(!setAttributes.contains(name)) {
					setAttributes.add(name);
				}
			}
		}
	}
	
}
