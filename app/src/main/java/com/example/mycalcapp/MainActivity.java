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
    int operation = 5;
    int total=0;
    public void add (View view){
        operation=1;
        solve(view);
    }
    public void sub (View view){
        operation=2;
        solve(view);
    }
    public void multiply (View view){
        operation=2;
        solve(view);
    }
    public void divide (View view){
        operation=2;
        solve(view);
    }
    public void solve(View view){
        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("");
        TextView topTxt = findViewById(R.id.topText);
        TextView botTxt = findViewById(R.id.bottomText);
        String topNum = topTxt.getText().toString();
        String botNum = botTxt.getText().toString();
        int num1= Integer.parseInt(topNum);
        int num2= Integer.parseInt(botNum);
        if (operation==1){
            //add
            total = num1+num2;
        }
        else if (operation==2) {
            total = num1-num2;
        }else if(operation==3){
            total = num1*num2;
        }else{
            total = num1/num2;
        }

        String wordTotal = ("" + total);
        EditText editText = (EditText) findViewById(R.id.answerBox);
        editText.setText(wordTotal);//set the text in edit text
    }

}