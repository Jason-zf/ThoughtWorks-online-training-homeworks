package com.tw;

import java.util.Scanner;

public class Numbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the min number of the range:");
        int min = scanner.nextInt();
        System.out.print("Input the max number of the range:");
        int max = scanner.nextInt();
        int random = min + (int) (Math.random() * (max - min + 1));
        System.out.println("A random integer between " + min + " and " + max + " is " + random + ".0");


    }
}
