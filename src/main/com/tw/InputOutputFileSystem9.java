package com.tw;

import java.io.File;

public class InputOutputFileSystem9 {
    public static void main(String[] args) {
        File file = new File("./.idea/ThoughtWorks-online-training-homeworks.iml");
        if (file.exists()) {
            System.out.println(fileSizeInBytes(file));
            System.out.println(fileSizeInKiloBytes(file));
            System.out.println(fileSizeInMegaBytes(file));
        } else
            System.out.println("File doesn't exist");

    }

    private static String fileSizeInMegaBytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";
    }

    private static String fileSizeInKiloBytes(File file) {
        return (double) file.length() / 1024 + "  kb";
    }

    private static String fileSizeInBytes(File file) {
        return file.length() + " bytes";
    }
}
