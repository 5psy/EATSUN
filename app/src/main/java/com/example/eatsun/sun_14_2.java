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

public class sun_14_2 extends AppCompatActivity {
    TextView countdown_tv;
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_14_2);
        button = findViewById(R.id.btn);
        countdown_tv = findViewById(R.id.countdown_tv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(false);
                new CountDownTimer(100000, 1000) {
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
                }.start();
            }
        });
    }
}
