package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sun_11_4 extends AppCompatActivity {

    private Button button;
    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu21Num = 0;
    private int menu21Price = 0;
    private int checkNum = 0;

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

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_4);

        ImageView back8 = (ImageView) findViewById(R.id.back9);
        back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });

        ImageView ic_media_rew = (ImageView) findViewById(R.id.left4);
        ic_media_rew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sun_11_3.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.pay4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), payment.class);
                startActivity(intent);
            }
        });
    }

    public void plusOrder21 (View view){
        checkNum = 21;
        menu21Num++;
        displayMenuNum(menu21Num, checkNum);
    }

    public void reduceOrder21 (View view){
        if (menu21Num <= 0) {
            menu21Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 21;
        menu21Num--;
        displayMenuNum(menu21Num, checkNum);
    }

    public void displayMenuNum ( int num, int check) {
        if (check == 21) {
            TextView quantityView = findViewById(R.id.quantity_view21);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }
    }
    public void displaySinglePrice (int num, int check) {
        int price;
        if (check == 21) {
            price = 4000;
            menu21Price = num * price;
            displayTotalPrice();
        }
    }

    public void displayTotalPrice() {
        int totalPrice = menu21Price;
        TextView quantityView = findViewById(R.id.total_price_view);
        quantityView.setText(String.valueOf(totalPrice));
    }
}

