package com.example.eatsun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReservationTimeAdd {


    public String add(String str) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        Date date = new Date();

        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 날짜 더하기
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        // 디폴트 40분을 현재 시간에 더한다.
        cal.add(Calendar.MINUTE, 40);
        String result = format.format(cal.getTime());
        System.out.println("날짜 확인" + format.format(cal.getTime()));
        return result;
    }


}
