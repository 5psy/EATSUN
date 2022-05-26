package com.example.eatsun;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Countdown extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 2400000;

    private TextView mTextViewCountDown;
    private Button mButtonStartPause;

    private  CountDownTimer mCountDownTimer;

    private boolean mTimerRunning;

    private long mTimerLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.sun_14_2);

        mTextViewCountDown = findViewById(R.id.text_view_contdown);
        mButtonStartPause = findViewById(R.id.button_start_pause);

        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mTimerRunning){
                    pauseTimer();
                } else{
                    startTimer();
                }

            }
        });
    }

    private void startTimer(){
        mCountDownTimer=new CountDownTimer(mTimerLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimerLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                mButtonStartPause.setText("입장");
                mButtonStartPause.setVisibility(View.VISIBLE);

            }
        }.start();

        mTimerRunning = true;
        mButtonStartPause.setText("입장");
    }

    private void pauseTimer(){
        mCountDownTimer.cancel();
        mTimerRunning = false;
        mButtonStartPause.setText("입장");
    }
    private void updateCountDownText(){
        int minutes = (int) ( mTimerLeftInMillis / 1000 ) / 60;
        int seconds = (int) ( mTimerLeftInMillis / 1000 ) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        mTextViewCountDown.setText(timeLeftFormatted);
    }
}
