package com.tw;

import java.util.Scanner;

public class DataTypesExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a value for inch:");
        Double inches = scanner.nextDouble();

        Double meters = inches * 0.0254;
        System.out.print("Expected Output :\n");
        System.out.print(inches + " inch is " + meters + " meters");

    }
}
