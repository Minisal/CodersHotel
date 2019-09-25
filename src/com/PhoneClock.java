package com;

public class PhoneClock extends Clock{

    private int utcOffset = 0;

    public PhoneClock(int utcOffset){
        this.utcOffset = (utcOffset+11)%24-11;
    }

    @Override
    public int getUtcOffset(){
        return this.utcOffset;
    }

    @Override
    public void setUtcOffset(int utcOffset){
        int utcZeroTime = this.getLocalTime() + this.getUtcOffset();
        this.utcOffset = this.reviseUtcOffset(utcOffset);
        this.setLocalTime(utcZeroTime + utcOffset);
    }
}
