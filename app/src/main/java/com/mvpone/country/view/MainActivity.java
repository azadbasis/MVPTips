package com.mvpone.country.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mvpone.R;
import com.mvpone.country.model.CountryInfoShowModel;
import com.mvpone.country.model.CountryInfoShowModelImpl;
import com.mvpone.country.model.data_class.CountryInfo;
import com.mvpone.country.presenter.CountryInfoShowPresenter;
import com.mvpone.country.presenter.CountryInfoShowPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private CountryInfoShowModel model;
    private CountryInfoShowPresenter presenter;
    private TextView tvErrorMessage, tvCountryInfo;
    private ProgressBar progressBar;
    private Button btnCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvErrorMessage = findViewById(R.id.tv_error_message);
        tvCountryInfo = findViewById(R.id.tvCountryInfo);
        progressBar = findViewById(R.id.progressBar);
        btnCountry = findViewById(R.id.btnCountry);
        /**
         * initialize model and presenter
          */
        model = new CountryInfoShowModelImpl(this);
        presenter = new CountryInfoShowPresenterImpl(this, model);

        btnCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.fetchCountryInformation();
            }
        });
    }

    /**
     * Activity doesn't know when should progress bar visible or hide. It only knows
     * how to show/hide it.
     * Presenter will decide the logic of progress bar visibility.
     * This method will be triggered by presenter when needed.
     */
    @Override
    public void handleProgressBarVisibility(int visibility) {
        progressBar.setVisibility(visibility);
    }


    /**
     * This method will triggered when Country information successfully fetched.
     * Activity/View doesn't know anything about the data source of Country API.
     * Only model knows about the data source of Country API.
     */
    @Override
    public void onCountryInfoFetchSuccess(List<CountryInfo> countryInfo) {
        StringBuilder stringBuilder=new StringBuilder();
        for (CountryInfo temp : countryInfo
        ) {
            stringBuilder.append(temp.getCountryName()+"\n");


        }
        tvCountryInfo.setText(stringBuilder.toString());
    }

    /**
     * This method will triggered if Country information fetching process failed
     */
    @Override
    public void onCountryInfoFetchFailure(String errorMessage) {
        tvErrorMessage.setVisibility(View.VISIBLE);
        tvErrorMessage.setText(errorMessage);
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }
}
