package com.example.eatsun;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.room.Room;

public class ReservationSeat_3 extends AppCompatActivity {

    private Button button7;
    //private UserDao oUserDao;

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

        /*UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "EatSun")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        //oUserDao = database.userDao();  //인터페이스 객체 할당 //m,n,o 달라도 문제없지?
        Userroom user = new Userroom();*/

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

                //user.setSeatnumber("1");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("2");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("3");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("4");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("5");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("6");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("7");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("8");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("9");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("10");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("11");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("12");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("13");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("14");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("15");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("16");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("17");
                //oUserDao.setInsertUser(user);

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

                //user.setSeatnumber("18");
                //oUserDao.setInsertUser(user);

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
                b1.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);

                //user.setSeatnumber("20");
                //oUserDao.setInsertUser(user);

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
                b1.setSelected(false);
                b20.setSelected(false);
                b1.setSelected(false);
                b22.setSelected(false);
                b23.setSelected(false);

                //user.setSeatnumber("21");
                //oUserDao.setInsertUser(user);

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
                b1.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b1.setSelected(false);
                b23.setSelected(false);

                //user.setSeatnumber("22");
                //oUserDao.setInsertUser(user);

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
                b1.setSelected(false);
                b20.setSelected(false);
                b21.setSelected(false);
                b22.setSelected(false);
                b1.setSelected(false);

                //user.setSeatnumber("23");
                //oUserDao.setInsertUser(user);

            }
        });



    }
}

