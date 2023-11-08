package jdk.Coderbyte;

public class LongestWord {
    public static void main (String[] args) throws Exception {

//        String s = "Hello world123 567";
//        String s = "fun&!! time";
        String s = "I love dogs";
        System.out.println(findLongestWord(s));
    }

    public static String findLongestWord(String sen) {
        String result = "";
        String ss = sen.replaceAll("\\p{Punct}", "").trim();
        String[] sens = ss.split(" ");
        int max = 0;
        for(String s : sens){
            if(s.length() > max){
                max = s.length();
                result = s;
            }
        }

        return result;
    }

}

/****
 * Longest Word
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word
 * in the string. If there are two or more words that are the same length,
 * return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 * Words may also contain numbers,
 * for example "Hello world123 567"
 * Examples
 * Input: "fun&!! time"
 * Output: time
 * Input: "I love dogs"
 * Output: love
 * Tags
 * string manipulationsearchingfree
 */