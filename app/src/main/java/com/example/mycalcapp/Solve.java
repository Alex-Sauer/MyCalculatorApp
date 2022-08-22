package com.example.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Solve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);
        Intent intent = getIntent();
        String total = intent.getStringExtra("SOLVE");
        TextView textView = findViewById(R.id.textView);
        textView.setText(total);

    }
}