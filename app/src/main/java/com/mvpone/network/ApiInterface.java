package com.mvpone.network;

import com.mvpone.country.model.data_class.Country;
import com.mvpone.utils.Extensions;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
 /*   @GET("weather")
    Call<WeatherInfoResponse> callApiForWeatherInfo(@Query("id") int cityId);*/
    @GET(Extensions.COUNTRY_LIST)
    Call<Country> getCountry();
}
