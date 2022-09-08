package com.example.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    int operation = 5;
    double total=0;
    int num2;
    int num1;
    String errorMessage = "Please make sure to enter a whole number";
    TextView operationText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operationText= (TextView) findViewById(R.id.operation);
    }
//this is a comment

    public void add (View view){

        operation=1;
        operationText.setText("+");
        solve(view);
    }
    public void sub (View view){
        operation=2;
        operationText.setText("-");
        solve(view);
    }
    public void multiply (View view){
        operation=3;
        operationText.setText("x");
        solve(view);
    }
    public void divide (View view){
        operation=4;
        operationText.setText("/");
        solve(view);
    }
    public void solve(View view){
        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("");
        TextView topTxt = findViewById(R.id.topText);
        TextView botTxt = findViewById(R.id.bottomText);
        String topNum = topTxt.getText().toString();
        String botNum = botTxt.getText().toString();
        if (topNum.indexOf(".")==-1&&botNum.indexOf(".")==-1){
            num1= Integer.parseInt(topNum);
            num2= Integer.parseInt(botNum);
            if (operation==1){
                //add
                total = num1+num2;
            }
            else if (operation==2) {
                total = num1-num2;
            }else if(operation==3){
                total = num1*num2;
            }else{
                total = (double)num1/num2;
            }

            String wordTotal = ("" + total);
            if (operation!=4 && wordTotal.charAt(wordTotal.length()-1)==0){
                wordTotal = wordTotal.substring(0,wordTotal.length()-2);
            }
            if (operation==4 && wordTotal.length()>7){
                wordTotal = wordTotal.substring(0,7);
            }
            EditText editText = (EditText) findViewById(R.id.answerBox);
            editText.setText(wordTotal);//set the text in edit text
        }else{
            TextView textView = (TextView) findViewById(R.id.popUpMessages);
            textView.setText(errorMessage);//set the text in edit text
            topNum="";
            botNum="";
        }
    }

}