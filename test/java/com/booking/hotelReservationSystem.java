package com.booking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class hotelReservationSystem {
    /**
     * testing for hotels with specific rate
     */
    @Test
    public void giveHotelWhenRequiredShouldAdded1Hotel() {
        HotelReservation hotelReservation = new HotelReservation();
        Hotel hotel = new Hotel("Lakewood", 110);  //testing for 1st hotel
        hotelReservation.addHotels(hotel);
        List hotelList = hotelReservation.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }
}
