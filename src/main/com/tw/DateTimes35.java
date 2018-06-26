package com.tw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimes35 {
    public static void main(String[] args) {
        String originalString = "2016-07-14 09:00:02";

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String newString = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
        System.out.println("Original String:" + originalString);
        System.out.println("Date and time:" + newString);
    }
}
