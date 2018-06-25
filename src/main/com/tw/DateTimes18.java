package com.tw;

public class DateTimes18 {
    public static void main(String[] args) {
        int year = 2018;

        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
            System.out.println("Year " + year + " is a leap year!");
        else
            System.out.println("Year " + year + " is not a leap year!");
    }
}
