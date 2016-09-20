
package com.example.akash.mapsassignment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("countryIso2")
    @Expose
    private String countryIso2;
    @SerializedName("postal")
    @Expose
    private String postal;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("ds")
    @Expose
    private String ds;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;

    /**
     * 
     * @return
     *     The countryIso2
     */
    public String getCountryIso2() {
        return countryIso2;
    }

    /**
     * 
     * @param countryIso2
     *     The countryIso2
     */
    public void setCountryIso2(String countryIso2) {
        this.countryIso2 = countryIso2;
    }

    /**
     * 
     * @return
     *     The postal
     */
    public String getPostal() {
        return postal;
    }

    /**
     * 
     * @param postal
     *     The postal
     */
    public void setPostal(String postal) {
        this.postal = postal;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The ds
     */
    public String getDs() {
        return ds;
    }

    /**
     * 
     * @param ds
     *     The ds
     */
    public void setDs(String ds) {
        this.ds = ds;
    }

    /**
     * 
     * @return
     *     The ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 
     * @param ip
     *     The ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

}
