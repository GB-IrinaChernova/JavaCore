package ru.gb.lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.Objects;



public class HomeWork {
    /*  GET /forecasts/v1/daily/5day/294021?apikey=9XYyszHsrJS0G5ApsznzKxw0UyHZpz4A HTTP/1.1  */

    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECAST_URL = "forecasts";
    public static final String DAILY_URL = "daily";
    public static final String FIVE_DAY_URL = "5day";
    public static final String API_VERSION = "v1";
    public static final String CITY_ID = "294021";
    public static final String API_KEY = "9XYyszHsrJS0G5ApsznzKxw0UyHZpz4A";
    public static final String LANGUAGE = "ru-ru";
    public static final String METRIC = "true";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
            .scheme("http")
            .host(HOST)
            .addPathSegment(FORECAST_URL)
            .addPathSegment(API_VERSION)
            .addPathSegment(DAILY_URL)
            .addPathSegment(FIVE_DAY_URL)
            .addPathSegment(CITY_ID)
            .addQueryParameter("apikey", API_KEY)
            .addQueryParameter("language", LANGUAGE)
            .addQueryParameter("metric", METRIC)
            .build();

        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();

        System.out.println(Objects.requireNonNull(response.body()).string());
    }

}