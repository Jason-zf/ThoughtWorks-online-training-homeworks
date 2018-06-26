package com.tw;

import java.util.Scanner;

public class Numbers14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        if (isAutomorphicNum(num)) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }
    }

    private static boolean isAutomorphicNum(int num) {
        int sqrt = num * num;
        String originalStr = Integer.toString(num);
        String newStr = Integer.toString(sqrt);
        return newStr.endsWith(originalStr);
    }
}
