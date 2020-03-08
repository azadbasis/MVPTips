package com.mvpone.common;

public interface RequestCompleteListener<T> {
    void onRequestSuccess(T data);
    void onRequestFailed(String errorMessage);
}
