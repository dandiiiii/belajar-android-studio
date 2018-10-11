package com.example.amikom.dandiiiii;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.amikom.dandiiiii.util.PreferencesHelper;


public class SplashScreen extends AppCompatActivity {
    PreferencesHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                if (!instance.isLogin()) {
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));

                } else {
                    startActivity(new Intent(SplashScreen.this, Main2Activity.class));
                }
            }

        }, splashInterval);


    }
}
