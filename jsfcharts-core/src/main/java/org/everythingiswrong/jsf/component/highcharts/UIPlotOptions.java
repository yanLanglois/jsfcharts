package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent("org.everythingiswrong.jsf.chart.PlotOptions")
public class UIPlotOptions extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	private int nbOptionsTag = 0;

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		if (!(getParent() instanceof UIHighChart)) {
			throw new IllegalAccessError("Parent of " + getClass() + " must be " + UIHighChart.class);
		}
		ResponseWriter writer = context.getResponseWriter();
		writer.append(", plotOptions : { ");
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.append("}");
	}
	
	public int getNbOptionsTag() {
		return nbOptionsTag;
	}

	public void setNbOptionsTag(int nbOptionsTag) {
		this.nbOptionsTag = nbOptionsTag;
	}
}
