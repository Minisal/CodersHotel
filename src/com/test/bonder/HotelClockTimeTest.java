package com.test.bonder;

import com.HotelClock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelClockTimeTest {
    private HotelClock hotelClock;

    @Before
    public void before_test(){
        hotelClock = new HotelClock(0);
    }

    // About Local Time
    @Test // test the max time boundary of HotelClock
    public void the_localTime_should_be_23_after_setLocalTime_23(){
        hotelClock.setLocalTime(23);
        assertEquals(23,hotelClock.getLocalTime());
    }

    @Test // test the min time boundary of HotelClock
    public void the_localTime_should_be_0_after_setLocalTime_0(){
        hotelClock.setLocalTime(0);
        assertEquals(0,hotelClock.getLocalTime());
    }

    // overflow
    @Test // test the max time boundary + 1 of HotelClock
    public void the_localTime_should_be_0_after_setLocalTime_24(){
        hotelClock.setLocalTime(24);
        assertEquals(0,hotelClock.getLocalTime());
    }

    @Test // test the min time boundary - 1 of HotelClock
    public void the_localTime_should_be_23_after_setLocalTime_minus1(){
        hotelClock.setLocalTime(-1);
        assertEquals(23,hotelClock.getLocalTime());
    }

    //approach
    @Test // test the max time boundary - 1 of HotelClock
    public void the_localTime_should_be_22_after_setLocalTime_22(){
        hotelClock.setLocalTime(22);
        assertEquals(22,hotelClock.getLocalTime());
    }

    @Test // test the min time boundary + 1 of HotelClock
    public void the_localTime_should_be_1_after_setLocalTime_1(){
        hotelClock.setLocalTime(1);
        assertEquals(1,hotelClock.getLocalTime());
    }

}
