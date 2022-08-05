package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText x = findViewById(R.id.x);
        EditText name = findViewById(R.id.name);
        Button p = findViewById(R.id.p);
        TextView t =findViewById(R.id.t);
        TextView b =findViewById(R.id.b);
    }
}