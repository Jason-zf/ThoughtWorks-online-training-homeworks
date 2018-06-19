package com.tw;

import java.util.Scanner;

public class DataTypesExercises1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit:");
        Double fahrenheit = scanner.nextDouble();

        Double celsius = (fahrenheit - 32) / 1.8;
        System.out.print("Expected Output:\n");
        System.out.print(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}

