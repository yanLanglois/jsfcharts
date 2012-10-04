package org.everythingiswrong.jsf.component.highcharts;

import java.io.IOException;

import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.model.DataModel;
import javax.faces.model.ScalarDataModel;

@FacesComponent("org.everythingiswrong.jsf.chart.xAxis")
public class UIXAxisComponent extends AbstractUIComponent {
	
	public static final String COMPONENT_FAMILY = "org.everythingiswrong";
	
	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	protected enum PropertyKeys {

		allowDecimals, alternateGridColor, categories, dateTimeLabelFormats, endOnTick, gridLineColor, gridLineDashStyle, gridLineWidth, lineColor,
		lineWidth,
		//linkedTo, max, maxPadding,  
		min, minorGridLineColor, minorGridLineWidth, minorTickColor, minorTickInterval,
		//minorTickLength, minorTickPosition, minorTickWidth, minPadding, minRange,
		offset, opposite, reversed, showFirstLabel, showLastLabel, startOfWeek, startOnTick, tickColor,
		tickInterval, tickLength, tickmarkPlacement, tickPixelInterval, tickPosition, tickWidth, type;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}
	
	public java.lang.String getAllowDecimals() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.allowDecimals, null);
	}
	public void setAllowDecimals(java.lang.String _allowDecimals) {
		getStateHelper().put(PropertyKeys.allowDecimals, _allowDecimals);
		handleAttribute("allowDecimals", _allowDecimals);
	}
	
	public java.lang.String getAlternateGridColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.alternateGridColor, null);
	}
	public void setAlternateGridColor(java.lang.String _alternateGridColor) {
		getStateHelper().put(PropertyKeys.alternateGridColor, _alternateGridColor);
		handleAttribute("alternateGridColor", _alternateGridColor);
	}

	/**
     * <p>Return the value of the categories.  This value must either be
     * be of type {@link DataModel}, or a type that can be adapted
     * into a {@link DataModel}.  <code>UIXAxisComponent</code> will automatically
     * adapt the following types:</p>
     * <ul>
     * <li>Arrays</li>
     * <li><code>java.util.List</code></li>
     * <li><code>java.sql.ResultSet</code></li>
     * <li><code>javax.servlet.jsp.jstl.sql.Result</code></li>
     * </ul>
     * <p>All other types will be adapted using the {@link ScalarDataModel}
     * class, which will treat the object as a single row of data.</p>
     */
	public java.lang.Object getCategories() {
		return (java.lang.Object) getStateHelper().eval(PropertyKeys.categories, null);
	}
	public void setCategories(java.lang.Object _categories) {
		getStateHelper().put(PropertyKeys.categories, _categories);
		handleAttribute("categories", _categories);
	}
	
	public java.lang.String getDateTimeLabelFormats() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.dateTimeLabelFormats, null);
	}
	public void setDateTimeLabelFormats(java.lang.String _dateTimeLabelFormats) {
		getStateHelper().put(PropertyKeys.dateTimeLabelFormats, _dateTimeLabelFormats);
		handleAttribute("dateTimeLabelFormats", _dateTimeLabelFormats);
	}
	
	public java.lang.String getEndOnTick() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.dateTimeLabelFormats, null);
	}
	public void setEndOnTick(java.lang.String _endOnTick) {
		getStateHelper().put(PropertyKeys.endOnTick, _endOnTick);
		handleAttribute("endOnTick", _endOnTick);
	}
	
	public java.lang.String getGridLineColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.gridLineColor, null);
	}
	public void setGridLineColor(java.lang.String _gridLineColor) {
		getStateHelper().put(PropertyKeys.gridLineColor, _gridLineColor);
		handleAttribute("gridLineColor", _gridLineColor);
	}
	
	public java.lang.String getGridLineDashStyle() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.gridLineDashStyle, null);
	}
	public void setGridLineDashStyle(java.lang.String _gridLineDashStyle) {
		getStateHelper().put(PropertyKeys.gridLineDashStyle, _gridLineDashStyle);
		handleAttribute("gridLineDashStyle", _gridLineDashStyle);
	}

	public java.lang.String getGridLineWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.gridLineWidth, null);
	}
	public void setGridLineWidth(java.lang.String _gridLineWidth) {
		getStateHelper().put(PropertyKeys.gridLineWidth, _gridLineWidth);
		handleAttribute("gridLineWidth", _gridLineWidth);
	}

	public java.lang.String getLineColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.lineColor, null);
	}
	public void setLineColor(java.lang.String _lineColor) {
		getStateHelper().put(PropertyKeys.lineColor, _lineColor);
		handleAttribute("lineColor", _lineColor);
	}
	
	public java.lang.String getLineWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.lineWidth, null);
	}
	public void setLineWidth(java.lang.String _lineWidth) {
		getStateHelper().put(PropertyKeys.lineWidth, _lineWidth);
		handleAttribute("lineWidth", _lineWidth);
	}
	
	public java.lang.String getMin() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.min, null);
	}
	public void setMin(java.lang.String _min) {
		getStateHelper().put(PropertyKeys.min, _min);
		handleAttribute("min", _min);
	}
	
	public java.lang.String getMinorGridLineColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.minorGridLineColor, null);
	}
	public void setMinorGridLineColor(java.lang.String _minorGridLineColor) {
		getStateHelper().put(PropertyKeys.minorGridLineColor, _minorGridLineColor);
		handleAttribute("minorGridLineColor", _minorGridLineColor);
	}
	
	public java.lang.String getMinorGridLineWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.minorGridLineWidth, null);
	}
	public void setMinorGridLineWidth(java.lang.String _minorGridLineWidth) {
		getStateHelper().put(PropertyKeys.minorGridLineWidth, _minorGridLineWidth);
		handleAttribute("minorGridLineWidth", _minorGridLineWidth);
	}
	
	public java.lang.String getMinorTickColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.minorTickColor, null);
	}
	public void setMinorTickColor(java.lang.String _minorTickColor) {
		getStateHelper().put(PropertyKeys.minorTickColor, _minorTickColor);
		handleAttribute("minorTickColor", _minorTickColor);
	}

	public java.lang.String getMinorTickInterval() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.minorTickInterval, null);
	}
	public void setMinorTickInterval(java.lang.String _minorTickInterval) {
		getStateHelper().put(PropertyKeys.minorTickInterval, _minorTickInterval);
		handleAttribute("minorTickInterval", _minorTickInterval);
	}
	
	public java.lang.String getOffset() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.offset, null);
	}
	public void setOpposite(java.lang.String _opposite) {
		getStateHelper().put(PropertyKeys.opposite, _opposite);
		handleAttribute("opposite", _opposite);
	}
	
	public java.lang.Boolean getOpposite() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.offset, null);
	}
	public void setOffset(java.lang.Boolean _offset) {
		getStateHelper().put(PropertyKeys.offset, _offset);
		handleAttribute("offset", _offset);
	}
	
	public java.lang.Boolean getReversed() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.reversed, null);
	}
	public void setReversed(java.lang.Boolean _reversed) {
		getStateHelper().put(PropertyKeys.reversed, _reversed);
		handleAttribute("reversed", _reversed);
	}
	
	public java.lang.Boolean getShowFirstLabel() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showFirstLabel, null);
	}
	public void setShowFirstLabel(java.lang.Boolean _showFirstLabel) {
		getStateHelper().put(PropertyKeys.showFirstLabel, _showFirstLabel);
		handleAttribute("showFirstLabel", _showFirstLabel);
	}
	
	public java.lang.Boolean getShowLastLabel() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.showLastLabel, null);
	}
	public void setShowLastLabel(java.lang.Boolean _showLastLabel) {
		getStateHelper().put(PropertyKeys.showLastLabel, _showLastLabel);
		handleAttribute("showLastLabel", _showLastLabel);
	}
	
	public java.lang.String getStartOfWeek() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.startOfWeek, null);
	}
	public void setStartOfWeek(java.lang.String _startOfWeek) {
		getStateHelper().put(PropertyKeys.startOfWeek, _startOfWeek);
		handleAttribute("startOfWeek", _startOfWeek);
	}
	
	public java.lang.Boolean getStartOnTick() {
		return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.startOnTick, null);
	}
	public void setStartOnTick(java.lang.Boolean _startOnTick) {
		getStateHelper().put(PropertyKeys.startOnTick, _startOnTick);
		handleAttribute("startOnTick", _startOnTick);
	}
	
	public java.lang.String getTickColor() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickColor, null);
	}
	public void setTickColor(java.lang.String _tickColor) {
		getStateHelper().put(PropertyKeys.tickColor, _tickColor);
		handleAttribute("tickColor", _tickColor);
	}
	
	public java.lang.String getTickInterval() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickInterval, null);
	}
	public void setTickInterval(java.lang.String _tickInterval) {
		getStateHelper().put(PropertyKeys.tickInterval, _tickInterval);
		handleAttribute("tickInterval", _tickInterval);
	}
	
	public java.lang.String getTickLength() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickLength, null);
	}
	public void setTickLength(java.lang.String _tickLength) {
		getStateHelper().put(PropertyKeys.tickLength, _tickLength);
		handleAttribute("tickLength", _tickLength);
	}
	
	public java.lang.String getTickmarkPlacement() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickmarkPlacement, null);
	}
	public void setTickmarkPlacement(java.lang.String _tickmarkPlacement) {
		getStateHelper().put(PropertyKeys.tickmarkPlacement, _tickmarkPlacement);
		handleAttribute("tickmarkPlacement", _tickmarkPlacement);
	}
	
	public java.lang.String getTickPixelInterval() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickPixelInterval, null);
	}
	public void setTickPixelInterval(java.lang.String _tickPixelInterval) {
		getStateHelper().put(PropertyKeys.tickPixelInterval, _tickPixelInterval);
		handleAttribute("tickPixelInterval", _tickPixelInterval);
	}
	
	public java.lang.String getTickPosition() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickPosition, null);
	}
	public void setTickPosition(java.lang.String _tickPosition) {
		getStateHelper().put(PropertyKeys.tickPosition, _tickPosition);
		handleAttribute("tickPosition", _tickPosition);
	}
	
	public java.lang.String getTickWidth() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.tickWidth, null);
	}
	public void setTickWidth(java.lang.String _tickWidth) {
		getStateHelper().put(PropertyKeys.tickWidth, _tickWidth);
		handleAttribute("tickWidth", _tickWidth);
	}
	
	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.type, null);
	}
	public void setType(java.lang.String _type) {
		getStateHelper().put(PropertyKeys.type, _type);
		handleAttribute("type", _type);
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
		writer.write(", xAxis: {");
		setFirstAttribute(true);
	}
	
	@Override
	public void encodeEnd(FacesContext context) throws IOException {
		String axis = getAxisContent();
		axis += "}";
		ResponseWriter writer = context.getResponseWriter();
		writer.write(axis);
	}
	
	protected String getAxisContent() {
		StringBuffer dataBuffer = new StringBuffer("");
		dataBuffer.append(writeAttribute(PropertyKeys.allowDecimals.name(), getAllowDecimals(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.alternateGridColor.name(), getAlternateGridColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.categories.name(), getCategories(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.dateTimeLabelFormats.name(), getDateTimeLabelFormats(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.endOnTick.name(), getEndOnTick(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.gridLineColor.name(), getGridLineColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.gridLineDashStyle.name(), getGridLineDashStyle(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.gridLineWidth.name(), getGridLineWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.lineColor.name(), getLineColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.lineWidth.name(), getLineWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.min.name(), getMin(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.minorGridLineColor.name(), getMinorGridLineColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.minorGridLineWidth.name(), getMinorGridLineWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.minorTickColor.name(), getMinorTickColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.minorTickInterval.name(), getMinorTickInterval(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.offset.name(), getOffset(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.opposite.name(), getOpposite(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.reversed.name(), getReversed(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.showFirstLabel.name(), getShowFirstLabel(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.showLastLabel.name(), getShowLastLabel(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.startOfWeek.name(), getStartOfWeek(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.startOnTick.name(), getStartOnTick(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickColor.name(), getTickColor(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickInterval.name(), getTickInterval(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickLength.name(), getTickLength(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickmarkPlacement.name(), getTickmarkPlacement(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickPixelInterval.name(), getTickPixelInterval(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickPosition.name(), getTickPosition(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.tickWidth.name(), getTickWidth(), updateFirstAttribute(dataBuffer.toString())));
		dataBuffer.append(writeAttribute(PropertyKeys.type.name(), getType(), updateFirstAttribute(dataBuffer.toString())));
		
		updateFirstAttribute(dataBuffer.toString());
		
		return dataBuffer.toString();
	}
	
	
}
