package com.example.eatsun;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReservationSeat_2 extends AppCompatActivity {


    private Button button6;
    private UserDao nUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_09_2);

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

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "EatSun")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        nUserDao = database.userDao();  //인터페이스 객체 할당
        Userroom user = new Userroom();

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
                user.setSeatnumber("24");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("25");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("26");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("27");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("28");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("29");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("30");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("31");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("32");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("33");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("34");
                nUserDao.setInsertUser(user);
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
                user.setSeatnumber("35");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("36");
                nUserDao.setInsertUser(user);
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
                user.setSeatnumber("37");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("38");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("39");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("40");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("41");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("42");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("43");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("44");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("45");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("46");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("47");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("48");
                nUserDao.setInsertUser(user);

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
                user.setSeatnumber("49");
                nUserDao.setInsertUser(user);

            }

        });
    }
}
