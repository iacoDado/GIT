public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addSeconds(int secToAdd) {
        int totSec;
        totSec=(second+secToAdd);
        minute=(minute+totSec/60);
        second=totSec%60;
        hour=(hour+minute/60)%24;
        minute=minute%60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public int secFromMidnight(){
        int secMid;

        secMid=hour*3600+minute*60+second;

        return secMid;
    }
}