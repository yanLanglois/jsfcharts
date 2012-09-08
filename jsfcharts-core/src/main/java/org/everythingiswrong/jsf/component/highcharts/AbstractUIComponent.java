package org.everythingiswrong.jsf.component.highcharts;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.el.ValueExpression;
import javax.faces.component.UIComponentBase;

import org.everythingiswrong.jsf.component.highcharts.UIXAxisComponent.PropertyKeys;
import org.everythingiswrong.jsf.component.highcharts.utils.NumberUtils;

public abstract class AbstractUIComponent extends UIComponentBase {

	final static private String STYLE = "style";
	
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
	
	protected String writeAttribute(String propertyName, Object propertyValue, boolean firstAttribute) {
		String resultat = "";
		if (propertyValue != null && !propertyValue.equals("")) {
			if (!firstAttribute) {
				resultat = ", ";
			}
			resultat += propertyName + ": ";
			if (propertyValue instanceof Arrays) {
				Arrays new_name = (Arrays) propertyValue;
				resultat += getDataFromTable(Arrays.asList(new_name));
			} else if (propertyValue instanceof List<?>) {
				resultat += getDataFromTable((List<?>) propertyValue);
			} else if (propertyValue instanceof String) {
				// Add cote for Js String
				if (((String) propertyValue).trim().matches("^#[0-9A-Fa-f]{6}$")) {	// if given color is like #000000
					resultat += computeAttributeForJs(propertyName, propertyValue);
				} else {
					try {
						Number number = NumberUtils.createNumber((String) propertyValue);
						resultat += propertyValue.toString();
					} catch (NumberFormatException e) {
						resultat += computeAttributeForJs(propertyName, propertyValue);
					}
				}
				
			} else {
				resultat += propertyValue.toString();
			}
			
		}
		return resultat;
	}
	
	private String getDataFromTable(List<?> list) {
		String data = list.toString().replaceAll("\"", "'");
		data = data .replaceAll("\\s", "").replaceAll(",", "','");
		return "['" + data.substring(1, data.length() - 1) + "']";
	}
	
	protected boolean firstAttribute = true;
	
	public boolean isFirstAttribute() {
		return firstAttribute;
	}
	public void setFirstAttribute(boolean firstAttribute) {
		this.firstAttribute = firstAttribute;
	}
	
	protected boolean updateFirstAttribute(String data) {
		firstAttribute = firstAttribute && (data == null || data.length() == 0); 
		return firstAttribute;
	}
	
	private String computeAttributeForJs(String propertyName, Object propertyValue) {
		String resultat;
		if (STYLE.equals(propertyName)) {
			resultat = "{" + propertyValue.toString().replaceAll(";", ",") + "}";
//			System.err.println("resultat : " + resultat);
		} else {
			resultat = "'" + propertyValue.toString() + "'";
		}
		return resultat;
	}
	
}
