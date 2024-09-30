package com.test1;

public class PlacesMasterSector {
	private Integer placesMasterKey;
	private Integer areaCode;
	private String effectiveDate;
	private Integer areaSequence;
	private String portAuth;
	private String pricipalFacility;
	private String placeName;
	private String placeCode;
	private String entityState;
	private String modifiedDate;
	private String remarks;

	public PlacesMasterSector() {

	}

	public PlacesMasterSector(Integer placesMasterKey, Integer areaCode, String effectiveDate, Integer areaSequence,
			String portAuth, String pricipalFacility, String placeName, String placeCode, String entityState,
			String modifiedDate, String remarks) {
		super();
		this.placesMasterKey = placesMasterKey;
		this.areaCode = areaCode;
		this.effectiveDate = effectiveDate;
		this.areaSequence = areaSequence;
		this.portAuth = portAuth;
		this.pricipalFacility = pricipalFacility;
		this.placeName = placeName;
		this.placeCode = placeCode;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	public Integer getPlacesMasterKey() {
		return placesMasterKey;
	}

	public void setPlacesMasterKey(Integer placesMasterKey) {
		this.placesMasterKey = placesMasterKey;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getAreaSequence() {
		return areaSequence;
	}

	public void setAreaSequence(Integer areaSequence) {
		this.areaSequence = areaSequence;
	}

	public String getPortAuth() {
		return portAuth;
	}

	public void setPortAuth(String portAuth) {
		this.portAuth = portAuth;
	}

	public String getPricipalFacility() {
		return pricipalFacility;
	}

	public void setPricipalFacility(String pricipalFacility) {
		this.pricipalFacility = pricipalFacility;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
