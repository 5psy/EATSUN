package com.example.eatsun;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class payment extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        ImageView btn_dialog =  (ImageView) findViewById(R.id.cancel);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReservationSeat.class);
                startActivity(intent);
            }
        });

        ImageView card = (ImageView) findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), sun_14_2.class);
                startActivity(intent);
            }
        });
    }
}
