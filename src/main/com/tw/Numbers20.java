package com.tw;

public class Numbers20 {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 0; i <= 10; ++i) {
            result = Math.pow(2, Math.pow(2, i)) + 1;
            System.out.println(result);
        }
    }
}
