package com.example.testandroid0504.api;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitService {
    private static final String BASE_URL = "https://192.168.0.110:8081";

    private static Retrofit retrofit;

    private static Retrofit create() {
        return new Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

    public static Retrofit getInstance() {
        if (retrofit == null) retrofit = create();
        return retrofit;
    }
}
