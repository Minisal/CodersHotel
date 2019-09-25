package com;

public class CodersHotelRunner {
    public static void main(String[] args){
        ClockSet clockSet = new ClockSet();

        clockSet.attachPhoneClock(1,8);

        clockSet.attachHotelClock("Beijing", 8);
        clockSet.attachHotelClock("London", 0);
        clockSet.attachHotelClock("Moscow", 4);
        clockSet.attachHotelClock("Sydney", 10);
        clockSet.attachHotelClock("NewYork", -5);

        System.out.println("The initial state");
        clockSet.printAllClock();

        System.out.println("Set the phone's time to 21");
        clockSet.setPhoneTime(1,21);
        clockSet.printAllClock();

        System.out.println("Set the phone's time zone Offset to 7");
        clockSet.setPhoneUtc(1,7);
        clockSet.printAllClock();

    }
}
