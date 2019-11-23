package com.polinasmogi.openweatherapiretrofit2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String appId = "6d723718db98a1f08e68d1fddd8b75ca";
    String lat = "55.75";
    String lon = "37.62";
    public static final double tempK = 273.15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtWeather = findViewById(R.id.txtWeather);
        Button btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherService.getInstance()
                        .getJSONApi()
                        .getCurrentData(lat, lon, appId)
                        .enqueue(new Callback<WeatherResponse>() {
                            @Override
                            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                                WeatherResponse weatherResponse = response.body();

                                double tempC = Math.round(weatherResponse.main.temp - tempK);

                                String data =
                                        "City: " + weatherResponse.name + "\n" +
                                        "Temperature: " + tempC;

                                txtWeather.setText(data);
                            }

                            @Override
                            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                                txtWeather.setText(t.getMessage());
                            }
                        });

            }
        });


    }
}
