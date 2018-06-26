package com.tw;

import java.util.HashSet;

public class Numbers9 {
    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers:");
        for (long num = 1, count = 0; count < 8; num++) {
            if (isHappyNum(num)) {
                System.out.println(num);
                count++;
            }
        }
    }

    private static boolean isHappyNum(long num) {
        long sum = 0;
        int digit = 0;
        HashSet<Long> hashSet = new HashSet<>();
        while (num != 1 && hashSet.add(num)) {
            sum = 0;
            while (num > 0) {
                digit = (int) (num % 10);
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }
}
