package com.tw;

import java.util.Calendar;

public class DateTimes2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.print("Year:" + calendar.get(Calendar.YEAR) + "\n");
        System.out.print("Month:" + calendar.get(Calendar.MONTH) + "\n");
        System.out.print("Date:" + calendar.get(Calendar.DATE) + "\n");
        System.out.print("Hour:" + calendar.get(Calendar.HOUR) + "\n");
        System.out.print("Minute:" + calendar.get(Calendar.MINUTE) + "\n");
        System.out.print("Second:" + calendar.get(Calendar.SECOND) + "\n");
    }
}
