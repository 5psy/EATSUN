package com.example.eatsun;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class randomnumber extends AppCompatActivity {

    private Button button;

    TextView textView[] = new TextView[1];
    int arr_textview_id[] = {R.id.randomtext1};

    Button mbtn_random;

    Integer arr_random_num[] = new Integer[1];

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randomnunber);

        for(int i=0; i<arr_textview_id.length; i++){
            final int index;
            index = i;
            textView[index] = findViewById(arr_textview_id[index]);
        }

        mbtn_random = findViewById(R.id.random_btn);

        mbtn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                for(int i = 0; i<arr_random_num.length; i++){
                    int arr_random_num = random.nextInt(100)+1;

                    textView[i].setText(Integer.toString(arr_random_num));
                }
            }
        });

        button = findViewById(R.id.ok);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),sun_14_2.class);
                startActivity(intent);
            }
        });
    }

}
