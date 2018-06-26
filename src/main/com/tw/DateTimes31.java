package com.tw;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTimes31 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime pDateTime = LocalDateTime.of(2016, 6, 26, 9, 0, 0);
        Duration duration = Duration.between(pDateTime, localDateTime);

        System.out.println("Difference between " + pDateTime + " and " + localDateTime + " is " + duration.toHours() + " hours," + duration.toMinutes() + " minutes," + duration.getSeconds() + " seconds," + duration.toMillis() + " milliseconds and " + duration.getNano() + " Nano.");

    }
}
