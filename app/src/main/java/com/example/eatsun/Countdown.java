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
    private TextView countdown;
    private Button in;

    private CountDownTimer mcountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_14_2);

        countdown = findViewById(R.id.countdown);
        in = findViewById(R.id.in);

        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning){
                    pauseTimer();
                }else{
                    startTimer();
                }
            }

            private void startTimer() {
                mcountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        mTimeLeftInMillis = millisUntilFinished;
                        updateCountDownText();
                    }

                    @Override
                    public void onFinish() {
                        mTimerRunning = false;
                        in.setText("Start");
                        in.setVisibility(View.INVISIBLE);
                    }
                }.start();

                mTimerRunning = true;
                in.setText("pause");
            }
            private void pauseTimer(){
                mcountDownTimer.cancel();
                mTimerRunning = false;
            }
            private void updateCountDownText(){
                int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
                int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d분 %02d초", minutes, seconds);

                countdown.setText(timeLeftFormatted);
        }
        });

    }
}
