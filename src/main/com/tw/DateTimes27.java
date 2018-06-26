package com.tw;

import java.time.LocalTime;

public class DateTimes27 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(11, 42, 36);

        System.out.println("Current Local time:" + time);
        System.out.println("Hour:" + time.getHour());
        System.out.println("Minute:" + time.getMinute());
        System.out.println("Second:" + time.getSecond());
    }
}
