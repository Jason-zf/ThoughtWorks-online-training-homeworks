package com.tw;

import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;

public class DateTimes11 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("The number of days of current month:" + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
