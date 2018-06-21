package com.tw;

import java.util.Calendar;

public class DateTimes6 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current full date and time:" + calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND) + "." + calendar.get(Calendar.MILLISECOND));
    }
}
