package com.heymsweetheart.io;

import java.io.*;

/**
 * Created by leo on 15/8/14.
 * Use character stream to read and write lines from and to files.
 */
public class CopyLine {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("source.txt"));
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter("target.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);  //println() will also print the line seperator.
//               printWriter.write(line);
//                printWriter.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (printWriter != null) {
            printWriter.close();
        }
    }
}
