package com.tw;

import java.util.Scanner;

public class DataTypesExercises8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the side length value: ");
        Double length = scanner.nextDouble();

        System.out.printf("Square: %.2f\n", length * length);
        System.out.printf("Cube: %.2f\n", length * length * length);
        System.out.printf("Fourth power: %.2f\n", Math.pow(length, 4));
    }
}
