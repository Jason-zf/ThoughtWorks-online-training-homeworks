package com.tw;

import java.time.LocalDate;
import java.time.Period;

public class DateTimes30 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate pDate = LocalDate.of(2016, 4, 1);
        Period diff = Period.between(pDate, localDate);

        System.out.println("Difference between " + pDate + " and " + localDate + " is " + diff.getYears() + " years," + diff.getMonths() + " months and " + diff.getDays() + " days.");
    }
}
