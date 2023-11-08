package jdk.CodeAssess;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumber {
    public static <String> void main(String[] args) throws Exception {
        //use the following code to fetch input from console
        java.lang.String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        java.lang.String[] inputString;

        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }

            inputString = line.split(" ");
            int[] inputNumbers = strArrayToIntArray((java.lang.String[]) inputString);
            System.out.println(maximumNumber(inputNumbers));
            count = 0;
        }
    }

    public static String maximumNumber(int[] numbers) {
        int maxNumber = 0;
        int maxTimes = 0;

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int n : numbers) {
            if(map.get(n) == null){
                map.put(n, 1);
                continue;
            }

            if( map.get(n) + 1 > maxTimes){
                maxNumber = n;
                maxTimes = map.get(n) + 1;
            }

            if( map.get(n) + 1 == maxTimes && n > maxNumber)
                maxNumber = n;

            map.put(n, map.get(n) + 1);
        }

        Arrays.sort(numbers);
        if(maxTimes == 0)
            return String.valueOf(numbers[numbers.length-1]);

        return String.valueOf(maxNumber);
    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];
        for ( int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

}