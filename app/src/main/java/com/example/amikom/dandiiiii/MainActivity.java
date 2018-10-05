package com.example.amikom.dandiiiii;

import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amikom.dandiiiii.util.LoginActivity;
import com.example.amikom.dandiiiii.util.PreferencesHelper;

public class SplashActivity extends AppCompatActivity {
    PreferencesHelper instance;
    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(() -> {
            if (instance.isLogin()) {
                starActivity(new Intent(SplashActivity.this,LoginActivity.class));
            }else  {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        },splashInterval);

    }
}