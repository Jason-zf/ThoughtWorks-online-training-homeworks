package com.tw;

import java.util.Scanner;

public class Numbers15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        if (isDuckNum(num)) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }
    }

    private static boolean isDuckNum(int num) {
        String string = Integer.toString(num);
        return string.contains("0") && (!string.startsWith("0"));
    }
}
