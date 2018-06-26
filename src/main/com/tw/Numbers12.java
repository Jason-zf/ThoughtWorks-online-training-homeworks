package com.tw;

import java.util.Scanner;

public class Numbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        if (isHarshadNum(num)) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }

    private static boolean isHarshadNum(int num) {
        int sum = 0;
        int copy = num;
        while (copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        return num % sum == 0;
    }
}
