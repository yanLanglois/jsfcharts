package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;
import java.util.List;

import javax.el.ValueExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.Serie")
public class UISerie extends AbstractUIData {
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public UISerie() {
		setRendererType(null);
	}
	
	protected enum PropertyKeys {

		label;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.label, null);
	}
	public void setLabel(java.lang.String _label) {
		getStateHelper().put(PropertyKeys.label, _label);
		handleAttribute("label", _label);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		
		Object[] numberTab = (Object[]) getValue();
		UIComponent parent = getParent();
		UIChartSeries series = null;
		if (parent instanceof UIChartSeries) {
			series = (UIChartSeries) parent;
		} else {
			throw new IllegalAccessError("Parent of " + getClass() + " must be " + UIChartSeries.class);
		}
		
		String data = "";
		String isFirstSerieKey = "isFirstSerieFor" + series.getId();
		if (numberTab != null && numberTab.length > 0) {
			if(context.getAttributes().containsKey(isFirstSerieKey)) {
				data = data + ", ";
			} else {
				context.getAttributes().put(isFirstSerieKey, false);
			}
			
			data = data + "{name : '" + getLabel() + "', data: [";
			for (int i = 0; i < numberTab.length; i++) {
				if (i > 0) {
					data = data + ",";
				}
				data = data + ((Double) numberTab[i]).doubleValue();
//				{name: 'Jane',data: [1, 0, 4]}, {name: 'John',data: [5, 7, 3]}]
			}
			data = data + "]";
			System.out.println("data : " + data);
		}
		ResponseWriter writer = context.getResponseWriter();
		writer.write(data);
	}
	
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.write("}");
	}
}
