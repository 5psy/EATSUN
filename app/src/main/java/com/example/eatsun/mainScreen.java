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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class mainScreen extends AppCompatActivity {

    ImageSlider imageSlider;
    ViewPager viewPager;
    private Button button;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

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

        //왼쪽 상단 오늘 날짜 구현
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        TextView textview = findViewById(R.id.text_view_date);
        textview.setText(currentDate);

        //mainscreen 스크롤 구현
        viewPager = (ViewPager) findViewById(R.id.view);
        imageSlider = new ImageSlider(this);
        viewPager.setAdapter(imageSlider);

        //'예약하기'누른 경우 reservationseat으로 이동
        button = findViewById(R.id.resbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(mainScreen.this,ReservationSeat.class);
                startActivity(intent2);

            }
        });
        //오른쪽 상단 두줄 버튼 누르면 마이페이지로 이동
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

