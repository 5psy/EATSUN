package com.example.eatsun;

import com.example.eatsun.SeatDto;
import com.example.eatsun.UserAccount;
import com.example.eatsun.ReservationTimeAdd;
import com.example.eatsun.TimeConvert;
import static com.example.eatsun.ReadingRoom.totalSeat;
import static com.example.eatsun.login.loginId;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Dao {

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();


    public void updateUser(int position, UserAccount userDto, boolean reservationCheck, String reservationTime, String remainTime) {
        userDto.setSeatNum(position + 1);
        userDto.setReservationCheck(reservationCheck);
        userDto.setReservationDate(reservationTime);
        userDto.setRemainTime(remainTime);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }


    public void updateUser(UserAccount userDto) {
        userDto.setReservationCheck(false);
        userDto.setReservationDate("");
        userDto.setRemainTime("");
        userDto.setSeatNum(0);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);
    }

    public void updateUser(UserAccount userDto, String renewTime) {
        userDto.setRemainTime(renewTime);
        Map<String, Object> postValues = userDto.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/User/" + loginId, postValues);
        databaseReference.updateChildren(childUpdates);

    }

    public void updateSeat(int position, String reservationTime) {
        String key = databaseReference.child("EatSun").push().getKey();
        SeatDto seatDb = new SeatDto(position + 1, loginId, true, reservationTime);
        Map<String, Object> postValues = seatDb.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/" + (position + 1) + "seat", postValues);
        databaseReference.updateChildren(childUpdates);
    }

    public void emptySeat(int usedSeat) {
        String key = databaseReference.child("EatSun").push().getKey();
        SeatDto seatDb = new SeatDto(usedSeat, "", false, "");
        Map<String, Object> postValues = seatDb.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/EatSun/" + (usedSeat) + "seat", postValues);
        databaseReference.updateChildren(childUpdates);
    }

    public void upCount() {
        SeatCount seatCount = new SeatCount(Integer.toString(totalSeat + 1));
        Map<String, Object> postValues = seatCount.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/seat_count/" + "nowSeatCount", postValues);
        databaseReference.updateChildren(childUpdates);
    }
    public void downCount() {
        SeatCount seatCount = new SeatCount(Integer.toString(totalSeat - 1));
        Map<String, Object> postValues = seatCount.toMap();
        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/seat_count/" + "nowSeatCount", postValues);
        databaseReference.updateChildren(childUpdates);
    }
}
