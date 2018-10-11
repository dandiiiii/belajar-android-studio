package com.example.amikom.dandiiiii;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle kirim = getIntent().getExtras();
        TextView nama = (TextView) findViewById(R.id.user1);
        nama.setText(kirim.getCharSequence("nama"));



    }

    public void tambahuser(View view) {

    }

    public void list(View view) {
    }

    public void kefragment(View view) {
        Intent intent = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }
}
