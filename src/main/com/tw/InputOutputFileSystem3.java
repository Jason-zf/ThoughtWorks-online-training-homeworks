package com.tw;

import java.io.File;

public class InputOutputFileSystem3 {
    public static void main(String[] args) {
        File file = new File("./.idea/");
        if (file.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}
