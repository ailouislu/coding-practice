package jdk.leetcode;

import java.util.HashMap;
import java.util.Map;

/***
 * 13. Roman to Integer
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for ( int i = 0; i < s.length(); i ++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1)))
                result -= m.getOrDefault(s.charAt(i), 0);
            else
                result += m.getOrDefault(s.charAt(i),0);
        }

        return result;
    }
}
