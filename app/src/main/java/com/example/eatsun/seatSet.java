package com.example.eatsun;

import static com.example.eatsun.login.loginId;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

import android.util.Log;
import android.view.Window;

import androidx.annotation.NonNull;
import com.example.eatsun.UserAccount;
import com.example.eatsun.ReservationSeat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


public class seatSet extends AppCompatActivity{
    private int k;
    private String dbseat;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference("EatSun");

    Button b1 = (Button) this.findViewById(R.id. seat1);
    Button b2 = (Button) this.findViewById(R.id. seat2);
    Button b3 = (Button) this.findViewById(R.id. seat3);
    Button b4 = (Button) this.findViewById(R.id. seat4);
    Button b5 = (Button) this.findViewById(R.id. seat5);
    Button b6 = (Button) this.findViewById(R.id. seat6);
    Button b7 = (Button) this.findViewById(R.id. seat7);
    Button b8 = (Button) this.findViewById(R.id. seat8);
    Button b9 = (Button) this.findViewById(R.id. seat9);
    Button b10 = (Button) this.findViewById(R.id. seat10);
    Button b11 = (Button) this.findViewById(R.id. seat11);
    Button b12 = (Button) this.findViewById(R.id. seat12);
    Button b13 = (Button) this.findViewById(R.id. seat13);
    Button b14 = (Button) this.findViewById(R.id. seat14);
    Button b15 = (Button) this.findViewById(R.id. seat15);
    Button b16 = (Button) this.findViewById(R.id. seat16);
    Button b17 = (Button) this.findViewById(R.id. seat17);
    Button b18 = (Button) this.findViewById(R.id. seat18);
    Button b19 = (Button) this.findViewById(R.id. seat19);
    Button b20 = (Button) this.findViewById(R.id. seat20);
    Button b21 = (Button) this.findViewById(R.id. seat21);
    Button b22 = (Button) this.findViewById(R.id. seat22);
    Button b23 = (Button) this.findViewById(R.id. seat23);
    Button b24 = (Button) this.findViewById(R.id.seat24);
    Button b25 = (Button) this.findViewById(R.id.seat25);
    Button b26 = (Button) this.findViewById(R.id.seat26);
    Button b27 = (Button) this.findViewById(R.id.seat27);
    Button b28 = (Button) this.findViewById(R.id.seat28);
    Button b29 = (Button) this.findViewById(R.id.seat29);
    Button b30 = (Button) this.findViewById(R.id.seat30);
    Button b31 = (Button) this.findViewById(R.id.seat31);
    Button b32 = (Button) this.findViewById(R.id.seat32);
    Button b33 = (Button) this.findViewById(R.id.seat33);
    Button b34 = (Button) this.findViewById(R.id.seat34);
    Button b35 = (Button) this.findViewById(R.id.seat35);
    Button b36 = (Button) this.findViewById(R.id.seat36);
    Button b37 = (Button) this.findViewById(R.id.seat37);
    Button b38 = (Button) this.findViewById(R.id.seat38);
    Button b39 = (Button) this.findViewById(R.id.seat39);
    Button b40 = (Button) this.findViewById(R.id.seat40);
    Button b41 = (Button) this.findViewById(R.id.seat41);
    Button b42 = (Button) this.findViewById(R.id.seat42);
    Button b43 = (Button) this.findViewById(R.id.seat43);
    Button b44 = (Button) this.findViewById(R.id.seat44);
    Button b45 = (Button) this.findViewById(R.id.seat45);
    Button b46 = (Button) this.findViewById(R.id.seat46);
    Button b47 = (Button) this.findViewById(R.id.seat47);
    Button b48 = (Button) this.findViewById(R.id.seat48);
    Button b49 = (Button) this.findViewById(R.id.seat49);
    Button b50 = (Button) this.findViewById(R.id. seat50);
    Button b51 = (Button) this.findViewById(R.id. seat51);
    Button b52 = (Button) this.findViewById(R.id. seat52);
    Button b53 = (Button) this.findViewById(R.id. seat53);
    Button b54 = (Button) this.findViewById(R.id. seat54);
    Button b55 = (Button) this.findViewById(R.id. seat55);
    Button b56 = (Button) this.findViewById(R.id. seat56);
    Button b57 = (Button) this.findViewById(R.id. seat57);
    Button b58 = (Button) this.findViewById(R.id. seat58);
    Button b59 = (Button) this.findViewById(R.id. seat59);
    Button b60 = (Button) this.findViewById(R.id. seat60);
    Button b61 = (Button) this.findViewById(R.id. seat61);
    Button b62 = (Button) this.findViewById(R.id. seat62);
    Button b63 = (Button) this.findViewById(R.id. seat63);
    Button b64 = (Button) this.findViewById(R.id. seat64);
    Button b65 = (Button) this.findViewById(R.id. seat65);
    Button b66 = (Button) this.findViewById(R.id. seat66);
    Button b67 = (Button) this.findViewById(R.id. seat67);
    Button b68 = (Button) this.findViewById(R.id. seat68);
    Button b69 = (Button) this.findViewById(R.id. seat69);
    Button b70 = (Button) this.findViewById(R.id. seat70);
    Button b71 = (Button) this.findViewById(R.id. seat71);
    Button b72 = (Button) this.findViewById(R.id. seat72);
    Button b73 = (Button) this.findViewById(R.id. seat73);
    Button b74 = (Button) this.findViewById(R.id. seat74);
    Button b75 = (Button) this.findViewById(R.id. seat75);
    Button b76 = (Button) this.findViewById(R.id. seat76);
    Button b77 = (Button) this.findViewById(R.id. seat77);
    Button b78 = (Button) this.findViewById(R.id. seat78);
    Button b79 = (Button) this.findViewById(R.id. seat79);
    Button b80 = (Button) this.findViewById(R.id. seat80);
    Button b81 = (Button) this.findViewById(R.id. seat81);

