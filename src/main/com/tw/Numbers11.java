package com.tw;

import java.util.Scanner;

public class Numbers11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        if (isDisariumNum(num)) {
            System.out.println("Disarium Number.");
        } else {
            System.out.println("Not a Disarium Number.");
        }
    }

    private static boolean isDisariumNum(int num) {
        int len = Integer.toString(num).length();
        int sum = 0;
        int copy = num;

        while (copy > 0) {
            int buff = copy % 10;
            sum += Math.pow(buff, len);
            len--;
            copy /= 10;
        }
        return sum == num;
    }
}
