package com.tw;

import java.util.Calendar;

public class DateTimes1 {
    public static void main(String[] args) {
        int year = 2018;
        int month = 5;  //June
        int date = 21;

        Calendar cal = Calendar.getInstance();
        cal.clear();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);
        cal.setTimeInMillis(System.currentTimeMillis());

        System.out.println(cal.getTime());
    }
}
