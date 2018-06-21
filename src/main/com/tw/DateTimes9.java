package com.tw;

import sun.awt.geom.AreaOp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTimes9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        DateFormat dateFormat = new SimpleDateFormat("E dd/MM/yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(calendar.getTime()));
        for (int i = 0; i < 6; ++i) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }
        System.out.println(dateFormat.format(calendar.getTime()));

    }
}
