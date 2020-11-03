package com.catata.animacionestransicionesactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void irSecondary(View view) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);

            Intent i = new Intent(this, SecondaryActivity.class);
            startActivity(i, options.toBundle());
    }
}