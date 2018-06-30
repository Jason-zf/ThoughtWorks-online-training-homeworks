package com.tw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputFileSystem15 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            String filename = "./test.txt";
            FileWriter fileWriter = new FileWriter(filename, false);
            fileWriter.write("Python Exercises\n");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./test.txt"));
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = bufferedReader.readLine();
                if (strLine != null) {
                    System.out.println(strLine);
                }
            }
            bufferedReader.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
