package com.test.error;

import com.ClockSet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class ClockSetTest {
    private ClockSet clockSet;

    int phoneID = 1;
    String city = "Beijing";
    int phoneOffset = 9;
    int hotelOffset = 1;
    int time = 12;


    //print_warning_and_dont_change_UTC_OFFSET_when_setUtcOffset_of_hotelClock

    @Before
    public void before_clock_test() {
        this.clockSet = new ClockSet();
        this.clockSet.attachPhoneClock(phoneID,phoneOffset);
    }

    @Test
    public void throw_exception_when_attachHotelClock_with_an_empty_string_as_city_name() {
        try {
            clockSet.attachHotelClock("", hotelOffset);
            fail("No exception thrown.");
        } catch(IllegalArgumentException iaException){
            System.out.println(iaException.getMessage());
        }
    }

    @Test
    public void throw_exception_when_setPhoneTime_with_an_nonexistent_phoneID() {
        try {
            clockSet.setPhoneTime(phoneID-1, time);
            fail("No exception thrown.");
        } catch(NullPointerException npException){
            System.out.println(npException.getMessage());
        }
    }

    @Test // test the illegal input time( > 23 ) in setPhoneTime
    public void throw_exception_when_setPhoneTime_with_24time() {
        try {
            clockSet.setPhoneTime(phoneID, 24);
            fail("No exception thrown.");
        } catch(IllegalArgumentException iaException){
            System.out.println(iaException.getMessage());
        }
    }

    @Test // test the illegal input time( < 0 ) in setPhoneTime
    public void throw_exception_when_setPhoneTime_with_munus1_time() {
        try {
            clockSet.setPhoneTime(phoneID, -1);
            fail("No exception thrown.");
        } catch(IllegalArgumentException iaException){
            System.out.println(iaException.getMessage());
        }
    }

    @Test
    public void throw_exception_when_setPhoneUtc_with_an_nonexistent_phoneID() {
        try {
            clockSet.setPhoneUtc(phoneID-1, phoneOffset);
            fail("No exception thrown.");
        } catch(NullPointerException npException){
            System.out.println(npException.getMessage());
        }
    }

    @Test
    public void throw_exception_when_getHotelClockTime_with_an_nonexistent_cityName() {
        try {
            clockSet.getHotelClockTime("none");
            fail("No exception thrown.");
        } catch(NullPointerException npException){
            System.out.println(npException.getMessage());
        }
    }
}