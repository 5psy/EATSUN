package com.example.eatsun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login extends AppCompatActivity {

    private FirebaseAuth nFirebaseAuth;
    private DatabaseReference nDatabaseRef;
    private EditText nEtid, nEtpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_01);

        nFirebaseAuth = FirebaseAuth.getInstance();
        nDatabaseRef = FirebaseDatabase.getInstance().getReference( "EatSun");

        nEtid = findViewById(R.id.ID);
        nEtpwd = findViewById(R.id.PW);

        Button button_lg = findViewById(R.id.LOGIN);
        button_lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strid = nEtid.getText().toString();
                String strpwd = nEtpwd.getText().toString();

                nFirebaseAuth.signInWithEmailAndPassword(strid, strpwd).addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Intent intent = new Intent(login.this, mainScreen.class);
                            startActivity(intent);
                            finish();
                        } else{
                            Toast.makeText(login.this, "로그인을 실패하셨습니다.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });

        Button button_rg = findViewById(R.id.button2);
        button_rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }

        });
    }

}