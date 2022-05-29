package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.annotations.Nullable;

import java.util.Locale;

public class countdown extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 2400000;
    private long mTimeLeftMillis = START_TIME_IN_MILLIS;
    TextView countdown_tv;
    Button buttonenter, buttonexit;
    CountDownTimer CountDownTimer;
    boolean TimerRunning;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.sun_14_2);

        buttonenter = findViewById(R.id.enter);
        buttonexit = findViewById(R.id.exit);
        countdown_tv = findViewById(R.id.countdown_tv);

        buttonenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });

        buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //resetTimer();
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
    }
    private void startTimer(){
        CountDownTimer = new CountDownTimer(mTimeLeftMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                countdown_tv.setText("00:00");
            }
        }.start();

        TimerRunning = false;
    }
/*    private void resetTimer(){
        CountDownTimer.cancel();
        TimerRunning = true;
        mTimeLeftMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
    }*/
    private void updateCountDownText(){
        int min = (int) (mTimeLeftMillis/1000)/60;
        int sec = (int) (mTimeLeftMillis/1000)%60;
        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d",min,sec);
        countdown_tv.setText(timeLeftFormatted);
    }
}


