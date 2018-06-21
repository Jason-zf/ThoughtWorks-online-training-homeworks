package com.tw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;

public class DateTimes10 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        YearMonth yearMonth = YearMonth.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1);

        System.out.println("The name of first day of month:" + yearMonth.atDay(1).getDayOfWeek().name());
        System.out.println("The name of last day of month:" + yearMonth.atEndOfMonth().getDayOfWeek().name());
    }
}
