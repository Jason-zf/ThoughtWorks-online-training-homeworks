package com.tw;

import java.util.Scanner;

public class Numbers22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scanner.nextInt();
        int n1 = n + 1;
        boolean flag = false;
        for (int i = 0; ; ++i) {
            int power = (int) Math.pow(2, i);
            if (power > n1) {
                break;
            } else if (power == n1) {
                System.out.println(n + " is a Mersenne number.");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println(n + " is not a Mersenne number.");
        }
    }
}
