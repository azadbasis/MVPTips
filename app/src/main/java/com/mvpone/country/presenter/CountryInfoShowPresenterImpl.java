package com.mvpone.country.presenter;

import android.view.View;
import com.mvpone.common.RequestCompleteListener;
import com.mvpone.country.model.CountryInfoShowModel;
import com.mvpone.country.model.data_class.Country;
import com.mvpone.country.model.data_class.CountryInfo;
import com.mvpone.country.view.MainActivityView;
import java.util.List;

public class CountryInfoShowPresenterImpl implements
        CountryInfoShowPresenter {

    private MainActivityView view;
    private CountryInfoShowModel model;

    public CountryInfoShowPresenterImpl(MainActivityView view, CountryInfoShowModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void fetchCountryInformation() {
        view.handleProgressBarVisibility(View.VISIBLE);// TODO:let view know about progress bar visibility
        // TODO:call model's method for country information
        model.getCountryInformation(new RequestCompleteListener<Country>() {
            @Override
            public void onRequestSuccess(Country data) {
                view.handleProgressBarVisibility(View.GONE);// TODO:let view know about progress bar visibility
                // TODO: data formatting to show on UI
                List<CountryInfo> countryInfo = data.getCountry();
                // TODO: let view know the formatted weather data
                view.onCountryInfoFetchSuccess(data.getCountry());
            }

            @Override
            public void onRequestFailed(String errorMessage) {
                view.handleProgressBarVisibility(View.GONE);// TODO: let view know about progress bar visibility
                // TODO: let view know about failure
                view.onCountryInfoFetchFailure(errorMessage);
            }
        });
    }

    @Override
    public void detachView() {
        view = null;
    }


}
