package com.tw;

import java.time.LocalTime;

public class DateTimes15 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        //add 4 hours
        LocalTime newTime = localTime.plusHours(4);

        System.out.println("Local time:" + localTime);
        System.out.println("Local time plus 4 hours:" + newTime);
    }
}
