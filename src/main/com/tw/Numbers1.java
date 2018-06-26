package com.tw;

import java.util.Scanner;

public class Numbers1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int number = in.nextInt();
        boolean flag = false;
        while (number != 1) {
            if (number % 5 == 0) {
                number /= 5;
            } else if (number % 3 == 0) {
                number /= 3;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                System.out.println("It is not an ugly number.");
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("It is an ugly number.");
    }
}
