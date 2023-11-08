package jdk.HackerRank.RealTestChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiSum {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputs[] = bufferedReader.readLine().split(" ");
        char chars[] = inputs[0].toCharArray();
        if(Character.isDigit(chars[0])){
            Integer[] inputNumbers = strArrayToIntArray(inputs);
            System.out.println(sum(inputNumbers));
        }
        else {
            System.out.println(sum(inputs));
        }

        bufferedReader.close();
    }


    public static Integer sum(Integer[] ints) {
        int result = 0;
        for(int i = 0; i < ints.length; i ++){
            result += ints[i];
        }

        return result;
    }

    public static String sum(String[] ints) {
        String result = "";
        for(int i = 0; i < ints.length; i ++){
            result += ints[i];
        }

        return result;
    }

    public static Integer[] strArrayToIntArray(String[] strings){
        Integer[] ints = new Integer[strings.length];

        for ( int i = 0; i < strings.length; i++)
            ints[i] = Integer.parseInt(strings[i]);

        return ints;
    }


}
