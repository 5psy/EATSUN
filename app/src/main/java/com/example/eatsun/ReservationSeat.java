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
        setContentView(com.example.eatsun.R.layout.sun_09_1);

        ImageView mypage = (ImageView) findViewById(R.id.right2);
        mypage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), sun_9_2.class);
                startActivity(intent);
            }
        });
        /*ToggleButton tb=(ToggleButton)this.findViewById(R.id. seat62); //앞에 FINAL일수
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
        });*/
        Button b50 = (Button) this.findViewById(R.id. seat50);
        Button b51 = (Button) this.findViewById(R.id. seat51);
        Button b52 = (Button) this.findViewById(R.id. seat52);
        Button b53 = (Button) this.findViewById(R.id. seat53);
        Button b54 = (Button) this.findViewById(R.id. seat54);
        Button b55 = (Button) this.findViewById(R.id. seat55);
        Button b56 = (Button) this.findViewById(R.id. seat56);
        Button b57 = (Button) this.findViewById(R.id. seat57);
        Button b58 = (Button) this.findViewById(R.id. seat58);
        Button b59 = (Button) this.findViewById(R.id. seat59);
        Button b60 = (Button) this.findViewById(R.id. seat60);
        Button b61 = (Button) this.findViewById(R.id. seat61);
        Button b62 = (Button) this.findViewById(R.id. seat62);
        Button b63 = (Button) this.findViewById(R.id. seat63);
        Button b64 = (Button) this.findViewById(R.id. seat64);
        Button b65 = (Button) this.findViewById(R.id. seat65);
        Button b66 = (Button) this.findViewById(R.id. seat66);
        Button b67 = (Button) this.findViewById(R.id. seat67);
        Button b68 = (Button) this.findViewById(R.id. seat68);
        Button b69 = (Button) this.findViewById(R.id. seat69);
        Button b70 = (Button) this.findViewById(R.id. seat70);
        Button b71 = (Button) this.findViewById(R.id. seat71);
        Button b72 = (Button) this.findViewById(R.id. seat72);
        Button b73 = (Button) this.findViewById(R.id. seat73);
        Button b74 = (Button) this.findViewById(R.id. seat74);
        Button b75 = (Button) this.findViewById(R.id. seat75);
        Button b76 = (Button) this.findViewById(R.id. seat76);
        Button b77 = (Button) this.findViewById(R.id. seat77);
        Button b78 = (Button) this.findViewById(R.id. seat78);
        Button b79 = (Button) this.findViewById(R.id. seat79);
        Button b80 = (Button) this.findViewById(R.id. seat80);
        Button b81 = (Button) this.findViewById(R.id. seat81);

        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(true);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(true);
                b51.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b51.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b60.setSelected(false);
                b61.setSelected(false);
                b62.setSelected(false);
                b63.setSelected(false);
                b64.setSelected(false);
                b65.setSelected(false);
                b66.setSelected(false);
                b67.setSelected(false);
                b68.setSelected(false);
                b69.setSelected(false);
                b70.setSelected(false);
                b71.setSelected(false);
                b72.setSelected(false);
                b73.setSelected(false);
                b74.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });



    }
}
