package com.test.error;

import com.HotelClock;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;

public class HotelClockTest {
    private HotelClock hotelClock;

    int newOffset = 9;
    int hotelOffset = 1;

    @Before
    public void before_clock_test() {
        this.hotelClock = new HotelClock(hotelOffset);
    }

    @Test
    public void throw_exception_and_dont_change_UTC_OFFSET_when_call_setUtcOffset_of_hotelClock() {
        try {
            hotelClock.setUtcOffset(newOffset);
            fail("No exception thrown.");
        } catch(IncompatibleClassChangeError icceException){
            System.out.println(icceException.getMessage());
            assertEquals(hotelOffset, hotelClock.getUtcOffset());
        }
    }

}