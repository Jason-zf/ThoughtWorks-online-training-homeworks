package com.tw;

import java.util.Calendar;

public class DateTimes8 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println("Last date of the month:" + calendar.getTime());
    }
}
