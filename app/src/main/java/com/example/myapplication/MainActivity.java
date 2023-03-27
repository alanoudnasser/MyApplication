package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//new comment added

Button send_button;
    EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button=findViewById(R.id.Sendbutton);
        send_text=findViewById(R.id.textView_send);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=send_text.getText().toString();
                Intent intent =new Intent(getApplicationContext(),secondActivity.class);
                intent.putExtra("personName",s);
                startActivity(intent);
            }
        });

    }
}