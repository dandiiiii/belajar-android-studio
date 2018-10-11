package com.example.amikom.dandiiiii;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void bt1(View view) {
       FragmentTransaction p = getSupportFragmentManager().beginTransaction();
       p.replace(R.id.frame , new BlankFragment());
       p.commit();
    }

    public void bt2(View view) {
        FragmentTransaction p = getSupportFragmentManager().beginTransaction();
        p.replace(R.id.frame , new BlankFragment2());
        p.commit();
    }
}
