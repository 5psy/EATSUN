package com.example.eatsun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.eatsun.register;
import com.example.eatsun.UserAccount;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {


    private EditText nEtid, nEtpwd;
    public static String loginId = "";
    public static boolean loginStatus = false;
    public UserAccount userDto;

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
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference("EatSun");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_01);

        nEtid = findViewById(R.id.ID);
        nEtpwd = findViewById(R.id.PW);

        Intent intent = new Intent(this,MyService.class);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            startForegroundService(intent);
        }else {
            startService(intent);
        }

        //로그인 버튼
        Button button_lg = findViewById(R.id.LOGIN);
        button_lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailid = nEtid.getText().toString();
                String passwd = nEtpwd.getText().toString();

                if (emailid.equals("") || passwd.equals(""))
                    Toast.makeText(getApplicationContext(), "아이디 또는 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                else
                    loginCheck(emailid, passwd);
            }
        });

        //회원가입 창으로 이동
        Button button_rg = findViewById(R.id.button2);
        button_rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }

        });
    }
    //파이어베이스에 있는 아이디와 비밀번호를 입력 데이터와 비교해 로그인
    public void loginCheck(final String emailid, final String passwd) {
        final Query query = databaseReference.child("UserAccount");
        query.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot datasnapshot) {

                if (datasnapshot.hasChild(emailid))
                    if (datasnapshot.child(emailid).child("passwd").getValue().equals(passwd)) {
                        Log.e("loginCheck : ", "로그인되었습니다.");
                        loginStatus = true;
                        loginId = emailid;
                        Intent intent = new Intent(getApplicationContext(), mainScreen.class);
                        startActivity(intent);
                    } else
                        Log.e("loginCheck : ", "비밀번호가 틀립니다.");
                else
                    Log.e("loginCheck : ", "해당 아이디가 존재하지 않습니다.");
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("loadUser:onCancelled", databaseError.toException());
            }
        });

    }
}