package com.tw;

public class Numbers8 {
    public static void main(String[] args) {
        int num = 10;
        int[] c = new int[num + 2];
        c[0] = c[1] = 1;
        System.out.println("List 10 Catalan numbers:-\n1");
        for (int i = 2; i <= num; ++i) {
            int buff = 0;
            for (int j = 0; j <= i - 1; ++j) {
                buff += c[j] * c[i - 1 - j];
            }
            c[i] = buff;
            System.out.println(c[i]);
        }
    }
}
