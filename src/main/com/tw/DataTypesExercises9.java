package com.tw;

import java.util.Scanner;

public class DataTypesExercises9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1st integer:");
        Integer firstInt = scanner.nextInt();
        System.out.print("Input 2nd integer:");
        Integer secondInt = scanner.nextInt();

        System.out.print("Expected Output :\n");
        System.out.printf("Sum of two integers: %d\n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d\n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d\n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f\n", (firstInt + secondInt) / 2.0);
        System.out.printf("Distance of two integers: %d\n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d\n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d", Math.min(firstInt, secondInt));


    }
}
