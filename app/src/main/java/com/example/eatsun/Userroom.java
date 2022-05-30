package com.example.eatsun;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Userroom {
    @PrimaryKey(autoGenerate = true)
    private  int id = 0;  //하나의 사용자에 대한 고유 id값
    private String seatnumber;
    private String food;
    //private String foodnum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}