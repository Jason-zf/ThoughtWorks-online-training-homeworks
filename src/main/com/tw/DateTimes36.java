package com.tw;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimes36 {
    public static void main(String[] args) {
        long unixTimestamp = 1372339860;
        Date date = new Date(unixTimestamp * 1000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        String javaDate = simpleDateFormat.format(date);
        
        System.out.println(javaDate);
    }
}
