package com.tw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputOutputFileSystem14 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./test.txt"));
            while (strLine != null) {
                if (!strLine.isEmpty()) {
                    list.add(strLine);
                }
                strLine = bufferedReader.readLine();
                if (strLine != null) {
                    stringBuilder.append(strLine);
                    stringBuilder.append(System.lineSeparator());
                }
            }
            System.out.println(Arrays.toString(list.toArray()));
            System.out.println(stringBuilder);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
