package com.tw;

import java.util.Scanner;

public class Numbers13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        if (isPronicNum(num)) {
            System.out.println("Pronic Number.");
        } else {
            System.out.println("Not a Pronic Number.");
        }
    }

    private static boolean isPronicNum(int num) {
        boolean flag = false;
        for (int i = 0; i < num; ++i) {
            if (i * (i + 1) == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
