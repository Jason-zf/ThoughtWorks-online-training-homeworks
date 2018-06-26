package com.tw;

import java.time.Year;

public class DateTimes25 {
    public static void main(String[] args) {
        Year currYear = Year.now();

        System.out.println("Current Year:" + currYear);
        System.out.println("Is current year leap year? " + currYear.isLeap());
        System.out.println("Length of the year:" + currYear.length());
    }
}
