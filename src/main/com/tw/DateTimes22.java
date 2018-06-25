package com.tw;

import java.time.LocalDate;

public class DateTimes22 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("\nCurrent Date: " + today);
        System.out.println("10 days before today: " + today.plusDays(-10));
        System.out.println("10 days after today: " + today.plusDays(10) + "\n");
    }
}
