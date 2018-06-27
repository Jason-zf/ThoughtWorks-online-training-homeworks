package com.tw;

import java.util.Scanner;

public class Numbers17 {
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
        do {
            circularNum = circulateFunc(circularNum, divisor);
            if (!isPrime(circularNum)) allPrime = false;
        } while (circularNum != num);
        if (allPrime) {
            System.out.println("It is Circular Prime number.");
        } else {
            System.out.println("It is not a Circular Prime number.");
        }
    }


    public static boolean isPrime(int n) {
        int factorCount = 0;
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;
        else {
            int num = (int) Math.sqrt(n);
            for (int i = 3; i <= num; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int circulateFunc(int n, int divisor) {
        if (n < 10) return n;
        else return (n % divisor) * 10 + n / divisor;
    }
}
