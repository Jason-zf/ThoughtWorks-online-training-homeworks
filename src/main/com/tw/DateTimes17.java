package com.tw;

import java.util.Calendar;
import java.util.Date;

public class DateTimes17 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Date currDate = calendar.getTime();
        calendar.add(Calendar.YEAR, 1);
        Date nextDate = calendar.getTime();
        calendar.add(Calendar.YEAR, -2);
        Date beforeDate = calendar.getTime();
        System.out.println("Current Date:" + currDate);
        System.out.println("Date before 1 year:" + beforeDate);
        System.out.println("Date after 1 year:" + nextDate);
    }
}
