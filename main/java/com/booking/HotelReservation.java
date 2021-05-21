package com.booking;

import java.util.ArrayList;
import java.util.List;

/**
 *creating Array list to add hotel name
 */
public class HotelReservation {
    private List<Hotel> hotelList = new ArrayList<>();

    /**
     * creating addHotel mothod
     */
    public void addHotels(Hotel hotel){
        hotelList.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotelList;
    }

}
