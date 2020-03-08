package com.mvpone.country.model;

import com.mvpone.common.RequestCompleteListener;
import com.mvpone.country.model.data_class.Country;

public interface CountryInfoShowModel {
    /**
     * fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
     * fun getWeatherInformation(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
     */
    void getCountryInformation(RequestCompleteListener<Country> callback);
}
