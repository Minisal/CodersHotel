package com;

import java.util.Map;
import java.util.HashMap;

public class ClockSet {

    private Map<String,Clock>hotelClockSet = new HashMap<>();
    private Map<Integer,Clock>phoneClockSet = new HashMap<>();

    public ClockSet(){};

    public void attachPhoneClock(int phoneID, int utcOffset){
        this.phoneClockSet.put(phoneID, new PhoneClock(utcOffset));
    }

    public void attachHotelClock(String city, int UTC_OFFSET){
        if(city=="") throw new IllegalArgumentException("city can't be empty string");
        this.hotelClockSet.put(city, new HotelClock(UTC_OFFSET));
    }

    public void removePhoneClock(int phoneID){
        this.phoneClockSet.remove(phoneID);
    }

    public void removeHotelClock(String city){
        this.hotelClockSet.remove(city);
    }

    public void printAllClock(){
        System.out.println("-------Phone-------");
        for(int phoneID : phoneClockSet.keySet()){
            System.out.printf("ID %6d :%8d\n", phoneID, phoneClockSet.get(phoneID).getLocalTime());
        }
        System.out.println("----Hotel Clock----");
        for(String city : hotelClockSet.keySet()){
            System.out.printf("%-10s:%8d\n", city, hotelClockSet.get(city).getLocalTime());
        }
    }

    protected void checkAllHotelClock(int utcZeroTime){
        for(Clock hotelClock : this.hotelClockSet.values()){
            int localTime = utcZeroTime + hotelClock.getUtcOffset();
            hotelClock.setLocalTime(localTime);
        }

    }

    public void setPhoneTime(int phoneID, int time){
        if(time>23||time<0) throw new IllegalArgumentException("The input time should be between 0 and 23");
        Clock phoneClock = phoneClockSet.get(phoneID);
        phoneClock.setLocalTime(time);
        int utcZeroTime = phoneClock.getLocalTime() - phoneClock.getUtcOffset();
        this.checkAllHotelClock(utcZeroTime);
    }

    public void setPhoneUtc(int phoneID, int utcOffset){
        Clock phoneClock = phoneClockSet.get(phoneID);
        phoneClock.setUtcOffset(utcOffset);
    }

    public int getHotelClockTime(String city){
        return hotelClockSet.get(city).getLocalTime();
    }
}
