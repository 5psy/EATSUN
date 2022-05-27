package com.example.eatsun;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Countdown extends AppCompatActivity {
    private TextView timertextview;
    private Button startbutton;
    private CountDownTimer countDownTimer;
    private int remainingtime = 60;

    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.sun_14_2);
        timertextview = findViewById(R.id.textviewID);
        startbutton = findViewById(R.id.buttonId);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.start();
            }
        });

        countDownTimer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                remainingtime = (int) millisUntilFinished / 1000;
                timertextview.setText(String.valueOf(remainingtime));
            }

            @Override
            public void onFinish() {
                timertextview.setText("Finished");
            }
        };

    }


}
