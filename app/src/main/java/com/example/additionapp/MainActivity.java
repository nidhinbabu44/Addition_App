package com.example.additionapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1;
String getNum1,getNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.num1);
        ed2=(EditText) findViewById(R.id.num2);
        b1=(AppCompatButton) findViewById(R.id.addbut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a= Integer.parseInt(ed1.getText().toString());
                int b= Integer.parseInt(ed2.getText().toString());
                int sum=a+b;
                Intent i=new Intent(getApplicationContext(),ResultActivity.class);
                i.putExtra("key",sum);
                startActivity(i);

            }
        });
    }
}