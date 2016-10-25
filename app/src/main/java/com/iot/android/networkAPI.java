package com.iot.android;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by S.Shivasurya on 10/25/2016.
 */
public interface networkAPI {
    @FormUrlEncoded
    @POST("/location")
    void updateLocation(@Field("lat") String lat,
                @Field("long") String longit,
            Callback<Response> cb);
}
