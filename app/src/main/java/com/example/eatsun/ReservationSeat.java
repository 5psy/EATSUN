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

    private Button button, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.eatsun.R.layout.sun_09_1);

        ImageView actionModeCloseDrawable = (ImageView) findViewById(R.id.back2);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                startActivity(intent);
            }
        });
        ImageView ic_media_ff = (ImageView) findViewById(R.id.right2);
        ic_media_ff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ReservationSeat_2.class);
                startActivity(intent);
            }
        });

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
        button5 = findViewById(R.id.complete);

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
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b52.setSelected(true);
                b50.setSelected(false);
                b51.setSelected(false);
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
        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b53.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b51.setSelected(false);
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
        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b54.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b51.setSelected(false);
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
        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b55.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b51.setSelected(false);
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
        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b56.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b51.setSelected(false);
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
        b57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b57.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b51.setSelected(false);
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
        b58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b58.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b51.setSelected(false);
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
        b59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b59.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b51.setSelected(false);
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
        b60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b60.setSelected(true);
                b50.setSelected(false);
                b52.setSelected(false);
                b53.setSelected(false);
                b54.setSelected(false);
                b55.setSelected(false);
                b56.setSelected(false);
                b57.setSelected(false);
                b58.setSelected(false);
                b59.setSelected(false);
                b51.setSelected(false);
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
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
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
                b61.setSelected(true);
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
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
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
                b62.setSelected(true);
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
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
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
                b63.setSelected(true);
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
        b64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b51.setSelected(false);
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
                b64.setSelected(true);
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
        b65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b50.setSelected(false);
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
                b65.setSelected(true);
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
        b66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b66.setSelected(true);
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
                b50.setSelected(false);
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
        b67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b67.setSelected(true);
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
                b51.setSelected(false);
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
        b68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b68.setSelected(true);
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
                b51.setSelected(false);
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
        b69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b69.setSelected(true);
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
                b51.setSelected(false);
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
        b70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b70.setSelected(true);
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
                b51.setSelected(false);
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
        b71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b71.setSelected(true);
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
                b51.setSelected(false);
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
        b72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b72.setSelected(true);
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
                b51.setSelected(false);
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
        b73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b73.setSelected(true);
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
                b51.setSelected(false);
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
        b74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b74.setSelected(true);
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
                b51.setSelected(false);
                b75.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b75.setSelected(true);
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
                b51.setSelected(false);
                b76.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b76.setSelected(true);
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
                b51.setSelected(false);
                b77.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b77.setSelected(true);
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
                b51.setSelected(false);
                b78.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b78.setSelected(true);
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
                b51.setSelected(false);
                b79.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b79.setSelected(true);
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
                b51.setSelected(false);
                b80.setSelected(false);
                b81.setSelected(false);
            }
        });
        b80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b80.setSelected(true);
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
                b51.setSelected(false);
                b81.setSelected(false);
            }
        });
        b81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b81.setSelected(true);
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
                b51.setSelected(false);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });

    }
}
