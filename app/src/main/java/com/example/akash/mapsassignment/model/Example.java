
package com.example.akash.mapsassignment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("RestResponse")
    @Expose
    private RestResponse restResponse;

    /**
     * 
     * @return
     *     The restResponse
     */
    public RestResponse getRestResponse() {
        return restResponse;
    }

    /**
     * 
     * @param restResponse
     *     The RestResponse
     */
    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

}
