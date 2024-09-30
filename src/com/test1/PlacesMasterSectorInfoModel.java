package com.test1;

public class PlacesMasterSectorInfoModel {
	private Integer placesMasterKey;
	private String placeCode;
	private String admiralChart;
	private String latitudeDecimal;
	private String longitudeDecimal;
	private String chartCpde;
	private String referenceKey;
	private String branchLocation;
	private String branchCode;
	private String branchRoutingValue;
	private String creationDate;
	private String entityState;
	private String modifiedDate;

	public PlacesMasterSectorInfoModel() {

	}

	public PlacesMasterSectorInfoModel(Integer placesMasterKey, String placeCode, String admiralChart,
			String latitudeDecimal, String longitudeDecimal, String chartCpde, String referenceKey,
			String branchLocation, String branchCode, String branchRoutingValue, String creationDate,
			String entityState, String modifiedDate) {
		super();
		this.placesMasterKey = placesMasterKey;
		this.placeCode = placeCode;
		this.admiralChart = admiralChart;
		this.latitudeDecimal = latitudeDecimal;
		this.longitudeDecimal = longitudeDecimal;
		this.chartCpde = chartCpde;
		this.referenceKey = referenceKey;
		this.branchLocation = branchLocation;
		this.branchCode = branchCode;
		this.branchRoutingValue = branchRoutingValue;
		this.creationDate = creationDate;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getPlacesMasterKey() {
		return placesMasterKey;
	}

	public void setPlacesMasterKey(Integer placesMasterKey) {
		this.placesMasterKey = placesMasterKey;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public String getAdmiralChart() {
		return admiralChart;
	}

	public void setAdmiralChart(String admiralChart) {
		this.admiralChart = admiralChart;
	}

	public String getLatitudeDecimal() {
		return latitudeDecimal;
	}

	public void setLatitudeDecimal(String latitudeDecimal) {
		this.latitudeDecimal = latitudeDecimal;
	}

	public String getLongitudeDecimal() {
		return longitudeDecimal;
	}

	public void setLongitudeDecimal(String longitudeDecimal) {
		this.longitudeDecimal = longitudeDecimal;
	}

	public String getChartCpde() {
		return chartCpde;
	}

	public void setChartCpde(String chartCpde) {
		this.chartCpde = chartCpde;
	}

	public String getReferenceKey() {
		return referenceKey;
	}

	public void setReferenceKey(String referenceKey) {
		this.referenceKey = referenceKey;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchRoutingValue() {
		return branchRoutingValue;
	}

	public void setBranchRoutingValue(String branchRoutingValue) {
		this.branchRoutingValue = branchRoutingValue;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
