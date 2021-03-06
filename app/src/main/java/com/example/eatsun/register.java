package com.example.eatsun;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.eatsun.login;
import com.example.eatsun.R;
import java.util.HashMap;
import java.util.Map;
import com.example.eatsun.UserAccount;

public class register extends AppCompatActivity {

    private FirebaseAuth nFirebaseAuth;
    private DatabaseReference nDatabaseRef;
    private EditText nEtid, nEtpwd, nEtname;
    private Button nBtnregister;

    //뒤로가기 버튼 두 번 클릭 시 앱 종료
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_02);

        nFirebaseAuth = FirebaseAuth.getInstance();
        nDatabaseRef = FirebaseDatabase.getInstance().getReference( "EatSun");

        nEtid = findViewById(R.id.editid);
        nEtpwd = findViewById(R.id.editpassword);
        //nEtpwdcheck = findViewById(R.id.passwordcheck);
        nEtname = findViewById(R.id. passwordcheck );
        nBtnregister = findViewById(R.id.signupbutton);

        //회원가입 데이터 저장
        nBtnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailid = nEtid.getText().toString();
                String passwd = nEtpwd.getText().toString();
                String name = nEtname.getText().toString();
                UserAccount userDto = new UserAccount(emailid, passwd, name);
                registerUp(emailid, passwd, name);

                Toast.makeText(register.this, "회원가입 성공하셨습니다.", Toast.LENGTH_SHORT).show();

            }
        });
        //회원가입에서 '화살표back1'을 누르면 login창으로 이동
        ImageView back1 = (ImageView) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
            }
        });
    //회원가입 데이터 hashmap이용해 파이어베이스에 저장
    } private void registerUp(String emailid, String passwd, String name) {
        String key =  nDatabaseRef.child("UserAccount").push().getKey();
        UserAccount userDto = new UserAccount(emailid, passwd, name);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/UserAccount/" + emailid, postValues);
        nDatabaseRef.updateChildren(childUpdates);
    }
}