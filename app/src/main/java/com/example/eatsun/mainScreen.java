package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.text.DateFormat;
import java.util.Calendar;


public class mainScreen extends AppCompatActivity {

    ImageSlider imageSlider;
    ViewPager viewPager;
    private Button button;

    private long pressedTime = 0;
    @Override
    public void onBackPressed(){
        if(System.currentTimeMillis() > pressedTime + 2000 ){
            pressedTime = System.currentTimeMillis();
            Toast.makeText(this, "한 번 더 누르면 종료됩니다.",Toast.LENGTH_SHORT).show();
        }
        else if (System.currentTimeMillis() <= pressedTime + 2000){
            finishAffinity();
            System.runFinalization();
            System.exit(0);
        }
    }

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

        button = findViewById(R.id.resbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(mainScreen.this,ReservationSeat.class);
                startActivity(intent2);

            }
        });
        //ImageView mypage;
        ImageView mypage = (ImageView) findViewById(R.id.mypage);
        mypage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), sun_14_1.class);
                startActivity(intent);
            }
        });
    }
}

