package com.game.indiagroupassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }
    HomeFragment homeFragment = new HomeFragment();
    TalkAstrologerFragment talkAstrologerFragment = new TalkAstrologerFragment();
    AskQuestionsFragment askQuestionsFragment = new AskQuestionsFragment();
    ReportFragment reportsFragment = new ReportFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                return true;
            case R.id.talkastrologer:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, talkAstrologerFragment).commit();
                return true;
            case R.id.ask:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, askQuestionsFragment).commit();
                return true;
            case R.id.reports:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, reportsFragment).commit();
                return true;
        }
        return false;
    }
}