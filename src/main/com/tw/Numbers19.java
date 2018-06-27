package com.tw;

import java.math.BigInteger;
import java.util.Scanner;

public class Numbers19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String strNum = scanner.nextLine().trim();
        BigInteger n = new BigInteger(strNum);
        int len = strNum.length() + 1;
        String str = String.valueOf(len);
        BigInteger n1 = new BigInteger(str);
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < (len - 1); i++) {
            buf.append('9');
        }
        BigInteger total = new BigInteger(buf.toString());
        if (n.multiply(n1).equals(total)) {
            System.out.println("It is a cyclic number.");
        } else {
            System.out.println("Not a cyclic number.");
        }
    }
}
