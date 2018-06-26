package com.tw;

import static java.util.stream.IntStream.rangeClosed;

public class Numbers2 {
    public static void main(String[] args) {
        int abundantCount = 0;
        int deficientCount = 0;
        int perfectCount = 0;

        for (int i = 1; i <= 10000; ++i) {
            long sum = properDivisorsSum(i);
            if (sum > i) {
                abundantCount++;
            } else if (sum == i) {
                perfectCount++;
            } else {
                deficientCount++;
            }
        }

        System.out.println("Number Counting [(integers) between 1 to 10,000]: ");
        System.out.println("Abundant number: " + abundantCount);
        System.out.println("Deficient number: " + deficientCount);
        System.out.println("Perfect number: " + perfectCount);
    }

    public static long properDivisorsSum(int num) {
        return rangeClosed(1, (num + 1) / 2).filter(i -> num % i == 0 && num != i).sum();
    }
}
