package com.example.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public Integer solve(int button, int numOne, int numTwo){
//
//    }

    public void solve(View view){
        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("");
        TextView topTxt = findViewById(R.id.topText);
        TextView botTxt = findViewById(R.id.bottomText);
        String topNum = topTxt.getText().toString();
        String botNum = botTxt.getText().toString();
        int num1= Integer.parseInt(topNum);
        int num2= Integer.parseInt(botNum);
        int total;
        total = num1+num2;
//        if (){
//            //add
//            total = num1+num2;
//        }else if (){
//            //sub
//        }else if(){
//            //mult
//        }else{
//            //div
//        }

        String wordTotal = ("" + total);

    }

}