package com.mvpone.country.view;

import com.mvpone.country.model.data_class.CountryInfo;

import java.util.List;

public interface MainActivityView {
    /**
     * fun handleProgressBarVisibility(visibility: Int)
     * fun onCityListFetchSuccess(cityList: MutableList<City>)
     * fun onCityListFetchFailure(errorMessage: String)
     * fun onWeatherInfoFetchSuccess(weatherDataModel: WeatherDataModel)
     * fun onCountryInfoFetchFailure(errorMessage: String)
     */

    void handleProgressBarVisibility(int visibility);

    void onCountryInfoFetchSuccess(List<CountryInfo> countryInfo);

    void onCountryInfoFetchFailure(String errorMessage);

}
