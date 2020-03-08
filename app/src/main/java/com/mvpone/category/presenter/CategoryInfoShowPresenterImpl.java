package com.mvpone.category.presenter;
import android.view.View;
import com.mvpone.category.model.CategoryInfoShowModel;
import com.mvpone.category.model.data_class.CategoryItem;
import com.mvpone.category.view.CategoryItemActivityView;
import com.mvpone.common.RequestCompleteListener;
import java.util.ArrayList;

public class CategoryInfoShowPresenterImpl implements
        CategoryInfoShowPresenter {

    private CategoryItemActivityView view;
    private CategoryInfoShowModel model;

    public CategoryInfoShowPresenterImpl(CategoryItemActivityView view, CategoryInfoShowModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void fetchCategoryInformation() {
        view.handleProgressBarVisibility(View.VISIBLE);// TODO:let view know about progress bar visibility
        // TODO:call model's method for country information
        model.getCategoryInformation(new RequestCompleteListener<ArrayList<CategoryItem>>() {
            @Override
            public void onRequestSuccess(ArrayList<CategoryItem> data) {
                view.handleProgressBarVisibility(View.GONE);// TODO:let view know about progress bar visibility
                // TODO: data formatting to show on UI
                ArrayList<CategoryItem> categoryItems = data;
                // TODO: let view know the formatted weather data
                view.onCategoryInfoFetchSuccess(categoryItems);
            }

            @Override
            public void onRequestFailed(String errorMessage) {
                view.handleProgressBarVisibility(View.GONE);// TODO:let view know about progress bar visibility
                view.onCategoryInfoFetchFailure(errorMessage);
            }
        });
    }

    @Override
    public void detachView() {
        view = null;
    }


}
