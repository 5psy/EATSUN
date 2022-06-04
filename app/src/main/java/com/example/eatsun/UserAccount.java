package com.example.eatsun;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class UserAccount {
    private String emailid;
    private String passwd;
    private String idtoken; //고유토큰정보
    //private int roomNum;
    private int seatNum;
    private String reservationDate = "";
    private String remainTime = "";
    private boolean reservationCheck = false;

    public UserAccount(){

    }
    public UserAccount(String emailid, String passwd) {
        this.emailid = emailid;
        this.passwd = passwd;
    }
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIdtoken() {
        return idtoken;
    }

    public void setIdtoken(String idtoken) {
        this.idtoken = idtoken;
    }

    /*public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }*/

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(String remainTime) {
        this.remainTime = remainTime;
    }

    public boolean isReservationCheck() {
        return reservationCheck;
    }

    public void setReservationCheck(boolean reservationCheck) {
        this.reservationCheck = reservationCheck;
    }

    @Exclude
    public Map<String, Object> toMap() {

        HashMap<String, Object> result = new HashMap<>();

        result.put("id", emailid);
        result.put("pw", passwd);

        //result.put("roomNum", roomNum);
        result.put("seatNum", seatNum);
        result.put("reservationDate", reservationDate);
        result.put("remainTime", remainTime);
        result.put("reservationCheck", reservationCheck);


        return result;
    }


}
