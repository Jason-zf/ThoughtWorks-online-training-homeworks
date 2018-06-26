package com.tw;

import java.util.Scanner;

import static com.tw.Numbers9.isHappyNum;

public class Numbers10 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(Numbers9.isHappyNum(num) ? "Happy Number" : "Unhappy Number");
    }
}
