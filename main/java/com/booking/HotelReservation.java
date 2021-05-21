package com.booking;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    private List<Hotel> hotelList = new ArrayList<>();

    /**
     * creating addhotel mothod
     */
    public void addHotel(Hotel hotel){
        hotelList.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotelList;
    }

}
