package com.test.bonder;

import com.PhoneClock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneClockTest {
    private PhoneClock phoneClock;

    @Before
    public void before_test(){
        phoneClock = new PhoneClock(0);
    }

    // About Local Time
    @Test // test the max time boundary of PhoneClock
    public void the_localTime_should_be_23_after_setLocalTime_23(){
        phoneClock.setLocalTime(23);
        assertEquals(23,phoneClock.getLocalTime());
    }

    @Test // test the min time boundary of PhoneClock
    public void the_localTime_should_be_0_after_setLocalTime_0(){
        phoneClock.setLocalTime(0);
        assertEquals(0,phoneClock.getLocalTime());
    }

    // overflow
    @Test // test the max time boundary + 1 of PhoneClock
    public void the_localTime_should_be_0_after_setLocalTime_24(){
        phoneClock.setLocalTime(24);
        assertEquals(0,phoneClock.getLocalTime());
    }

    @Test // test the min time boundary - 1 of PhoneClock
    public void the_localTime_should_be_23_after_setLocalTime_minus1(){
        phoneClock.setLocalTime(-1);
        assertEquals(23,phoneClock.getLocalTime());
    }

    //approach
    @Test // test the max time boundary - 1 of PhoneClock
    public void the_localTime_should_be_22_after_setLocalTime_22(){
        phoneClock.setLocalTime(22);
        assertEquals(22,phoneClock.getLocalTime());
    }

    @Test // test the min time boundary + 1 of PhoneClock
    public void the_localTime_should_be_1_after_setLocalTime_1(){
        phoneClock.setLocalTime(1);
        assertEquals(1,phoneClock.getLocalTime());
    }


    // About UTC Offset
    @Test // test the max utc offset boundary of PhoneClock
    public void the_utcOffset_should_be_12_after_setUtcOffset_12(){
        phoneClock.setUtcOffset(12);
        assertEquals(12,phoneClock.getUtcOffset());
    }

    @Test // test the min utc offset boundary of PhoneClock
    public void the_UtcOffset_should_be_minus11_after_setUtcOffset_minus11(){
        phoneClock.setUtcOffset(-11);
        assertEquals(-11,phoneClock.getUtcOffset());
    }

    // overflow
    @Test // test the max Utc Offset boundary + 1 of PhoneClock
    public void the_UtcOffset_should_be_miuns11_after_setUtcOffset_13(){
        phoneClock.setUtcOffset(13);
        assertEquals(-11,phoneClock.getUtcOffset());
    }

    @Test // test the min Utc Offset boundary - 1 of PhoneClock
    public void the_UtcOffset_should_be_12_after_setUtcOffset_minus12(){
        phoneClock.setUtcOffset(-12);
        assertEquals(12,phoneClock.getUtcOffset());
    }

    //approach
    @Test // test the max Utc Offset boundary - 1 of PhoneClock
    public void the_UtcOffset_should_be_11_after_setUtcOffset_11(){
        phoneClock.setUtcOffset(11);
        assertEquals(11,phoneClock.getUtcOffset());
    }

    @Test // test the min Utc Offset boundary + 1 of PhoneClock
    public void the_UtcOffset_should_be_minus10_after_setUtcOffset_minus10(){
        phoneClock.setUtcOffset(-10);
        assertEquals(-10,phoneClock.getUtcOffset());
    }
}
