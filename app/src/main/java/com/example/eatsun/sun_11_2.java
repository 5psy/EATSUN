package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sun_11_2 extends AppCompatActivity{

    private Button button;
    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu12Num = 0;
    private int menu13Num = 0;
    private int menu14Num = 0;
    private int menu15Num = 0;
    private int menu16Num = 0;
    private int menu17Num = 0;
    private int menu18Num = 0;
    private int menu19Num = 0;
    private int menu20Num = 0;
    private int menu21Num = 0;
    private int menu12Price = 0;
    private int menu13Price = 0;
    private int menu14Price = 0;
    private int menu15Price = 0;
    private int menu16Price = 0;
    private int menu17Price = 0;
    private int menu18Price = 0;
    private int menu19Price = 0;
    private int menu20Price = 0;
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
    protected  void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_2);

        ImageView back7 = (ImageView) findViewById(R.id.back7);
        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
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

    public void plusOrder12 (View view){
        checkNum = 12;
        menu12Num++;
        displayMenuNum(menu12Num, checkNum);
    }

    public void plusOrder13 (View view){
        checkNum = 13;
        menu13Num++;
        displayMenuNum(menu13Num, checkNum);
    }

    public void plusOrder14 (View view){
        checkNum = 14;
        menu14Num++;
        displayMenuNum(menu14Num, checkNum);
    }

    public void plusOrder15 (View view){
        checkNum = 15;
        menu15Num++;
        displayMenuNum(menu15Num, checkNum);
    }

    public void plusOrder16 (View view){
        checkNum = 16;
        menu16Num++;
        displayMenuNum(menu16Num, checkNum);
    }

    public void plusOrder17 (View view){
        checkNum = 17;
        menu17Num++;
        displayMenuNum(menu17Num, checkNum);
    }

    public void plusOrder18 (View view){
        checkNum = 18;
        menu18Num++;
        displayMenuNum(menu18Num, checkNum);
    }

    public void plusOrder19 (View view){
        checkNum = 19;
        menu19Num++;
        displayMenuNum(menu19Num, checkNum);
    }

    public void plusOrder20 (View view){
        checkNum = 20;
        menu20Num++;
        displayMenuNum(menu20Num, checkNum);
    }
    public void plusOrder21 (View view){
        checkNum = 21;
        menu21Num++;
        displayMenuNum(menu21Num, checkNum);
    }
    public void reduceOrder12 (View view){
        if (menu12Num <= 0) {
            menu12Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 12;
        menu12Num--;
        displayMenuNum(menu12Num, checkNum);
    }
    public void reduceOrder13 (View view){
        if (menu13Num <= 0) {
            menu13Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 13;
        menu13Num--;
        displayMenuNum(menu13Num, checkNum);
    }

    public void reduceOrder14 (View view){
        if (menu14Num <= 0) {
            menu14Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 14;
        menu14Num--;
        displayMenuNum(menu14Num, checkNum);
    }

    public void reduceOrder15 (View view){
        if (menu15Num <= 0) {
            menu15Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 15;
        menu15Num--;
        displayMenuNum(menu15Num, checkNum);
    }

    public void reduceOrder16 (View view){
        if (menu16Num <= 0) {
            menu16Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 16;
        menu16Num--;
        displayMenuNum(menu16Num, checkNum);
    }

    public void reduceOrder17 (View view){
        if (menu17Num <= 0) {
            menu17Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 17;
        menu17Num--;
        displayMenuNum(menu17Num, checkNum);
    }
    public void reduceOrder18 (View view){
        if (menu18Num <= 0) {
            menu18Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 18;
        menu18Num--;
        displayMenuNum(menu18Num, checkNum);
    }

    public void reduceOrder19 (View view){
        if (menu19Num <= 0) {
            menu19Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 19;
        menu19Num--;
        displayMenuNum(menu19Num, checkNum);
    }

    public void reduceOrder20 (View view){
        if (menu20Num <= 0) {
            menu20Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 20;
        menu20Num--;
        displayMenuNum(menu20Num, checkNum);
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
        if (check == 12) {
            TextView quantityView = findViewById(R.id.quantity_view12);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 13) {
            TextView quantityView = findViewById(R.id.quantity_view13);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 14) {
            TextView quantityView = findViewById(R.id.quantity_view14);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 15) {
            TextView quantityView = findViewById(R.id.quantity_view15);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 16) {
            TextView quantityView = findViewById(R.id.quantity_view16);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 17) {
            TextView quantityView = findViewById(R.id.quantity_view17);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 18) {
            TextView quantityView = findViewById(R.id.quantity_view18);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 19) {
            TextView quantityView = findViewById(R.id.quantity_view19);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 20) {
            TextView quantityView = findViewById(R.id.quantity_view20);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }else if (check == 21) {
            TextView quantityView = findViewById(R.id.quantity_view21);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }
    }
        public void displaySinglePrice(int num, int check){
            int price;
            if (check == 12) {
                price = 3500;
                menu12Price = num * price;
                displayTotalPrice();
            } else if (check == 13) {
                price = 3500;
                menu13Price = num * price;
                displayTotalPrice();
            } else if (check == 14) {
                price = 4000;
                menu14Price = num * price;
                displayTotalPrice();
            } else if (check == 15) {
                price = 4000;
                menu15Price = num * price;
                displayTotalPrice();
            } else if (check == 16) {
                price = 4000;
                menu16Price = num * price;
                displayTotalPrice();
            } else if (check == 17) {
                price = 3000;
                menu17Price = num * price;
                displayTotalPrice();
            } else if (check == 18) {
                price = 3000;
                menu18Price = num * price;
                displayTotalPrice();
            } else if (check == 19) {
                price = 3000;
                menu19Price = num * price;
                displayTotalPrice();
            } else if (check == 20) {
                price = 5000;
                menu20Price = num * price;
                displayTotalPrice();
            }else if (check == 21) {
                price = 4000;
                menu21Price = num * price;
                displayTotalPrice();
            }
        }

            public void displayTotalPrice() {
                int totalPrice = menu12Price + menu13Price + menu14Price + menu15Price + menu16Price + menu17Price + menu18Price + menu19Price + menu20Price + menu21Price;
                TextView quantityView = findViewById(R.id.total_price);
                quantityView.setText(String.valueOf(totalPrice));
            }
        }
