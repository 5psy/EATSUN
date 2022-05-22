package com.example.eatsun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ReservationSeat extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_09_1);

        ImageView mypage = (ImageView) findViewById(R.id.right2);
        mypage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), sun_9_2.class);
                startActivity(intent);
            }
        });
        ToggleButton tb=(ToggleButton)this.findViewById(R.id. seat62); //앞에 FINAL일수
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tb.isChecked()){
                    tb.setBackgroundColor(Color.BLACK);
                    tb.setTextColor(Color.BLACK);
                }else{
                    tb.setBackgroundColor(Color.WHITE);
                }
            }
        });
        Button butn=(Button)this.findViewById(R.id. seat60); //앞에 FINAL일수
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(butn.isClickable()){
                    butn.setBackgroundColor(Color.BLACK);
                    butn.setTextColor(Color.BLACK);
                }else{
                    butn.setBackgroundColor(Color.WHITE);
                }
            }
        });

    }
}
