package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sun_11_5 extends AppCompatActivity {

    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu22Num = 0;
    private int menu23Num = 0;
    private int menu24Num = 0;
    private int menu25Num = 0;
    private int menu26Num = 0;
    private int menu27Num = 0;
    private int menu28Num = 0;
    private int menu29Num = 0;
    private int menu30Num = 0;
    private int menu22Price = 0;
    private int menu23Price = 0;
    private int menu24Price = 0;
    private int menu25Price = 0;
    private int menu26Price = 0;
    private int menu27Price = 0;
    private int menu28Price = 0;
    private int menu29Price = 0;
    private int menu30Price = 0;
    private int checkNum = 0;

    @Override
    protected  void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_5);

        ImageView back9 = (ImageView) findViewById(R.id.back9);
        back9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
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

    public void plusOrder27 (View view){
        checkNum = 27;
        menu27Num++;
        displayMenuNum(menu27Num, checkNum);
    }

    public void plusOrder28 (View view){
        checkNum = 28;
        menu28Num++;
        displayMenuNum(menu28Num, checkNum);
    }

    public void plusOrder29 (View view){
        checkNum = 29;
        menu29Num++;
        displayMenuNum(menu29Num, checkNum);
    }

    public void plusOrder30 (View view){
        checkNum = 30;
        menu30Num++;
        displayMenuNum(menu30Num, checkNum);
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

    public void reduceOrder27 (View view){
        if (menu27Num <= 0) {
            menu27Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 27;
        menu27Num--;
        displayMenuNum(menu27Num, checkNum);
    }
    public void reduceOrder28 (View view){
        if (menu28Num <= 0) {
            menu28Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 28;
        menu28Num--;
        displayMenuNum(menu28Num, checkNum);
    }

    public void reduceOrder29 (View view){
        if (menu29Num <= 0) {
            menu29Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 29;
        menu29Num--;
        displayMenuNum(menu29Num, checkNum);
    }

    public void reduceOrder30 (View view){
        if (menu30Num <= 0) {
            menu30Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 30;
        menu30Num--;
        displayMenuNum(menu30Num, checkNum);
    }
    public void displayMenuNum ( int num, int check){
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
        } else if (check == 27) {
            TextView quantityView = findViewById(R.id.quantity_view27);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 28) {
            TextView quantityView = findViewById(R.id.quantity_view28);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 29) {
            TextView quantityView = findViewById(R.id.quantity_view29);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 30) {
            TextView quantityView = findViewById(R.id.quantity_view30);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }
    }
    public void displaySinglePrice(int num, int check) {
        int price;
        if(check == 22) {
            price = 5000;
            menu22Price = num * price;
            displayTotalPrice();
        }
        else if(check == 23) {
            price = 5500;
            menu23Price = num * price;
            displayTotalPrice();
        }
        else if(check == 24) {
            price = 5900;
            menu24Price = num * price;
            displayTotalPrice();
        }
        else if(check == 25) {
            price = 5900;
            menu25Price = num * price;
            displayTotalPrice();
        }
        else if(check == 26) {
            price = 5900;
            menu26Price = num * price;
            displayTotalPrice();
        }
        else if(check == 27) {
            price = 7900;
            menu27Price = num * price;
            displayTotalPrice();
        }
        else if(check == 28) {
            price = 2900;
            menu28Price = num * price;
            displayTotalPrice();
        }
        else if(check == 29) {
            price = 6900;
            menu29Price = num * price;
            displayTotalPrice();
        }
        else if(check == 30) {
            price = 6900;
            menu30Price = num * price;
            displayTotalPrice();
        }
    }

    public void displayTotalPrice() {
        int totalPrice = menu22Price + menu23Price + menu24Price + menu25Price + menu26Price + menu27Price + menu28Price + menu29Price + menu30Price;
        TextView quantityView = findViewById(R.id.total_price_view);
        quantityView.setText(String.valueOf(totalPrice));
    }
}
