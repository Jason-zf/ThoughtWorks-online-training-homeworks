package com.tw;

import java.io.*;

public class InputOutputFileSystem17 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String strLine = "";
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream("./test.txt"), "UTF-8"));
            while (((strLine = lineNumberReader.readLine()) != null) && lineNumberReader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            lineNumberReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
