package com.mvpone.category.view;

import com.mvpone.category.model.data_class.CategoryItem;

import java.util.ArrayList;

public interface CategoryItemActivityView {


    void handleProgressBarVisibility(int visibility);

    void onCategoryInfoFetchSuccess(ArrayList<CategoryItem> categoryItems);

    void onCategoryInfoFetchFailure(String errorMessage);

}
