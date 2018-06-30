package com.tw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutputFileSystem18 {
    public static void main(String[] args) {
        String fileName = "./test.txt";
        String longestWord = null;
        try {
            longestWord = findLongestWordInFile(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Longest word: " + longestWord);
    }

    private static String findLongestWordInFile(String fileName) throws FileNotFoundException {
        String longestWord = "";
        String current;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        return longestWord;
    }
}
