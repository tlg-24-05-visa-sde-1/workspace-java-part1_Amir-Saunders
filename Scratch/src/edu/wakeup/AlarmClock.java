package edu.wakeup;

class AlarmClock {

    private int snoozeInterval;
    public int MIN_INTERVAL = 1;
    public int MAX_INTERVAL = 20;

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }



    public void snooze() {
        System.out.println("Snoozing  " + snoozeInterval + " minutes");
    }

    public int getMIN_INTERVAL() {
        return MIN_INTERVAL;
    }

    public void setMIN_INTERVAL(int MIN_INTERVAL) {
        this.MIN_INTERVAL = MIN_INTERVAL;
    }

    public int getMAX_INTERVAL() {
        return MAX_INTERVAL;
    }

    public void setMAX_INTERVAL(int MAX_INTERVAL) {
        this.MAX_INTERVAL = MAX_INTERVAL;
    }
}
