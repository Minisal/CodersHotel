package com;

public class HotelClock extends Clock {

    private int UTC_OFFSET = 0;

    public HotelClock(int UTC_OFFSET){
        this.UTC_OFFSET = this.reviseUtcOffset(UTC_OFFSET);
    }

    @Override
    public int getUtcOffset(){
        return UTC_OFFSET;
    }

    @Override
    public void setUtcOffset(int utcOffset){
        throw new IncompatibleClassChangeError("Time zone unchangeable");
    }

}
