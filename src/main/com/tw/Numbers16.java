package com.tw;

import java.util.Scanner;

public class Numbers16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNum = scanner.nextInt();
        long sum1 = Numbers2.properDivisorsSum(firstNum);
        long sum2 = Numbers2.properDivisorsSum(secondNum);
        if (sum1 == secondNum && sum2 == firstNum) {
            System.out.println("These numbers are amicable.");
        } else {
            System.out.println("These numbers are not amicable.");
        }
    }
}
