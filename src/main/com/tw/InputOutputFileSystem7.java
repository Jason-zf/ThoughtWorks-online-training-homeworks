package com.tw;

import java.io.File;
import java.util.Date;

public class InputOutputFileSystem7 {
    public static void main(String[] args) {
        File file = new File("./.idea/ThoughtWorks-online-training-homeworks.iml");
        Date date = new Date(file.lastModified());
        System.out.println("The file was last modified on: " + date);
    }
}
