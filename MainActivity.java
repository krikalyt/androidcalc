package com.example.krishna.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String strchng ="";
    String finalone="";
    String finaltwo="";
    float strone=0;
    float strtwo=0;
    float result=0;
    char operation='(';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonplus = findViewById(R.id.buttonplus);
        Button buttonsub  = findViewById(R.id.buttonsub);
        Button buttonmult = findViewById(R.id.buttonmult);
        Button buttondiv = findViewById(R.id.buttondiv);
        Button buttonclr = findViewById(R.id.buttonclr);
        Button buttoncan = findViewById(R.id.buttoncan);
        Button buttonres = findViewById(R.id.buttonres);
        Button buttonpoint = findViewById(R.id.buttonpoint);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "0";
                textView.setText(strchng);
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "1";
                textView.setText(strchng);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "2";
                textView.setText(strchng);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "3";
                textView.setText(strchng);
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "4";
                textView.setText(strchng);
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "5";
                textView.setText(strchng);
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "6";
                textView.setText(strchng);
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "7";
                textView.setText(strchng);

            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "8";
                textView.setText(strchng);

            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng = strchng +  "9";
                textView.setText(strchng);

            }
        });

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
              finalone = strchng;
              strchng = "";
              operation = '+';
              String temp = (String) ""+operation;
              textView.setText(temp);
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finalone = strchng;
                strchng = "";
                operation = '-';
                String temp = (String) ""+operation;
                textView.setText(temp);
            }
        });

        buttonmult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finalone = strchng;
                strchng = "";
                operation = '*';
                String temp = (String) ""+operation;
                textView.setText(temp);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finalone = strchng;
                strchng = "";
                operation = '/';
                String temp = (String) ""+operation;
                textView.setText(temp);
            }
        });

        buttonclr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               strchng = "";
               textView.setText(strchng);
            }
        });

        buttoncan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strchng ="";
                finalone="";
                finaltwo="";
                 strone=0;
                 strtwo=0;
                 result=0;
                textView.setText("");
            }
        });
        ///point set on action
        buttonpoint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                strchng = strchng +  ".";
                textView.setText(strchng);
            }
        });

        buttonres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String finalresultprint="";
               try{ if(finalone=="") {
                    result = 0;
                    finalresultprint = "" + result;
              }
              else {
                  finaltwo = strchng;
                  strchng = "";
                  strone = Float.parseFloat(finalone);
                  strtwo = Float.parseFloat(finaltwo);

                  finalresultprint = resultclass.operation(strone,strtwo,operation) + "";

              }}catch (Exception e){
                   finalresultprint = "";
               }
                strchng = finalresultprint;
              textView.setText(finalresultprint);
            }
        });



    }
}
