package com.example.eatsun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Date;

public class date extends AppCompatActivity {
    TextView timeView;
    long now_Time = System.currentTimeMillis();
    Date date = new Date(now_Time);

    SimpleDateFormat CurDateFormat = new SimpleDateFormat("yyyy.MM.dd");
    SimpleDateFormat CurYearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat CurMonthFormat = new SimpleDateFormat("MM");
    SimpleDateFormat CurDayFormat = new SimpleDateFormat("dd");

    String strCurDate = CurDateFormat.format(date);
    String strCurYear = CurYearFormat.format(date);
    String strCurMonth = CurMonthFormat.format(date);
    String strCurDay = CurDayFormat.format(date);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_03);

        timeView = (TextView)findViewById(R.id.txt_curTime(date));
        timeView.setText(strCurYear + ". " + strCurMonth + ". " + strCurDay);

    }
}
