package com.mojaafar.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mojaafar.tutorapp.http.ApiEndpoint;
import com.mojaafar.tutorapp.http.User;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.mojaafar.tutorapp.utils.Utils.BASE_URL;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void loginUser(){
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiEndpoint endpoint = retrofit.create(ApiEndpoint.class);
        Call<User> call = endpoint.loginUser();
    }
}