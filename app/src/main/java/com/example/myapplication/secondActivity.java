package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView t=findViewById(R.id.received_value_id);
        Intent i =getIntent();
        String s = ((Intent)i).getStringExtra("personName");
        t.setText("Hello ,"+s+"!");

    }
}