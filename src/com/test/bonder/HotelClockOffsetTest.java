package com.test.bonder;

import com.HotelClock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelClockOffsetTest {
    private HotelClock hotelClock;

    // About UTC Offset
    @Test // test the max utc offset boundary of HotelClock
    public void the_utcOffset_should_be_12_after_setUtcOffset_12(){
        hotelClock = new HotelClock(12);
        assertEquals(12,hotelClock.getUtcOffset());
    }

    @Test // test the min utc offset boundary of HotelClock
    public void the_UtcOffset_should_be_minus11_after_setUtcOffset_minus11(){
        hotelClock = new HotelClock(-11);
        assertEquals(-11,hotelClock.getUtcOffset());
    }

    // overflow
    @Test // test the max Utc Offset boundary + 1 of HotelClock
    public void the_UtcOffset_should_be_miuns11_after_setUtcOffset_13(){
        hotelClock = new HotelClock(13);
        assertEquals(-11,hotelClock.getUtcOffset());
    }

    @Test // test the min Utc Offset boundary - 1 of HotelClock
    public void the_UtcOffset_should_be_12_after_setUtcOffset_minus12(){
        hotelClock = new HotelClock(-12);
        assertEquals(12,hotelClock.getUtcOffset());
    }

    //approach
    @Test // test the max Utc Offset boundary - 1 of HotelClock
    public void the_UtcOffset_should_be_11_after_setUtcOffset_11(){
        hotelClock = new HotelClock(11);
        assertEquals(11,hotelClock.getUtcOffset());
    }

    @Test // test the min Utc Offset boundary + 1 of HotelClock
    public void the_UtcOffset_should_be_minus10_after_setUtcOffset_minus10(){
        hotelClock = new HotelClock(-10);
        assertEquals(-10,hotelClock.getUtcOffset());
    }
}
