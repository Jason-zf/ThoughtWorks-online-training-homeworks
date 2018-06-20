package com.tw;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Scanner;

public class DataTypesExercises7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters:");
        Double distanceInMeter = scanner.nextDouble();
        System.out.print("Input hour:");
        Double hour = scanner.nextDouble();
        System.out.print("Input minutes: ");
        Double minutes = scanner.nextDouble();
        System.out.print("Input seconds:");
        Double seconds = scanner.nextDouble();

        Double totalHours = hour + minutes / 60 + seconds / 3600;
        Double totalSeconds = hour * 3600 + minutes * 60 + seconds;
        Double speedInMeterPerSecond = distanceInMeter / totalSeconds;
        Double speedInKMPerHour = distanceInMeter / 1000 / totalHours;
        Double speedInMilesPerHour = distanceInMeter / 1609.344 / totalHours;
        System.out.print("Expected Output :\n" +
                "Your speed in meters/second is " + speedInMeterPerSecond + "\n" +
                "Your speed in km/h is " + speedInKMPerHour + "\n" +
                "Your speed in miles/h is " + speedInMilesPerHour);
    }
}
