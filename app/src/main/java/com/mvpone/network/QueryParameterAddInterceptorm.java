package com.mvpone.network;
import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class QueryParameterAddInterceptorm implements Interceptor {


    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {

        HttpUrl url = chain.request().url().newBuilder()
             //   .addQueryParameter("appid", BuildConfig.APP_ID)
                .build();

        Request request = chain.request().newBuilder()
                // .addHeader("Authorization", "Bearer token")
                .url(url)
                .build();

        return chain.proceed(request);

    }
}