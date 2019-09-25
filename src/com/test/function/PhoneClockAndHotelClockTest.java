package com.test.function;

import com.Clock;

import com.HotelClock;
import com.PhoneClock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneClockAndHotelClockTest {
    private Clock phoneClock ;
    private Clock hotelClock ;
    int phoneOffset = 9;
    int hotelOffset = 1;
    int time = 12;
    @Before
    public void before_clock_test(){
        this.phoneClock = new PhoneClock(phoneOffset);
        this.hotelClock = new HotelClock(hotelOffset);
    }

    @Test
    public void the_localTime_of_PhoneClock_should_be_N_after_setLocalTime_N(){
        phoneClock.setLocalTime(time);
        assertEquals(time, phoneClock.getLocalTime());
    }

    @Test
    public void the_localTime_of_HotelClock_should_be_N_after_setLocalTime_N(){
        hotelClock.setLocalTime(time);
        assertEquals(time, hotelClock.getLocalTime());
    }

    @Test
    public void the_utcOffset_of_PhoneClock_should_be_N_after_setUtcOffset_N(){
        phoneClock.setUtcOffset(phoneOffset);
        assertEquals(phoneOffset, phoneClock.getUtcOffset());
    }


}
