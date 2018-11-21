
package luka.kiria.ge.myapplication.app.profile.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientAddress {

    @SerializedName("AddressType")
    @Expose
    private String addressType;
    @SerializedName("ClientKey")
    @Expose
    private Integer clientKey;
    @SerializedName("CountryCode")
    @Expose
    private String countryCode;
    @SerializedName("RegionCode")
    @Expose
    private String regionCode;
    @SerializedName("Street")
    @Expose
    private String street;
    @SerializedName("Building")
    @Expose
    private String building;
    @SerializedName("Appartment")
    @Expose
    private Integer appartment;
    @SerializedName("District")
    @Expose
    private String district;
    @SerializedName("NonCity")
    @Expose
    private String nonCity;
    @SerializedName("UrbanType")
    @Expose
    private String urbanType;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Integer getClientKey() {
        return clientKey;
    }

    public void setClientKey(Integer clientKey) {
        this.clientKey = clientKey;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Integer getAppartment() {
        return appartment;
    }

    public void setAppartment(Integer appartment) {
        this.appartment = appartment;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNonCity() {
        return nonCity;
    }

    public void setNonCity(String nonCity) {
        this.nonCity = nonCity;
    }

    public String getUrbanType() {
        return urbanType;
    }

    public void setUrbanType(String urbanType) {
        this.urbanType = urbanType;
    }

}
