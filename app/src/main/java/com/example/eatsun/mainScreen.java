package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Calendar;


public class mainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_03);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        TextView textview = findViewById(R.id.text_view_date);
        textview.setText(currentDate);
    }

}

