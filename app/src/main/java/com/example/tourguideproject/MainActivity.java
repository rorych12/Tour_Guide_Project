package com.example.tourguideproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.main_title);

        //Finds view that allows user to move between items
        ViewPager vP = findViewById(R.id.viewpager);

        //Creates adapter for fragment to be shown
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        //Sets adapter to view pager
        vP.setAdapter(adapter);

        //Sets TabLayout to view pager
        TabLayout tL = findViewById(R.id.tabs);
        tL.setupWithViewPager(vP);
    }
}