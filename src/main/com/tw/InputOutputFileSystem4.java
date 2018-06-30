package com.tw;

import java.io.File;

public class InputOutputFileSystem4 {
    public static void main(String[] args) {
        File file = new File("./out/");
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write.\n");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot write.\n");
        }
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " can read.\n");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot read.\n");
        }
    }
}
