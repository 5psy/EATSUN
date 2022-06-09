package com.example.eatsun;

import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class payment extends AppCompatActivity {

    TextView price;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        Intent intent = getIntent();
        String priceStr = intent.getExtras().getString("price");
        price = (TextView)findViewById(R.id.price);
        price.setText(priceStr);

        ImageView card = (ImageView) findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),sun_14_2.class);
                startActivity(intent);
            }
        });

        ImageView btn_dialog =  (ImageView) findViewById(R.id.cancel);
        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg =  new AlertDialog.Builder(payment.this);
                dlg.setTitle("결제취소");
                dlg.setMessage("결제를 취소하시겠습니까?");
                dlg.setPositiveButton("예", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"결제가 취소되었습니다.",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), ReservationSeat.class); //결제가 취소되었습니다. 라는 문구가 뜨며 좌석선택 첫번째 페이지로 이동
                        startActivity(intent);
                    }
                });
                dlg.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"결제를 진행하겠습니다.",Toast.LENGTH_SHORT).show(); //아니오 누를 시 결제를 진행하겠습니다라는 문구가뜸
                    }
                });
                dlg.show();

            }
        });

    }
}
