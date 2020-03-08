package com.mvpone.category.model;
import com.mvpone.category.model.data_class.CategoryItem;
import com.mvpone.common.RequestCompleteListener;
import java.util.ArrayList;

public interface CategoryInfoShowModel {
    void getCategoryInformation(RequestCompleteListener<ArrayList<CategoryItem>> callback);
}
