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

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.annotations.Nullable;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class countdown extends AppCompatActivity {
    TextView countdown_tv;
    Button buttonenter, buttonexit, button;
    TextView textView;

    //뒤로가기 버튼 두 번 클릭 시 앱 종료
    private long pressedTime = 0;
    @Override
    public void onBackPressed(){
        if(System.currentTimeMillis() > pressedTime + 2000 ){
            pressedTime = System.currentTimeMillis();
            Toast.makeText(this, "한 번 더 누르면 종료됩니다.",Toast.LENGTH_SHORT).show();
        }
        else if (System.currentTimeMillis() <= pressedTime + 2000){
            finishAffinity();
            System.runFinalization();
            System.exit(0);
        }
    }
    TextView textView1[] = new TextView[1];
    int arr_textview_id[] = {R.id.random_text1};

    Button mbtn_random;

    Integer arr_random_num[] = new Integer[1];
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_14_2);

        for (int i = 0; i < arr_textview_id.length; i++) {
            final int index;
            index = i;
            textView1[index] = findViewById(arr_textview_id[index]);
        }

        mbtn_random = findViewById(R.id.random_btn);

        mbtn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                for (int i = 0; i < arr_random_num.length; i++) {
                    int arr_random_num = random.nextInt(100) + 1;


                    textView1[i].setText(Integer.toString(arr_random_num));
                }
            }
        });

        buttonenter = findViewById(R.id.enter);
        buttonexit = findViewById(R.id.exit);
        //countdown_tv = findViewById(R.id.countdown_tv);

        //40분 사용시간 시작
        textView = findViewById(R.id.countdown_tv);
        long duration = TimeUnit.MINUTES.toMillis(40);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                String sDuration = String.format(Locale.ENGLISH,"%02d:%02d"
                        , TimeUnit.MILLISECONDS.toMinutes(l)
                        , TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));

                textView.setText(sDuration);
            }
            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"퇴장하셨습니다.", Toast.LENGTH_SHORT).show();   //40분 사용시간 끝나면
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(countdown.this,mainScreen.class);                // 자동 화면전환
                        startActivity(intent);
                    }
                }, 1000);
            }
        }.start();
        //뒤로가기 버튼
        ImageView back11 = (ImageView) findViewById(R.id.back11);
        back11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
        //로그아웃 버튼
        button = findViewById(R.id.logout);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "로그아웃 되었습니다.",Toast.LENGTH_SHORT);
                toast.show();
                Intent i = new Intent(countdown.this, login.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(i);
            }
        });
        //퇴장 버튼
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
}


