package com.tw;

import java.util.Calendar;

public class DateTimes1 {
    public static void main(String[] args) {
        int year = 2018;
        int month = 5;  //June
        int date = 21;

        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        calendar.setTimeInMillis(System.currentTimeMillis());

        System.out.println(calendar.getTime());
    }
}
