package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sun_11_2 extends AppCompatActivity{

    private Button button;
    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu9Num = 0;
    private int menu10Num = 0;
    private int menu11Num = 0;
    private int menu9Price = 0;
    private int menu10Price = 0;
    private int menu11Price = 0;
    private int checkNum = 0;

    @Override
    protected  void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_2);

        ImageView actionModeCloseDrawable = (ImageView) findViewById(R.id.back7);
        actionModeCloseDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });
        ImageView ic_media_ff = (ImageView) findViewById(R.id.left3);
        ic_media_ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sun_11_1.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.pay2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), payment.class);
                startActivity(intent);
            }
        });
    }

    public void plusOrder9 (View view){
        checkNum = 9;
        menu9Num++;
        displayMenuNum(menu9Num, checkNum);
    }

    public void plusOrder10 (View view){
        checkNum = 10;
        menu10Num++;
        displayMenuNum(menu10Num, checkNum);
    }

    public void plusOrder11 (View view){
        checkNum = 11;
        menu11Num++;
        displayMenuNum(menu11Num, checkNum);
    }
    public void reduceOrder9 (View view){
        if (menu9Num <= 0) {
            menu9Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 9;
        menu9Num--;
        displayMenuNum(menu9Num, checkNum);
    }

    public void reduceOrder10 (View view){
        if (menu10Num <= 0) {
            menu10Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 10;
        menu10Num--;
        displayMenuNum(menu10Num, checkNum);
    }

    public void reduceOrder11 (View view){
        if (menu11Num <= 0) {
            menu11Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 11;
        menu11Num--;
        displayMenuNum(menu11Num, checkNum);
    }

    public void displayMenuNum ( int num, int check) {
        if (check == 9) {
            TextView quantityView = findViewById(R.id.quantity_view9);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 10) {
            TextView quantityView = findViewById(R.id.quantity_view10);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 11) {
            TextView quantityView = findViewById(R.id.quantity_view11);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }
    }
        public void displaySinglePrice(int num, int check){
            int price;
            if (check == 9) {
                price = 5900;
                menu9Price = num * price;
                displayTotalPrice();
            } else if (check == 10) {
                price = 5900;
                menu10Price = num * price;
                displayTotalPrice();
            } else if (check == 11) {
                price = 6500;
                menu11Price = num * price;
                displayTotalPrice();
            }
        }
        public void displayTotalPrice() {
            int totalPrice = menu9Price + menu10Price + menu11Price;
            TextView quantityView = findViewById(R.id.total_price_view);
            quantityView.setText(String.valueOf(totalPrice));
        }
}
