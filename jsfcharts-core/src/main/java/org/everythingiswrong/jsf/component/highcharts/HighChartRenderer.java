package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import javax.faces.render.Renderer;

@FacesRenderer(componentFamily="org.everythingiswrong",
	rendererType="org.everythingiswrong.jsf.chart.Chart")
public class HighChartRenderer extends Renderer {
	
	protected void renderChildren(FacesContext facesContext, UIComponent component) throws IOException {
		for (Iterator<UIComponent> iterator = component.getChildren().iterator(); iterator.hasNext();) {
			UIComponent child = (UIComponent) iterator.next();
			renderChild(facesContext, child);
		}
	}

	protected void renderChild(FacesContext facesContext, UIComponent child) throws IOException {
		if (!child.isRendered()) {
			return;
		}
		
		child.encodeBegin(facesContext);
		
		if (child.getRendersChildren()) {
			child.encodeChildren(facesContext);
		} else {
			renderChildren(facesContext, child);
		}
		child.encodeEnd(facesContext);
	}
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
		UIHighChart highChart = (UIHighChart) component;
		String clientId = highChart.getClientId(context);
		ResponseWriter writer = context.getResponseWriter();
		// container for the js chart
		writer.startElement("div", null);
		writer.writeAttribute("id", clientId, "id");
		writer.endElement("div");
		// js script
		writer.startElement("script", null);
		writer.writeAttribute("type", "text/javascript", null);
		
		String chartJsName = "chart" + clientId.replaceAll("\\s", "_").replaceAll(":", "_");
		
		writer.write("var " + chartJsName + ";");
		
		writer.write("$(document).ready(function() { " + chartJsName + " = new Highcharts.Chart({ ");
		writer.write("chart: {renderTo: '" +  clientId + "'");
		if (highChart.getType() != null) {
			writer.write(", type : " + highChart.getType());
		}
		if (highChart.getWitdh() != null) {
			writer.write(", width : " + highChart.getWitdh());
		}
		if (highChart.getHeight() != null) {
			writer.write(", height : " + highChart.getHeight());
		}
		if (highChart.getMarginTop() != null) {
			writer.write(", marginTop : " + highChart.getMarginTop());
		}
		if (highChart.getMarginBottom() != null) {
			writer.write(", marginBottom : " + highChart.getMarginBottom());
		}
		if (highChart.getMarginLeft() != null) {
			writer.write(", marginLeft : " + highChart.getMarginLeft());
		}
		if (highChart.getMarginRight() != null) {
			writer.write(", marginRight : " + highChart.getMarginRight());
		}
		writer.write("},");
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.write("});});");
		writer.endElement("script");
	}
}
