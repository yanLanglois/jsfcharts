package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.yAxis")
public class UIYAxisComponent extends UIXAxisComponent {
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.write(", yAxis: {");
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		String axis = getAxisContent();
		axis += "}";
		ResponseWriter writer = context.getResponseWriter();
		writer.write(axis);
	}
	
	
}