    //test용으로 -파이어베이스에서 reservationseat에 해당되는 데이터 가져오기 ->실패
    public void seatshow1(){
        for (int j = 50; j <= 81; j++) {
            Query query = databaseReference.child("EatSun").child("b"+Integer.toString(j));
            query.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot datasnapshot) {
                    if (datasnapshot.hasChild("reservationCheck"))
                        if (datasnapshot.child("reservationCheck").getValue().equals("true")) {
                            dbseat = datasnapshot.child("seatNum").getValue().toString();
                            /*for (int k = 50; k <= 81; k++){
                                if(dbseat.equals(k)){
                                    "b"+Integer.toString(k).setSelected(true);
                                }
                            }*/
                            if(dbseat == "50"){b50.setSelected(true);}if(dbseat == "51"){b51.setSelected(true);}
                            if(dbseat == "52"){b52.setSelected(true);}if(dbseat == "53"){b53.setSelected(true);}
                            if(dbseat == "54"){b54.setSelected(true);}if(dbseat == "55"){b55.setSelected(true);}
                            if(dbseat == "56"){b56.setSelected(true);}if(dbseat == "57"){b57.setSelected(true);}
                            if(dbseat == "58"){b58.setSelected(true);}if(dbseat == "59"){b59.setSelected(true);}
                            if(dbseat == "60"){b60.setSelected(true);}if(dbseat == "61"){b61.setSelected(true);}
                            if(dbseat == "62"){b62.setSelected(true);}if(dbseat == "63"){b63.setSelected(true);}
                            if(dbseat == "64"){b64.setSelected(true);}if(dbseat == "65"){b65.setSelected(true);}
                            if(dbseat == "66"){b66.setSelected(true);}if(dbseat == "67"){b67.setSelected(true);}
                            if(dbseat == "68"){b68.setSelected(true);}if(dbseat == "69"){b69.setSelected(true);}
                            if(dbseat == "70"){b70.setSelected(true);}if(dbseat == "71"){b71.setSelected(true);}
                            if(dbseat == "72"){b72.setSelected(true);}if(dbseat == "73"){b73.setSelected(true);}
                            if(dbseat == "74"){b74.setSelected(true);}if(dbseat == "75"){b75.setSelected(true);}
                            if(dbseat == "76"){b76.setSelected(true);}if(dbseat == "77"){b77.setSelected(true);}
                            if(dbseat == "78"){b78.setSelected(true);}if(dbseat == "79"){b79.setSelected(true);}
                            if(dbseat == "80"){b80.setSelected(true);}if(dbseat == "81"){b81.setSelected(true);}

                        } else
                            Log.e("seatCheck : ", "업데이트 실패.");
                    else
                        Log.e("seatCheck : ", "업데이트 실패");
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Log.w("loadPost:onCancelled", databaseError.toException());
                }

            });

    }
}
}
