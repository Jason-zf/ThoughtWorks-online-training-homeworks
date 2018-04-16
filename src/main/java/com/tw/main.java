package com.tw;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Library klass = new Library();

        while (true) {
            klass.accept(Integer.valueOf(scanner.next()));
        }
    }
}
