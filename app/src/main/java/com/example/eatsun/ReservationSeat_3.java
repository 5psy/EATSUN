package com.example.eatsun;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ReservationSeat_3 extends AppCompatActivity {

    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_09_3);

        ImageView actionModeCloseDrawable = (ImageView) findViewById(R.id.back4);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
        ImageView ic_media_rew = (ImageView) findViewById(R.id.left2);
        ic_media_rew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReservationSeat_2.class);
                startActivity(intent);
            }
        });
        button7 = findViewById(R.id.complete3);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });
    }
}

