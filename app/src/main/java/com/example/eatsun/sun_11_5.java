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

public class sun_11_5 extends AppCompatActivity {

    private Button button;
    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu22Num = 0;
    private int menu23Num = 0;
    private int menu24Num = 0;
    private int menu25Num = 0;
    private int menu26Num = 0;
    private int menu22Price = 0;
    private int menu23Price = 0;
    private int menu24Price = 0;
    private int menu25Price = 0;
    private int menu26Price = 0;
    private int checkNum = 0;

    @Override
    protected  void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_5);

        ImageView back10 = (ImageView) findViewById(R.id.back11);
        back10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });
        button=findViewById(R.id.pay5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), payment.class);
                startActivity(intent);
            }
        });

    }

    public void plusOrder31 (View view){
        checkNum = 22;
        menu22Num++;
        displayMenuNum(menu22Num, checkNum);
    }

    public void plusOrder23 (View view){
        checkNum = 23;
        menu23Num++;
        displayMenuNum(menu23Num, checkNum);
    }

    public void plusOrder24 (View view){
        checkNum = 24;
        menu24Num++;
        displayMenuNum(menu24Num, checkNum);
    }

    public void plusOrder25 (View view){
        checkNum = 25;
        menu25Num++;
        displayMenuNum(menu25Num, checkNum);
    }

    public void plusOrder26 (View view){
        checkNum = 26;
        menu26Num++;
        displayMenuNum(menu26Num, checkNum);
    }


    public void displayMenuNum ( int num, int check) {
        if (check == 22) {
            TextView quantityView = findViewById(R.id.quantity_view22);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 23) {
            TextView quantityView = findViewById(R.id.quantity_view23);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 24) {
            TextView quantityView = findViewById(R.id.quantity_view24);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 25) {
            TextView quantityView = findViewById(R.id.quantity_view25);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 26) {
            TextView quantityView = findViewById(R.id.quantity_view26);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }
    }
    public void displaySinglePrice(int num, int check){
        int price;
        if (check == 22) {
            price = 5500;
            menu22Price = num * price;
            displayTotalPrice();
        } else if (check == 23) {
            price = 5500;
            menu23Price = num * price;
            displayTotalPrice();
        } else if (check == 24) {
            price = 5900;
            menu24Price = num * price;
            displayTotalPrice();
        } else if (check == 25) {
            price = 7900;
            menu25Price = num * price;
            displayTotalPrice();
        } else if (check == 26) {
            price = 1000;
            menu26Price = num * price;
            displayTotalPrice();
        }
    }
    public void displayTotalPrice() {
        int totalPrice = menu22Price + menu23Price + menu24Price + menu25Price + menu26Price;
        TextView quantityView = findViewById(R.id.total_price_view);
        quantityView.setText(String.valueOf(totalPrice));
    }
}
