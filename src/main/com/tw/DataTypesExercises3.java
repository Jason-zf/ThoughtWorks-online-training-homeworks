package com.tw;

import java.util.Scanner;

public class DataTypesExercises3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000:");
        Integer integer = scanner.nextInt();

        Integer sum = integer % 10 + integer / 10 % 10 + integer / 100;
        System.out.print("Expected Output :\n");
        System.out.print("The sum of all digits in " + integer + " is " + sum);
    }
}
