package jdk.CodeAssess;

import java.io.*;

public class Sum {
    public static void main (String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int count = 0;

        while((line = br.readLine()) != null) {
            if(count == 0) {
                sum = Integer.parseInt(line);
                count++;
                continue;
            }

            sum += Integer.parseInt(line.trim());
            System.out.println( sum);
        }
    }
}