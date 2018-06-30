package com.tw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutputFileSystem13 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        String strData = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
            while (strLine != null) {
                if (strLine == null)
                    break;
                stringBuilder.append(strLine + "\n");
                strLine = br.readLine();
            }
            strData = stringBuilder.toString();
            System.out.println(strData);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
