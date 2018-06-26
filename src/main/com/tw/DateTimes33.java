package com.tw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimes33 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("Current date:" + localDate);
        System.out.println("Next Friday: " + localDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: " + localDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));

    }
}
