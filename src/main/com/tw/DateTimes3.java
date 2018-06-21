package com.tw;

import java.util.Calendar;

public class DateTimes3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current date and time:" + calendar.getTime());
        System.out.println("Maximum value of the year is:" + calendar.getActualMaximum(Calendar.YEAR));
        System.out.println("Maximum value of the month is:" + calendar.getActualMaximum(Calendar.MONTH));
        System.out.println("Maximum value of the week is:" + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Maximum value of the date is:" + calendar.getActualMaximum(Calendar.DATE));

    }
}
