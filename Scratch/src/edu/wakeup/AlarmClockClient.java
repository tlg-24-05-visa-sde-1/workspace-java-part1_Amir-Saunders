package edu.wakeup;

public class AlarmClockClient {

    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        AlarmClock clock3 = new AlarmClock();
        AlarmClock clock2 = new AlarmClock();

        clock1.setSnoozeInterval(7);
        clock2.setSnoozeInterval(10);
        clock3.setSnoozeInterval(5);

        clock1.snooze();

        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
    }
}
