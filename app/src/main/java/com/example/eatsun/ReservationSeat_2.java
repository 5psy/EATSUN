package com.example.eatsun;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.eatsun.login.loginId;
import androidx.room.Room;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

public class ReservationSeat_2 extends AppCompatActivity {
    private Button button6;
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
        setContentView(R.layout.sun_09_2);
        context = this;

        ImageView actionModeCloseDrawable = (ImageView) findViewById(R.id.back3);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
        ImageView ic_media_rew = (ImageView) findViewById(R.id.left1);
        ic_media_rew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReservationSeat.class);
                startActivity(intent);
            }
        });
        ImageView ic_media_ff = (ImageView) findViewById(R.id.right2);
        ic_media_ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReservationSeat_3.class);
                startActivity(intent);
            }
        });

        button6 = findViewById(R.id.complete2);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });
        Button b24 = (Button) this.findViewById(R.id.seat24);
        Button b25 = (Button) this.findViewById(R.id.seat25);
        Button b26 = (Button) this.findViewById(R.id.seat26);
        Button b27 = (Button) this.findViewById(R.id.seat27);
        Button b28 = (Button) this.findViewById(R.id.seat28);
        Button b29 = (Button) this.findViewById(R.id.seat29);
        Button b30 = (Button) this.findViewById(R.id.seat30);
        Button b31 = (Button) this.findViewById(R.id.seat31);
        Button b32 = (Button) this.findViewById(R.id.seat32);
        Button b33 = (Button) this.findViewById(R.id.seat33);
        Button b34 = (Button) this.findViewById(R.id.seat34);
        Button b35 = (Button) this.findViewById(R.id.seat35);
        Button b36 = (Button) this.findViewById(R.id.seat36);
        Button b37 = (Button) this.findViewById(R.id.seat37);
        Button b38 = (Button) this.findViewById(R.id.seat38);
        Button b39 = (Button) this.findViewById(R.id.seat39);
        Button b40 = (Button) this.findViewById(R.id.seat40);
        Button b41 = (Button) this.findViewById(R.id.seat41);
        Button b42 = (Button) this.findViewById(R.id.seat42);
        Button b43 = (Button) this.findViewById(R.id.seat43);
        Button b44 = (Button) this.findViewById(R.id.seat44);
        Button b45 = (Button) this.findViewById(R.id.seat45);
        Button b46 = (Button) this.findViewById(R.id.seat46);
        Button b47 = (Button) this.findViewById(R.id.seat47);
        Button b48 = (Button) this.findViewById(R.id.seat48);
        Button b49 = (Button) this.findViewById(R.id.seat49);


        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b24.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 24;

            }

        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b25.setSelected(true);
                b24.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 25;

            }

        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b26.setSelected(true);
                b25.setSelected(false);
                b24.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 26;


            }

        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b27.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b24.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 27;
            }

        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b28.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b24.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 28;
            }

        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b29.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b24.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 29;

            }

        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b30.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b24.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 30;

            }

        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b31.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b24.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 31;

            }

        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b32.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b24.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 32;

            }

        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b33.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b24.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 33;

            }

        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b34.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b24.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 34;
            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b35.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b24.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 35;
            }

        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b36.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b24.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 36;
            }
        });
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b37.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b24.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 37;

            }

        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b38.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b24.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 38;

            }

        });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b39.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b24.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 39;

            }

        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b40.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b24.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 40;

            }

        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b41.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b24.setSelected(false);
                b24.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 41;

            }

        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b42.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b24.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 42;

            }

        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b43.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b24.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 43;

            }

        });
        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b44.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b24.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 44;

            }

        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b45.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b24.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 45;

            }

        });
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b46.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b24.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 46;

            }

        });
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b47.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b24.setSelected(false);
                b48.setSelected(false);
                b49.setSelected(false);
                scheck = 47;

            }

        });
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b48.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b24.setSelected(false);
                b49.setSelected(false);
                scheck = 48;

            }

        });
        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b49.setSelected(true);
                b25.setSelected(false);
                b26.setSelected(false);
                b27.setSelected(false);
                b28.setSelected(false);
                b29.setSelected(false);
                b30.setSelected(false);
                b31.setSelected(false);
                b32.setSelected(false);
                b33.setSelected(false);
                b34.setSelected(false);
                b35.setSelected(false);
                b36.setSelected(false);
                b37.setSelected(false);
                b38.setSelected(false);
                b39.setSelected(false);
                b40.setSelected(false);
                b41.setSelected(false);
                b42.setSelected(false);
                b43.setSelected(false);
                b44.setSelected(false);
                b45.setSelected(false);
                b46.setSelected(false);
                b47.setSelected(false);
                b48.setSelected(false);
                b24.setSelected(false);
                scheck = 49;

            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReservationTimeAdd reservationTimeAdd = new ReservationTimeAdd();
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
                for (int i = 24; i <= 49; i++){
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
