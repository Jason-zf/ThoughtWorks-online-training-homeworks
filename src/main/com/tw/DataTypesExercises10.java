package com.tw;

import java.util.Scanner;

public class DataTypesExercises10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        Integer integer = scanner.nextInt();

        String res = integer.toString();
        System.out.print("Expected Output :\n");
        for (int i = 0; i < res.length(); ++i) {
            System.out.print(Character.digit(res.charAt(i), 10) + " ");
        }

    }
}
