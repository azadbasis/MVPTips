package com.mvpone.country.model;

import android.content.Context;

import com.mvpone.common.RequestCompleteListener;
import com.mvpone.country.model.data_class.Country;
import com.mvpone.network.ApiInterface;
import com.mvpone.network.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryInfoShowModelImpl implements CountryInfoShowModel {

    private Context context;
    public CountryInfoShowModelImpl(Context context) {
        this.context = context;
    }

    /**
     * Fetch weather information from remote server via HTTP network request.
     * Yes, model only knows about data source. Model's responsibility is fetch the data from source.
     * Model don't do anything about data formatting or checking any logic. Model will notify
     * presenter with raw data. Presenter will decide the logic and let know the view what should
     * show on the UI.
     */
    @Override
    public void getCountryInformation(final RequestCompleteListener<Country> callback) {

        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Country> call = apiInterface.getCountry();
        call.enqueue(new Callback<Country>() {
            @Override
            public void onResponse(Call<Country> call, Response<Country> response) {
                if (response.body() != null)
                    callback.onRequestSuccess(response.body());//let presenter know the weather information data
                else
                    callback.onRequestFailed(response.message());//let presenter know about failure
            }

            @Override
            public void onFailure(Call<Country> call, Throwable t) {

            }
        });

    }
}
