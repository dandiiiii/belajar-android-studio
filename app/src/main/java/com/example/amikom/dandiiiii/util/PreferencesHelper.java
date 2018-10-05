package com.example.amikom.dandiiiii.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class PreferencesHelper {
private static  PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private  PreferencesHelper(Context context) {
            sharedPreferences = context
                    .getApplicationContext()
                    .getSharedPreferences("simple.android.app", Context.MODE_PRIVATE);
    }
    public static PreferencesHelper getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferencesHelper(Context);
        }
        return INSTANCE;
    }
    public  SharedPreferences Pref(){
        return  sharedPreferences;
    }
    public  Boolean isLogin(){
        return  sharedPreferences.getBoolean("isLogin", false);

    }
    public  void setLogin(boolean isCall) {
        sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
    }
    public  void isName(String isName) {
        sharedPreferences
    }

}
