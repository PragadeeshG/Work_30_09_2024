package com.test1;

public class PlacesMasterSectorAddressModel {
	private Integer placesMasterKey;
	private String placeType;
	private String placesOrigin;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressLine4;
	private String addressLine5;
	private String city;
	private String state;
	private String countryCode;
	private boolean isDefault;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PlacesMasterSectorAddressModel() {

	}

	public PlacesMasterSectorAddressModel(Integer placesMasterKey, String placeType, String placesOrigin,
			String addressLine1, String addressLine2, String addressLine3, String addressLine4, String addressLine5,
			String city, String state, String countryCode, boolean isDefault, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.placesMasterKey = placesMasterKey;
		this.placeType = placeType;
		this.placesOrigin = placesOrigin;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.addressLine4 = addressLine4;
		this.addressLine5 = addressLine5;
		this.city = city;
		this.state = state;
		this.countryCode = countryCode;
		this.isDefault = isDefault;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getPlacesMasterKey() {
		return placesMasterKey;
	}

	public void setPlacesMasterKey(Integer placesMasterKey) {
		this.placesMasterKey = placesMasterKey;
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public String getPlacesOrigin() {
		return placesOrigin;
	}

	public void setPlacesOrigin(String placesOrigin) {
		this.placesOrigin = placesOrigin;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getAddressLine5() {
		return addressLine5;
	}

	public void setAddressLine5(String addressLine5) {
		this.addressLine5 = addressLine5;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
