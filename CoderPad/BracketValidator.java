package CoderPad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BracketValidator {
    public static void main (String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList();
        strings.add(") )  ( { [] ( ) }");
        strings.add("{ [] ( ) }");
        strings.add("{ [(] ) }");
        strings.add("{ [ }");

        for (String string : strings)
            System.out.println(string + " should return " + isBracketValid(string));
    }

    public static Boolean isBracketValid(String string) {
        Boolean result = false;
        string = string.replaceAll(" ", "");
        Map<String,Integer> map = new HashMap<>();
        for(Character c : string.toCharArray())
            if (c.toString().equals("(") || c.toString().equals("[") || c.toString().equals("{"))
                map.put(c.toString(), map.getOrDefault(c.toString(), 0) + 1);

        for(Character c : string.toCharArray()) {
            switch (c.toString()) {
                case ")":
                    if (map.getOrDefault("(", 0) == 1)
                        map.remove("(");
                    else
                        map.put("(", map.getOrDefault("(", 0) - 1);
                    break;
                case "]":
                    if (map.getOrDefault("[", 0) == 1)
                        map.remove("[");
                    else
                        map.put("[", map.getOrDefault("[", 0) - 1);
                    break;
                case "}":
                    if (map.getOrDefault("{", 0) == 1)
                        map.remove("{");
                    else
                        map.put("{", map.getOrDefault("{", 0) - 1);
                    break;
            }
        }

        if(map.isEmpty())
            result = true;

        return result;
    }

}

/****
 * Bracket Validator: Write a super-simple JavaScript parser that can find bugs in your intern's code.

 **You're working with an intern that keeps coming to you with JavaScript code
 * that won't run because the braces, brackets, and parentheses are off.
 * To save you both some time, you decide to write a braces/brackets/parentheses validator.**

 Let's say:

 - '(', '{', '[' are called "_openers_."
 - ')', '}', ']' are called "_closers_."

 Write an efficient method that tells us whether
 or not an input string's openers and closers are properly nested.

 Examples:

 - "{ [] ( ) }" should return **`true`**
 - "{ [(] ) }" should return **`false`**
 - "{ [ }" should return **`false`**
 */