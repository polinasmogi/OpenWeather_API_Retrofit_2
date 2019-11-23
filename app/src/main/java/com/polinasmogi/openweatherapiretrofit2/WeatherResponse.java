package com.polinasmogi.openweatherapiretrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class WeatherResponse {

    @SerializedName("coord")
    public Coord coord;
    @SerializedName("weather")
    public ArrayList<Weather> weather = new ArrayList<Weather>();
    @SerializedName("main")
    public Main main;
    @SerializedName("wind")
    public Wind wind;
    @SerializedName("clouds")
    public Clouds clouds;
    @SerializedName("dt")
    public float dt;
    @SerializedName("sys")
    public Sys sys;
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("cod")
    public float cod;


    class Coord {
        @SerializedName("lon")
        public float lon;
        @SerializedName("lat")
        public float lat;
    }

    class Weather {
        @SerializedName("id")
        public int id;
        @SerializedName("main")
        public String main;
        @SerializedName("description")
        public String description;
        @SerializedName("icon")
        public String icon;
    }

    class Main {
        @SerializedName("temp")
        public float temp;
        @SerializedName("pressure")
        public float pressure;
        @SerializedName("humidity")
        public int humidity;
        @SerializedName("temp_min")
        public float temp_min;
        @SerializedName("temp_max")
        public float temp_max;
        @SerializedName("sea_level")
        public float sea_level;
        @SerializedName("grnd_level")
        public float grnd_level;
    }

    class Wind {
        @SerializedName("speed")
        public float speed;
        @SerializedName("deg")
        public int deg;
    }

    class Clouds {
        @SerializedName("all")
        public int all;
    }

    class Sys {
        @SerializedName("message")
        public float message;
        @SerializedName("country")
        public String country;
        @SerializedName("sunrise")
        public float sunrise;
        @SerializedName("sunset")
        public float sunset;
    }
}
