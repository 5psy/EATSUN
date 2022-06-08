package com.example.eatsun;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.eatsun.login.loginId;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.Window;

import androidx.annotation.NonNull;
import com.example.eatsun.R;
import com.example.eatsun.UserAccount;
import com.example.eatsun.TimeConvert;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.example.eatsun.ReservationTimeAdd;
import com.example.eatsun.Dao;
import com.example.eatsun.Function;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservationSeat_3 extends AppCompatActivity {

    private Button button7;
    private int scheck;
    long now;
    Date date;
    UserAccount userDto = new UserAccount();
    Function function = new Function();
    List<SeatDto> seatDto;
    static Context context;

    //예약한 시간
    private String reservationTime() {
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        now = System.currentTimeMillis();
        date = new Date(now);
        return format2.format(date);
    }
    private String displayTime() {
        SimpleDateFormat format = new SimpleDateFormat("조회일자 : yyyy년 MM월 dd일 \n현재시간 : HH시 mm분 ss초");
        now = System.currentTimeMillis();
        date = new Date(now);
        return format.format(date);
    }

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

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference("EatSun");

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
        Button b1 = (Button) this.findViewById(R.id. seat1);
        Button b2 = (Button) this.findViewById(R.id. seat2);
        Button b3 = (Button) this.findViewById(R.id. seat3);
        Button b4 = (Button) this.findViewById(R.id. seat4);
        Button b5 = (Button) this.findViewById(R.id. seat5);
        Button b6 = (Button) this.findViewById(R.id. seat6);
        Button b7 = (Button) this.findViewById(R.id. seat7);
        Button b8 = (Button) this.findViewById(R.id. seat8);
        Button b9 = (Button) this.findViewById(R.id. seat9);
        Button b10 = (Button) this.findViewById(R.id. seat10);
        Button b11 = (Button) this.findViewById(R.id. seat11);
        Button b12 = (Button) this.findViewById(R.id. seat12);
        Button b13 = (Button) this.findViewById(R.id. seat13);
        Button b14 = (Button) this.findViewById(R.id. seat14);
        Button b15 = (Button) this.findViewById(R.id. seat15);
        Button b16 = (Button) this.findViewById(R.id. seat16);
        Button b17 = (Button) this.findViewById(R.id. seat17);
        Button b18 = (Button) this.findViewById(R.id. seat18);
        Button b19 = (Button) this.findViewById(R.id. seat19);
        Button b20 = (Button) this.findViewById(R.id. seat20);
        Button b21 = (Button) this.findViewById(R.id. seat21);
        Button b22 = (Button) this.findViewById(R.id. seat22);
        Button b23 = (Button) this.findViewById(R.id. seat23);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 1;

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b2.setSelected(true);
                b1.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 2;

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b3.setSelected(true);
                b2.setSelected(false);
                b1.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 3;

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b4.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b1.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 4;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b5.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b1.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 5;

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b6.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b1.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 6;

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b7.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b1.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 7;

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b8.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b1.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 8;

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b9.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b1.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 9;

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b10.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b1.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 10;

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b11.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b1.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 11;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b12.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b1.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 12;

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b13.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b1.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 13;
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b14.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b1.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 14;

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b15.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b1.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 15;

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b16.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 16;
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b17.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b1.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 17;

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b18.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b1.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 18;

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b19.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b1.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 19;

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b20.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b1.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 20;

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b21.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b1.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);
                scheck = 21;

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b22.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b1.setSelected(false);
                b23.setSelected(false);
                scheck = 22;
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b23.setSelected(true);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
                b9.setSelected(false);
                b10.setSelected(false);
                b11.setSelected(false);
                b12.setSelected(false);
                b13.setSelected(false);
                b14.setSelected(false);
                b15.setSelected(false);
                b16.setSelected(false);
                b17.setSelected(false);
                b18.setSelected(false);
                b19.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b1.setSelected(false);
                scheck = 23;

            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReservationTimeAdd reservationTimeAdd = new ReservationTimeAdd();
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
                for (int i = 50; i <= 81; i++){
                    if(scheck == i){
                        //updateSeat(i, reservationTime());
                        function.reservationSeat(i, userDto, seatDto, reservationTime());
                        //updateUser(i, userDto,true, "현재 시간", "남은시간");
                        Toast.makeText(context, (i) + "번 자리가 예약되었습니다.", Toast.LENGTH_SHORT).show();
                        TimeConvert timeConvert = new TimeConvert(userDto.getRemainTime());
                        Long timeValue = timeConvert.getDifferent();
                    }
                    else{
                        //updateUser(userDto);
                    }
                }
            }
        });
    }
}

