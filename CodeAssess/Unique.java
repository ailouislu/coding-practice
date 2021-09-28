package CodeAssess;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Unique {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while((line = br.readLine()) != null)
            System.out.println(uniqueString(line));

    }

    public static String uniqueString(String string) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings = string.split("");

        for (String s : strings)
            map.putIfAbsent(s, 1);

        StringBuilder returnString = new StringBuilder();
        for(String key: map.keySet())
            returnString.append(key);

        return returnString.toString();
    }
}