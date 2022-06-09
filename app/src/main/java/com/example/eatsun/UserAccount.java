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
    private String name;

    private int seatNum;
    //private String reservationDate = "";
    private String remainTime = "";
    private boolean reservationCheck = false;

    public UserAccount(){

    }
    public UserAccount(String emailid, String passwd, String name) {
        this.emailid = emailid;
        this.passwd = passwd;
        this.name = name;
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


    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    /*public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }*/

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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Exclude
    public Map<String, Object> toMap() {

        HashMap<String, Object> result = new HashMap<>();

        result.put("emailid", emailid);
        result.put("passwd", passwd);
        result.put("name", name);
        result.put("seatNum", seatNum);
        //result.put("reservationDate", reservationDate);
        result.put("remainTime", remainTime);
        result.put("reservationCheck", reservationCheck);
        return result;
    }


}
