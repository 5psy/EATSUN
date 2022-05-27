package com.example.eatsun;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class sun_14_2 extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 2400000;
    private long mTimeLeftMillis = START_TIME_IN_MILLIS;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;

    TextView countdown_tv;
    Button button;
    Button buttonReset;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_14_2);
        button = findViewById(R.id.btn);
        buttonReset = findViewById(R.id.reset);
        countdown_tv = findViewById(R.id.countdown_tv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
               /* button.setEnabled(false);
                new CountDownTimer(2400000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        NumberFormat format = new DecimalFormat("00");
                        long minute = (millisUntilFinished/60000)%60;
                        long second = (millisUntilFinished/1000)%60;
                        countdown_tv.setText(format.format(minute)+":"+format.format(second));
                    }

                    @Override
                    public void onFinish() {
                        countdown_tv.setText("00:00");
                        button.setEnabled(true);
                    }
                }.start();*/
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
    }

    private void startTimer(){
        mCountDownTimer = new CountDownTimer(mTimeLeftMillis, 1000) {
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

        mTimerRunning = false;
    }
    private void resetTimer(){
        mCountDownTimer.cancel();
        mTimerRunning = true;
        mTimeLeftMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
    }
    private void updateCountDownText(){
        int min = (int) (mTimeLeftMillis/1000)/60;
        int sec = (int) (mTimeLeftMillis/1000)%60;

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d",min,sec);

        countdown_tv.setText(timeLeftFormatted);
    }
}
