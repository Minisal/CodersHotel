package com;

public abstract class Clock {

    protected int localTime = 0;

    public Clock(){};

    public void setLocalTime(int localTime) {
        this.localTime = this.reviseTime(localTime);
    }

    public int getLocalTime() {
        return this.localTime;
    }

    protected int reviseTime( int time ){
        return (time + 24) % 24;
    }

    protected int reviseUtcOffset( int utcOffset ){
        for(; utcOffset<0; utcOffset+=24) ;
        return (utcOffset+11)%24-11;
    }

    public abstract int getUtcOffset();

    public abstract void setUtcOffset(int utcOffset);

}
