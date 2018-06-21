package com.tw;

import java.util.Calendar;

public class DateTimes13 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int dayofWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week:" + dayofWeek);
    }
}
