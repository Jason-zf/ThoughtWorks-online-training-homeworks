package com.tw;

import java.util.Scanner;

public class DataTypesExercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input weight in pounds:");
        Double weightInPounds = scanner.nextDouble();
        System.out.print("Input height in inches:");
        Double heightInInches = scanner.nextDouble();

        Double weightInKilos = weightInPounds * 0.45359237;
        Double heightInMeter = heightInInches * 0.0254;

        Double bmi = weightInKilos / (heightInMeter * heightInMeter);

        System.out.print("Expected Output:\n" + "Body Mass Index is " + bmi);

    }
}
