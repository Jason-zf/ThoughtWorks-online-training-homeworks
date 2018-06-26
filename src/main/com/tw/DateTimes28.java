package com.tw;

import java.time.LocalDateTime;

public class DateTimes28 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime newDateTime = localDateTime.minusHours(5).minusMinutes(30);

        System.out.println("Current Local Date time:" + localDateTime);
        System.out.println("Before 5 hours and 30 minutes:" + newDateTime);
    }
}
