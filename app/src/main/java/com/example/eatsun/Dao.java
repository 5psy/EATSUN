package com.example.eatsun;

import com.example.eatsun.SeatDto;
import com.example.eatsun.UserAccount;
import com.example.eatsun.ReservationTimeAdd;
import com.example.eatsun.TimeConvert;
import static com.example.eatsun.login.loginId;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Dao {

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();

    //자리 선택 완료 경우 사용자 데이터 업데이트
    public void updateUser(int position, UserAccount userDto, boolean reservationCheck, String reservationTime, String remainTime) {
        userDto.setSeatNum(position);
        userDto.setReservationCheck(reservationCheck);
        userDto.setReservationDate(reservationTime);
        userDto.setRemainTime(remainTime);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }

    //해당 자리 퇴장 경우 사용자 데이터 업데이트
    public void updateUser(UserAccount userDto) {
        userDto.setReservationCheck(false);
        userDto.setReservationDate("");
        userDto.setRemainTime("");
        userDto.setSeatNum(0);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }

    public void updateUser(UserAccount userDto, String renewTime) {
        userDto.setRemainTime(renewTime);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }
    //선택된 자리 데이터 업데이트
    public void updateSeat(int position, String reservationTime) {
        String key = databaseReference.child("EatSun").push().getKey();
        SeatDto seatDb = new SeatDto(position, loginId, true, reservationTime);
        Map<String, Object> postValues = seatDb.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/" +"b"+ position , postValues);
        databaseReference.updateChildren(childUpdates);
    }
    //이용하던 자리 데이터 제거
    public void emptySeat(int usedSeat) {
        String key = databaseReference.child("EatSun").push().getKey();
        SeatDto seatDb = new SeatDto(usedSeat, "", false, "");
        Map<String, Object> postValues = seatDb.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/" + (usedSeat) + "seat", postValues);
        databaseReference.updateChildren(childUpdates);
    }

}
