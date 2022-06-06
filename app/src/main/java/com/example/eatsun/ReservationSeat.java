package com.example.eatsun;

import static com.example.eatsun.login.loginId;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ReservationSeat extends AppCompatActivity {

    private Button button, button5;
    private int scheck;
    long now;
    Date date;
    UserAccount userDto = new UserAccount();
    private String reservationTime() {
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        now = System.currentTimeMillis();
        date = new Date(now);
        return format2.format(date);
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
        setContentView(com.example.eatsun.R.layout.sun_09_1);

        ImageView actionModeCloseDrawable = (ImageView) findViewById(R.id.back2);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
        ImageView ic_media_ff = (ImageView) findViewById(R.id.right1);
        ic_media_ff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ReservationSeat_2.class);
                startActivity(intent);
            }
        });


        Button b50 = (Button) this.findViewById(R.id. seat50);
        Button b51 = (Button) this.findViewById(R.id. seat51);
        Button b52 = (Button) this.findViewById(R.id. seat52);
        Button b53 = (Button) this.findViewById(R.id. seat53);
        Button b54 = (Button) this.findViewById(R.id. seat54);
        Button b55 = (Button) this.findViewById(R.id. seat55);
        Button b56 = (Button) this.findViewById(R.id. seat56);
        Button b57 = (Button) this.findViewById(R.id. seat57);
        Button b58 = (Button) this.findViewById(R.id. seat58);
        Button b59 = (Button) this.findViewById(R.id. seat59);
        Button b60 = (Button) this.findViewById(R.id. seat60);
        Button b61 = (Button) this.findViewById(R.id. seat61);
        Button b62 = (Button) this.findViewById(R.id. seat62);
        Button b63 = (Button) this.findViewById(R.id. seat63);
        Button b64 = (Button) this.findViewById(R.id. seat64);
        Button b65 = (Button) this.findViewById(R.id. seat65);
        Button b66 = (Button) this.findViewById(R.id. seat66);
        Button b67 = (Button) this.findViewById(R.id. seat67);
        Button b68 = (Button) this.findViewById(R.id. seat68);
        Button b69 = (Button) this.findViewById(R.id. seat69);
        Button b70 = (Button) this.findViewById(R.id. seat70);
        Button b71 = (Button) this.findViewById(R.id. seat71);
        Button b72 = (Button) this.findViewById(R.id. seat72);
        Button b73 = (Button) this.findViewById(R.id. seat73);
        Button b74 = (Button) this.findViewById(R.id. seat74);
        Button b75 = (Button) this.findViewById(R.id. seat75);
        Button b76 = (Button) this.findViewById(R.id. seat76);
        Button b77 = (Button) this.findViewById(R.id. seat77);
        Button b78 = (Button) this.findViewById(R.id. seat78);
        Button b79 = (Button) this.findViewById(R.id. seat79);
        Button b80 = (Button) this.findViewById(R.id. seat80);
        Button b81 = (Button) this.findViewById(R.id. seat81);
        button5 = findViewById(R.id.complete);

        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(true);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 50;
            }
        });
        ImageView btNext = (ImageView) findViewById(R.id.right1);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReservationSeat.this, ReservationSeat_2.class);
                startActivity(intent);
            }
        });
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b51.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 51;
            }
        });
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b52.setSelected(true);
                b50.setSelected(false);
                b51.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 52;
            }
        });
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b53.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b51.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 53;
            }
        });
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b54.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b51.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 54;
            }
        });
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b55.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b51.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 55;
            }
        });
        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b56.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b51.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 56;
            }
        });
        b57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b57.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b51.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 57;
            }
        });
        b58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b58.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b51.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 58;
            }
        });
        b59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b59.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b51.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 59;
            }
        });
        b60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b60.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b51.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 60;
            }
        });
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(true);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 61;
            }
        });
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(true);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 62;
            }
        });
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(true);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 63;
            }
        });
        b64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b51.setSelected(false);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(true);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 64;
            }
        });
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(true);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 65;
            }
        });
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b66.setSelected(true);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b50.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 66;
            }
        });
        b67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b67.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b51.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 67;
            }
        });
        b68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b68.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b51.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 68;
            }
        });
        b69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b69.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b51.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 69;
            }
        });
        b70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b70.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b51.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 70;
            }
        });
        b71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b71.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b51.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 71;
            }
        });
        b72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b72.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b51.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 72;
            }
        });
        b73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b73.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b51.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 73;
            }
        });
        b74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b74.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b51.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 74;
            }
        });
        b75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b75.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b51.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 75;
            }
        });
        b76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b76.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b51.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 76;
            }
        });
        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b77.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b51.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 77;
            }
        });
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b78.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b51.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 78;
            }
        });
        b79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b79.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b51.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
                scheck = 79;
            }
        });
        b80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b80.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b51.setSelected(false);
                b81.setSelected(false);
                scheck = 80;
            }
        });
        b81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b81.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b51.setSelected(false);
                scheck = 81;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReservationTimeAdd reservationTimeAdd = new ReservationTimeAdd();

                for (int i = 50; i <= 81; i++){
                    if(scheck == i){
                        updateSeat(i, reservationTime());
                        //updateUser(i, userDto,true, "현재 시간", "남은시간");
                    }
                    else{
                        //updateUser(userDto);
                    }
                }

                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });

    }
    public void updateSeat(int position, String reservationTime) {
        String key = databaseReference.child("EatSun").push().getKey();
        SeatDto seatDb = new SeatDto(position+1, loginId, true, reservationTime);
        Map<String, Object> postValues = seatDb.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put((position + 1) + "seat", postValues);
        databaseReference.updateChildren(childUpdates);
    }
    public void updateUser(int position, UserAccount userDto, boolean reservationCheck, String reservationTime, String remainTime) {
        userDto.setSeatNum(position + 1);
        userDto.setReservationCheck(reservationCheck);
        userDto.setReservationDate(reservationTime);
        userDto.setRemainTime(remainTime);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }

    public void updateUser(UserAccount userDto) {
        userDto.setReservationCheck(false);
        userDto.setReservationDate("");
        userDto.setRemainTime("");
        userDto.setSeatNum(0);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }

    public void updateUser(UserAccount userDto, String renewTime) {
        userDto.setRemainTime(renewTime);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);

    }
}
