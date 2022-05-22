package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.text.DateFormat;
import java.util.Calendar;


public class mainScreen extends AppCompatActivity {

    ImageSlider imageSlider;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_03);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        TextView textview = findViewById(R.id.text_view_date);
        textview.setText(currentDate);
        viewPager = (ViewPager) findViewById(R.id.view);
        imageSlider = new ImageSlider(this);
        viewPager.setAdapter(imageSlider);

        ImageView developer_info_btn = (ImageView) findViewById(R.id.mypage);
        developer_info_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), sun_14_1.class);
                startActivity(intent);
            }
        });
    }

}

