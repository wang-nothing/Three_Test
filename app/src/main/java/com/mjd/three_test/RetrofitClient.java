package com.mjd.three_test;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 2018-8-20.
 */

public class RetrofitClient {
    private static RetrofitClient sClient;

    private static Retrofit sRetrofit;

    private static Retrofit_Api sRetrofit_api;

    public static RetrofitClient getInstance() {
        if (sClient == null) {
            sClient = new RetrofitClient();
        }
        return sClient;
    }

    public Retrofit_Api getApi() {
        return sRetrofit_api == null ? config(Retrofit_Api.class) : sRetrofit_api;
    }

    private <T> T config(Class<T> service) {
        sRetrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Retrofit_Net.BAST)
                .build();
        return sRetrofit.create(service);
    }
}