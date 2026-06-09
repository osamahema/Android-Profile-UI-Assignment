package com.example.profileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRelative = findViewById(R.id.btnGoToRelative);
        Button btnConstraint = findViewById(R.id.btnGoToConstraint);

        btnRelative.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
            startActivity(intent);
        });

        btnConstraint.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ConstraintActivity.class);
            startActivity(intent);
        });
    }
}