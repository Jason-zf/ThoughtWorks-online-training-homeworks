package com.tw;

import java.util.Calendar;

public class DateTimes4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current date and time:" + calendar.getTime());
        System.out.println("Minimum value of the year is:" + calendar.getActualMinimum(Calendar.YEAR));
        System.out.println("Minimum value of the month is:" + calendar.getActualMinimum(Calendar.MONTH));
        System.out.println("Minimum value of the week is:" + calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("Minimum value of the date is:" + calendar.getActualMinimum(Calendar.DATE));
    }
}
