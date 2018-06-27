package com.tw;

import java.util.Scanner;

import static com.tw.Numbers17.circulateFunc;
import static com.tw.Numbers17.isPrime;

public class Numbers27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        int divisor = 1, circularNum = num;
        boolean allPrime = true;
        for (int i = num; i > 0; i /= 10) {
            divisor *= 10;
        }
        divisor /= 10;
        System.out.println("Output: ");
        do {
            System.out.println("        " + circularNum);
            circularNum = circulateFunc(circularNum, divisor);
            if (!isPrime(circularNum)) allPrime = false;
        } while (circularNum != num);
        if (allPrime) {
            System.out.println("        " + num + " is Circular Prime number.");
        } else {
            System.out.println("        " + num + " is not a Circular Prime number.");
        }
    }
}
