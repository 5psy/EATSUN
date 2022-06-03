package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class sun_14_2 extends AppCompatActivity {
    Button button, buttonexit;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_14_2);

        button = findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "입장하셨습니다.",Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(sun_14_2.this,countdown.class);
                startActivity(intent);
            }
        });
        buttonexit = findViewById(R.id.exit);
        buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "입장 버튼 클릭 후 퇴장 가능합니다.",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        ImageView back13 = (ImageView) findViewById(R.id.back13);
        back13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
        textView = findViewById(R.id.countdown_tv);
        long duration = TimeUnit.MINUTES.toMillis(10);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                String sDuration = String.format(Locale.ENGLISH,"%02d:%02d"
                , TimeUnit.MILLISECONDS.toMinutes(l)
                ,TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                textView.setText(sDuration);
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"입장하셨습니다.", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(sun_14_2.this, countdown.class);                    // 자동 화면전환
                        startActivity(intent);
                    }
                }, 1000);
            }
        }.start();
    }
}
