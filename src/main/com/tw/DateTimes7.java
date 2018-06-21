package com.tw;

import java.util.Calendar;

public class DateTimes7 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Last day of the current month:" + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
