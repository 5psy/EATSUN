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

public class sun_11_3 extends AppCompatActivity{

    Button pay3;
    TextView total_price;
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
    protected  void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_3);

        ImageView back8 = (ImageView) findViewById(R.id.back8);
        back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });
        pay3 = (Button)findViewById(R.id.pay3);
        total_price = (TextView)findViewById(R.id.total_price);
        pay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sun_11_3.this, payment.class);
                intent.putExtra("price", total_price.getText().toString());
                startActivity(intent);
            }
        });

    }
    public void plusOrder22 (View view){
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

    public void reduceOrder22 (View view){
        if (menu22Num <= 0) {
            menu22Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 22;
        menu22Num--;
        displayMenuNum(menu22Num, checkNum);
    }

    public void reduceOrder23 (View view){
        if (menu23Num <= 0) {
            menu23Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 23;
        menu23Num--;
        displayMenuNum(menu23Num, checkNum);
    }

    public void reduceOrder24 (View view){
        if (menu24Num <= 0) {
            menu24Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 24;
        menu24Num--;
        displayMenuNum(menu24Num, checkNum);
    }
    public void reduceOrder25 (View view){
        if (menu25Num <= 0) {
            menu25Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 25;
        menu25Num--;
        displayMenuNum(menu25Num, checkNum);
    }

    public void reduceOrder26 (View view){
        if (menu26Num <= 0) {
            menu26Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 26;
        menu26Num--;
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
        public void displaySinglePrice (int num, int check) {
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
                int totalPrice = menu22Price + menu23Price + menu24Price + menu25Price + menu26Price ;
                TextView quantityView = findViewById(R.id.total_price);
                quantityView.setText(String.valueOf(totalPrice));
            }
        }



