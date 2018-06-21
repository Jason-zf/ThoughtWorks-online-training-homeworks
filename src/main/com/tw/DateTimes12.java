package com.tw;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class DateTimes12 {
    public static void main(String[] args) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.CHINA);

        String localizedDayNames[] = dateFormatSymbols.getWeekdays();
        System.out.println("Localized day-in-week name:");
        for (int i = 0; i < localizedDayNames.length; ++i) {
            System.out.println(localizedDayNames[i]);
        }
    }
}
