package com.example.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {
EditText ed1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ed1=(EditText) findViewById(R.id.test);
        int result=getIntent().getExtras().getInt("key",0);
        String i=String.valueOf(result);
        ed1.setText(i);
    }
}