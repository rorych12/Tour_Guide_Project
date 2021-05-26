package com.example.tourguideproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BuildingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_container);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BuildingsFragment()).commit();
    }
}