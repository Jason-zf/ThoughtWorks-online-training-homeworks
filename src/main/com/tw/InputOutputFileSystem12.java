package com.tw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputFileSystem12 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./test.txt"));
            while (strLine != null) {
                stringBuilder.append(strLine);
                System.out.println(stringBuilder);
                strLine = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
