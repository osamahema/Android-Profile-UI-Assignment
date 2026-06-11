package com.example.profileapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView(R.layout.activity_profile_constraint)
        // setContentView(R.layout.activity_profile_relative)
        setContentView(R.layout.activity_profile_constraint);
    }
}