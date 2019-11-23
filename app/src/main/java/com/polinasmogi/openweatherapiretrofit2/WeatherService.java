package com.polinasmogi.openweatherapiretrofit2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherService {

    private static WeatherService instance;
    public static final String BASE_URL = "https://api.openweathermap.org//";
    private Retrofit retrofit;

    private WeatherService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static WeatherService getInstance() {
        if (instance == null) {
            instance = new WeatherService();
        }
        return instance;
    }

    public WeatherClient getJSONApi() {
        return retrofit.create(WeatherClient.class);
    }
}
