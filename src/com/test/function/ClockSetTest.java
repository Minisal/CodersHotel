package com.test.function;

import com.ClockSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockSetTest {
    private ClockSet clockSet;

    int phoneID = 1;
    String city = "Beijing";
    int phoneOffset = 9;
    int hotelOffset = 1;
    int time = 12;
    @Before
    public void before_clock_test(){
        this.clockSet = new ClockSet();
        clockSet.attachHotelClock(city, hotelOffset);
        clockSet.attachPhoneClock(phoneID, phoneOffset);

    }

    @Test
    public void the_localTime_of_HotelClock_should_be_time_minus_phoneOffset_add_hotelOffset_after_setphoneTime_time(){
        clockSet.setPhoneTime(phoneID, time);
        assertEquals(time-phoneOffset+hotelOffset, clockSet.getHotelClockTime(city));
    }
}
