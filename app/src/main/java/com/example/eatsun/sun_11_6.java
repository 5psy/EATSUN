package com.example.eatsun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sun_11_6 extends AppCompatActivity {

    private Button button;
    private String lowestNumMessage = "가장 낮은 수량입니다.";
    private int menu27Num = 0;
    private int menu28Num = 0;
    private int menu29Num = 0;
    private int menu30Num = 0;
    private int menu31Num = 0;
    private int menu32Num = 0;
    private int menu33Num = 0;
    private int menu34Num = 0;
    private int menu35Num = 0;
    private int menu27Price = 0;
    private int menu28Price = 0;
    private int menu29Price = 0;
    private int menu30Price = 0;
    private int menu31Price = 0;
    private int menu32Price = 0;
    private int menu33Price = 0;
    private int menu34Price = 0;
    private int menu35Price = 0;
    private int checkNum = 0;

    @Override
    protected  void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.sun_11_6);

        ImageView back9 = (ImageView) findViewById(R.id.back10);
        back9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.pay6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), payment.class);
                startActivity(intent);
            }
        });

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

    public void plusOrder31 (View view){
        checkNum = 31;
        menu31Num++;
        displayMenuNum(menu31Num, checkNum);
    }

    public void plusOrder32 (View view){
        checkNum = 32;
        menu32Num++;
        displayMenuNum(menu32Num, checkNum);
    }

    public void plusOrder33 (View view){
        checkNum = 33;
        menu33Num++;
        displayMenuNum(menu33Num, checkNum);
    }

    public void plusOrder34 (View view){
        checkNum = 34;
        menu34Num++;
        displayMenuNum(menu34Num, checkNum);
    }

    public void plusOrder35 (View view){
        checkNum = 35;
        menu35Num++;
        displayMenuNum(menu35Num, checkNum);
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

    public void reduceOrder31 (View view){
        if (menu31Num <= 0) {
            menu31Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 31;
        menu31Num--;
        displayMenuNum(menu31Num, checkNum);
    }

    public void reduceOrder32 (View view){
        if (menu32Num <= 0) {
            menu32Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 32;
        menu32Num--;
        displayMenuNum(menu32Num, checkNum);
    }
    public void reduceOrder33 (View view){
        if (menu33Num <= 0) {
            menu33Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 33;
        menu33Num--;
        displayMenuNum(menu33Num, checkNum);
    }

    public void reduceOrder34 (View view){
        if (menu34Num <= 0) {
            menu34Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 34;
        menu34Num--;
        displayMenuNum(menu34Num, checkNum);
    }

    public void reduceOrder35 (View view){
        if (menu35Num <= 0) {
            menu35Num = 0;
            Toast.makeText(this.getApplicationContext(), lowestNumMessage, Toast.LENGTH_SHORT).show();
            return;
        }
        checkNum = 35;
        menu35Num--;
        displayMenuNum(menu35Num, checkNum);
    }
    public void displayMenuNum ( int num, int check){
        if (check == 27) {
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
        } else if (check == 31) {
            TextView quantityView = findViewById(R.id.quantity_view31);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 32) {
            TextView quantityView = findViewById(R.id.quantity_view32);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 33) {
            TextView quantityView = findViewById(R.id.quantity_view33);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 34) {
            TextView quantityView = findViewById(R.id.quantity_view34);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        } else if (check == 35) {
            TextView quantityView = findViewById(R.id.quantity_view35);
            quantityView.setText(String.valueOf(num));
            displaySinglePrice(num, check);
        }
    }
    public void displaySinglePrice(int num, int check) {
        int price;
        if(check == 27) {
            price = 5000;
            menu27Price = num * price;
            displayTotalPrice();
        }
        else if(check == 28) {
            price = 5500;
            menu28Price = num * price;
            displayTotalPrice();
        }
        else if(check == 29) {
            price = 5900;
            menu29Price = num * price;
            displayTotalPrice();
        }
        else if(check == 30) {
            price = 5900;
            menu30Price = num * price;
            displayTotalPrice();
        }
        else if(check == 31) {
            price = 5900;
            menu31Price = num * price;
            displayTotalPrice();
        }
        else if(check == 32) {
            price = 7900;
            menu32Price = num * price;
            displayTotalPrice();
        }
        else if(check == 33) {
            price = 2900;
            menu33Price = num * price;
            displayTotalPrice();
        }
        else if(check == 34) {
            price = 6900;
            menu34Price = num * price;
            displayTotalPrice();
        }
        else if(check == 35) {
            price = 6900;
            menu35Price = num * price;
            displayTotalPrice();
        }
    }

    public void displayTotalPrice() {
        int totalPrice = menu27Price + menu28Price + menu29Price + menu30Price + menu31Price + menu32Price + menu33Price + menu34Price + menu35Price;
        TextView quantityView = findViewById(R.id.total_price_view);
        quantityView.setText(String.valueOf(totalPrice));
    }
}
