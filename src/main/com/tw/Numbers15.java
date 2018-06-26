package com.tw;

import java.util.Scanner;

public class Numbers15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        String numStr = scanner.nextLine();
        if (isDuckNum(numStr)) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }
    }

    private static boolean isDuckNum(String numStr) {
        return numStr.contains("0") && (!numStr.startsWith("0"));
    }
}
