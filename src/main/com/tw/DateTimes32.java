package com.tw;

import java.time.LocalDate;
import java.time.Period;

public class DateTimes32 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1990, 9, 9);
        Period age = Period.between(birthDate, localDate);

        System.out.println("I am " + age.getYears() + " years," + age.getMonths() + " months and " + age.getDays() + " days old.");
    }
}
