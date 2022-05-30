package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sun_11_1 extends AppCompatActivity {
    Button button;

    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu1Num = 0;
    private int menu2Num = 0;
    private int menu3Num = 0;
    private int menu4Num = 0;
    private int menu5Num = 0;
    private int menu6Num = 0;
    private int menu7Num = 0;
    private int menu8Num = 0;
    private int menu1Price = 0;
    private int menu2Price = 0;
    private int menu3Price = 0;
    private int menu4Price = 0;
    private int menu5Price = 0;
    private int menu6Price = 0;
    private int menu7Price = 0;
    private int menu8Price = 0;
    private int checkNum = 0;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_1);

        ImageView back6 = (ImageView) findViewById(R.id.back6);
        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                    startActivity(intent);
                }
            });
        ImageView ic_media_ff = (ImageView) findViewById(R.id.right3);
        ic_media_ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sun_11_2.class);
                startActivity(intent);
            }
        });
    }

            public void plusOrder1 (View view){
                checkNum = 1;
                menu1Num++;
                displayMenuNum(menu1Num, checkNum);
            }

            public void plusOrder2 (View view){
                checkNum = 2;
                menu2Num++;
                displayMenuNum(menu2Num, checkNum);
            }

            public void plusOrder3 (View view){
                checkNum = 3;
                menu3Num++;
                displayMenuNum(menu3Num, checkNum);
            }

            public void plusOrder4 (View view){
                checkNum = 4;
                menu4Num++;
                displayMenuNum(menu4Num, checkNum);
            }

            public void plusOrder5 (View view){
                checkNum = 5;
                menu5Num++;
                displayMenuNum(menu5Num, checkNum);
            }

            public void plusOrder6 (View view){
                checkNum = 6;
                menu6Num++;
                displayMenuNum(menu6Num, checkNum);
            }

            public void plusOrder7 (View view){
                checkNum = 7;
                menu7Num++;
                displayMenuNum(menu7Num, checkNum);
            }

            public void plusOrder8 (View view){
                checkNum = 8;
                menu8Num++;
                displayMenuNum(menu8Num, checkNum);
            }

            public void reduceOrder1 (View view){
                if (menu1Num <= 0) {
                    menu1Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 1;
                menu1Num--;
                displayMenuNum(menu1Num, checkNum);
            }

            public void reduceOrder2 (View view){
                if (menu2Num <= 0) {
                    menu2Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 2;
                menu2Num--;
                displayMenuNum(menu2Num, checkNum);
            }

            public void reduceOrder3 (View view){
                if (menu3Num <= 0) {
                    menu3Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 3;
                menu3Num--;
                displayMenuNum(menu3Num, checkNum);
            }
            public void reduceOrder4 (View view){
                if (menu4Num <= 0) {
                    menu4Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 4;
                menu4Num--;
                displayMenuNum(menu4Num, checkNum);
            }

            public void reduceOrder5 (View view){
                if (menu5Num <= 0) {
                    menu5Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 5;
                menu5Num--;
                displayMenuNum(menu5Num, checkNum);
            }

            public void reduceOrder6 (View view){
                if (menu6Num <= 0) {
                    menu6Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 6;
                menu6Num--;
                displayMenuNum(menu6Num, checkNum);
            }
            public void reduceOrder7 (View view){
                if (menu7Num <= 0) {
                    menu7Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 7;
                menu7Num--;
                displayMenuNum(menu7Num, checkNum);
            }

            public void reduceOrder8 (View view){
                if (menu8Num <= 0) {
                    menu8Num = 0;
                    Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
                    return;
                }
                checkNum = 8;
                menu8Num--;
                displayMenuNum(menu8Num, checkNum);
            }
            public void displayMenuNum ( int num, int check){
                if (check == 1) {
                    TextView quantityView = findViewById(R.id.quantity_view1);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 2) {
                    TextView quantityView = findViewById(R.id.quantity_view2);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 3) {
                    TextView quantityView = findViewById(R.id.quantity_view3);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 4) {
                    TextView quantityView = findViewById(R.id.quantity_view4);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 5) {
                    TextView quantityView = findViewById(R.id.quantity_view5);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 6) {
                    TextView quantityView = findViewById(R.id.quantity_view6);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 7) {
                    TextView quantityView = findViewById(R.id.quantity_view7);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                } else if (check == 8) {
                    TextView quantityView = findViewById(R.id.quantity_view8);
                    quantityView.setText(String.valueOf(num));
                    displaySinglePrice(num, check);
                }
            }
            public void displaySinglePrice(int num, int check) {
                int price;
                if(check == 1) {
                    price = 5900;
                    menu1Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view1);
                    //quantityView.setText(String.valueOf(menu1Price));
                    displayTotalPrice();
                }
                else if(check == 2) {
                    price = 5900;
                    menu2Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view2);
                    //quantityView.setText(String.valueOf(menu2Price));
                    displayTotalPrice();
                }
                else if(check == 3) {
                    price = 5900;
                    menu3Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view3);
                    //quantityView.setText(String.valueOf(menu3Price));
                    displayTotalPrice();
                }
                else if(check == 4) {
                    price = 5900;
                    menu4Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view2);
                    //quantityView.setText(String.valueOf(menu2Price));
                    displayTotalPrice();
                }
                else if(check == 5) {
                    price = 6500;
                    menu5Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view3);
                    //quantityView.setText(String.valueOf(menu3Price));
                    displayTotalPrice();
                }
                else if(check == 6) {
                    price = 6500;
                    menu6Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view2);
                    //quantityView.setText(String.valueOf(menu2Price));
                    displayTotalPrice();
                }
                else if(check == 7) {
                    price = 6900;
                    menu7Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view3);
                    //quantityView.setText(String.valueOf(menu3Price));
                    displayTotalPrice();
                }
                else if(check == 8) {
                    price = 5000;
                    menu8Price = num * price;
                    //TextView quantityView = findViewById(R.id.price_view2);
                    //quantityView.setText(String.valueOf(menu2Price));
                    displayTotalPrice();
                }
            }

            public void displayTotalPrice() {
                int totalPrice = menu1Price + menu2Price + menu3Price + menu4Price + menu5Price + menu6Price + menu7Price + menu8Price;
                TextView quantityView = findViewById(R.id.total_price_view);
                quantityView.setText(String.valueOf(totalPrice));
            }
}