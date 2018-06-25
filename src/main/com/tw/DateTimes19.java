package com.tw;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTimes19 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.SEPTEMBER, 1);
        Period diff = Period.between(userday, today);
        System.out.println("\nDifference between "+ userday +" and "+ today +": "
                + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
    }
}
