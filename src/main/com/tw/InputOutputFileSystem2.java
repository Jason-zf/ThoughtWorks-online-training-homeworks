package com.tw;

import java.io.File;
import java.io.FilenameFilter;

public class InputOutputFileSystem2 {
    public static void main(String[] args) {
        File file = new File("./.idea/");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".xml")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f : list) {
            System.out.println(f);
        }
    }
}
