package com.tw;

import java.util.Calendar;

public class DateTimes16 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current date:" + calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 14);
        System.out.println("Date after two weeks:" + calendar.getTime());
    }
}
