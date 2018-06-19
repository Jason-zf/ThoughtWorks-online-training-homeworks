package com.tw;

import java.util.Scanner;

public class DataTypesExercises4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes:");
        Integer minutes = scanner.nextInt();

        Integer totalDays = minutes / 1440;
        Integer years = totalDays / 365;
        Integer days = totalDays % 365;
        System.out.print("Expected Output :");
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
