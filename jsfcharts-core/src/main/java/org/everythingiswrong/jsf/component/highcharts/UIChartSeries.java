package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;
import java.util.List;

import javax.el.ValueExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.Series")
public class UIChartSeries extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public UIChartSeries() {
		setRendererType(null);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		UIComponent parent = getParent();
		if (!(parent instanceof UIHighChart)) {
			throw new IllegalAccessError("Parent of " + getClass() + " must be " + UIHighChart.class);
		}
		
		ResponseWriter writer = context.getResponseWriter();
		writer.write(", series : [");
	}
	
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.write("]");
	}
}
