package com.example.eatsun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {

    private FirebaseAuth nFirebaseAuth;
    private DatabaseReference nDatabaseRef;
    private EditText nEtid, nEtpwd, nEtpwdcheck;
    private Button nBtnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_02);

        nFirebaseAuth = FirebaseAuth.getInstance();
        nDatabaseRef = FirebaseDatabase.getInstance().getReference( "EatSun");

        nEtid = findViewById(R.id.editid);
        nEtpwd = findViewById(R.id.editpassword);
        nEtpwdcheck = findViewById(R.id.passwordcheck);
        nBtnregister = findViewById(R.id.signupbutton);

        nBtnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strid = nEtid.getText().toString();
                String strpwd = nEtpwd.getText().toString();
                String strpwdch = nEtpwdcheck.getText().toString();

                nFirebaseAuth.createUserWithEmailAndPassword(strid, strpwd).addOnCompleteListener(register.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser firebaseUser = nFirebaseAuth.getCurrentUser();
                            UserAccount account = new UserAccount();
                            account.setIdtoken(firebaseUser.getUid());
                            account.setEmailid(firebaseUser.getEmail());
                            account.setPasswd(strpwd);

                            nDatabaseRef.child("UserAccount").child(firebaseUser.getUid()).setValue(account);

                            Toast.makeText(register.this, "회원가입 성공하셨습니다.", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(register.this, "회원가입 실패하셨습니다.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}