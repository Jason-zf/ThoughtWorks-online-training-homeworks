package com.tw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimes29 {
    public static void main(String[] args) {
        String string = "六月 26 2018";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM d yyyy");
        LocalDate localDate = LocalDate.parse(string, dateTimeFormatter);

        System.out.println("Given String:" + string);
        System.out.println("Convert to date:" + localDate);
    }
}
