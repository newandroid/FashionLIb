package com.example.css.fashionlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.css.fashionlib.dagger2.Dagger2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dagger2(View view) {
        startActivity(new Intent(this, Dagger2Activity.class));
    }
}
