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
        Intent intent = new Intent(this, Solve.class);
        intent.putExtra("NAME", solve());
        startActivity(intent);
    }

    public Integer solve(int a){
        if(a==1){

        }else if(a==2){

        }else if(a==3){

        }else if(a==4){

        }
    }

    public void switchScreens(View view){
        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("");
        TextView topTxt = findViewById(R.id.topText);
        TextView botTxt = findViewById(R.id.bottomText);
        String topNum = topTxt.getText().toString();
        String botNum = botTxt.getText().toString();
        int num1= Integer.parseInt(topNum);
        int num2= Integer.parseInt(botNum);
    }

}