package com.sexed.androidapp.app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WordPressClient {

    private static final String BASE_URL = "https://demo2395178.mockable.io/";
    public static Retrofit getRetroInstance(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static ApiService getApiService() {
        return getRetroInstance().create(ApiService.class);
    }
}
