package com.example.eatsun;

import com.example.eatsun.Dao;
import com.example.eatsun.UserAccount;
import com.example.eatsun.ReservationTimeAdd;

import java.util.List;

public class Function { // 사용자의 예약, 반납, 연장 기능을 담당하는 클래스

    Dao dao = new Dao();

    public void reservationSeat(int position, UserAccount userDto, List<SeatDto> seatDto, String reservationTime) {

        ReservationTimeAdd reservationTimeAdd = new ReservationTimeAdd();
        // 좌석 정보 업데이트
        dao.updateSeat(position, reservationTimeAdd.add(reservationTime));
        // 유저 정보 업데이트
        dao.updateUser(position,userDto,true, reservationTime, reservationTimeAdd.add(reservationTime));

        //seatDto.get(position).setSeatCheck(true);
    }

    public void returnSeat(UserAccount userDto) {

        // 좌석정보에서 사용자 정보 제거
        dao.emptySeat(userDto.getSeatNum());

        // 사용자 정보에서 좌석 정보 제거
        dao.updateUser(userDto);
    }


}