package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.annotations.Nullable;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class countdown extends AppCompatActivity {
//  private static final long START_TIME_IN_MILLIS = 2400000;
//  private long mTimeLeftMillis = START_TIME_IN_MILLIS;
    TextView countdown_tv;
    Button buttonenter, buttonexit;
 //  CountDownTimer CountDownTimer;
 //  boolean TimerRunning;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.sun_14_2);

        buttonenter = findViewById(R.id.enter);
        buttonexit = findViewById(R.id.exit);
        countdown_tv = findViewById(R.id.countdown_tv);

/*        buttonenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });*/

        textView = findViewById(R.id.countdown_tv);

        long duration = TimeUnit.MINUTES.toMillis(40);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {

                String sDuration = String.format(Locale.ENGLISH,"%02d:%02d"
                        , TimeUnit.MILLISECONDS.toMinutes(l)
                        , TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));   //40분 사용시간 시작

                textView.setText(sDuration);
            }

            @Override
            public void onFinish() {
                textView.setVisibility(View.GONE);

                Toast.makeText(getApplicationContext(),"Countdown timer has ended", Toast.LENGTH_SHORT).show();            //40분 사용시간 끝나면
            }
        }.start();

        ImageView back13 = (ImageView) findViewById(R.id.back13);
        back13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });

        buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //resetTimer();
                Toast toast = Toast.makeText(getApplicationContext(), "퇴장하셨습니다.",Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);     //퇴장버튼 누르면 메인화면으로..
                startActivity(intent);
            }
        });
    }
/*    private void startTimer(){
    CountDownTimer = new CountDownTimer(mTimeLeftMillis, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            mTimeLeftMillis = millisUntilFinished;
            updateCountDownText();
        }
        @Override
        public void onFinish() {
            countdown_tv.setText("00:00");
            textView.setVisibility(View.GONE);

            Toast.makeText(getApplicationContext()
                    ,"Countdown timer has ended", Toast.LENGTH_SHORT).show();
        }
    }.start();

    TimerRunning = false;
}*/
    /*    private void resetTimer(){
            CountDownTimer.cancel();
            TimerRunning = true;
            mTimeLeftMillis = START_TIME_IN_MILLIS;
            updateCountDownText();
        }*/
    /*private void updateCountDownText(){
        int min = (int) (mTimeLeftMillis/1000)/60;
        int sec = (int) (mTimeLeftMillis/1000)%60;
        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d",min,sec);
        countdown_tv.setText(timeLeftFormatted);
    }*/
}


