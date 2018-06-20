package com.tw;

import java.util.Scanner;

public class DataTypesExercises5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT:");
        Long gmt = scanner.nextLong();

        Long totalMillSeconds = System.currentTimeMillis();
        Long totalSeconds = totalMillSeconds / 1000;
        Long currentSeconds = totalSeconds % 60;
        Long totalMinutes = totalSeconds / 60;
        Long currentMinutes = totalMinutes % 60;
        Long totalHours = totalMinutes / 60;
        Long currentHours = (totalHours + gmt) % 24;

        System.out.print("Expected Output:\n" + "Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}
