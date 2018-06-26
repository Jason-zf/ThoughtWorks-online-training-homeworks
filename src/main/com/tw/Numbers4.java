package com.tw;

public class Numbers4 {
    public static void main(String[] args) {
        int countKap = 0;
        int radix = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        for (long n = 1; n <= 1000; n++) {
            String squareStr = Long.toString(n * n, radix);
            for (int j = 0; j < squareStr.length() / 2 + 1; j++) {
                String[] parts = splitNum(squareStr, j);
                long firstNum = Long.parseLong(parts[0], radix);
                long secNum = Long.parseLong(parts[1], radix);
                if (secNum == 0) break;
                if (firstNum + secNum == n) {
                    System.out.println(Long.toString(n, radix) +
                            "\t" + squareStr + "\t  " + parts[0] + " + " + parts[1]);
                    countKap++;
                    break;
                }
            }
        }
        System.out.println(countKap + " Kaprekar numbers.");
    }

    public static String[] splitNum(String str, int idx) {
        String[] ans1 = new String[2];
        ans1[0] = str.substring(0, idx);
        if (ans1[0].equals("")) ans1[0] = "0";
        ans1[1] = str.substring(idx);
        return ans1;
    }
}
