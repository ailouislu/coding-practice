package HackerRank.DictionariesHashmaps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class RansomNote {
    public static void main (String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine()
                                                    .replaceAll("\\s+$", "")
                                                    .split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine()
                                      .replaceAll("\\s+$", "")
                                      .split(" "))
                                      .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine()
                                                    .replaceAll("\\s+$", "")
                                                    .split(" "))
                                                    .collect(toList());

        checkMagazine(magazine, note);
        bufferedReader.close();
    }


    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */
    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map map = new HashMap<String, Integer>();
        int num = 0;
        for(String m : magazine) {
            num = (int) map.getOrDefault(m, 0);
            if (num != 0) {
                num --;
                map.put(m, num);
                continue;
            }

            map.put(m, 1);
        }

        int num2;
        for (String n : note) {
            num2 = (int) map.getOrDefault(n,0);
            if (num2 == 0) {
                System.out.println("No");
                return;
            }

            if (num2 == 1) {
                map.remove(n);
                continue;
            }

            map.put(n, num2 - 1);
        }

        System.out.println("Yes");
    }

}

/****
 * Hash Tables: Ransom Note
 *
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.
 *
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 *
 * Example
 *  = "attack at dawn"  = "Attack at dawn"
 *
 * The magazine has all the right words, but there is a case mismatch. The answer is .
 *
 * Function Description
 *
 * Complete the checkMagazine function in the editor below. It must print  if the note can be formed using the magazine, or .
 *
 * checkMagazine has the following parameters:
 *
 * string magazine[m]: the words in the magazine
 * string note[n]: the words in the ransom note
 * Prints
 *
 * string: either  or , no return value is expected
 * Input Format
 *
 * The first line contains two space-separated integers,  and , the numbers of words in the  and the , respectively.
 * The second line contains  space-separated strings, each .
 * The third line contains  space-separated strings, each .
 *
 * Constraints
 *
 * .
 * Each word consists of English alphabetic letters (i.e.,  to  and  to ).
 * Sample Input 0
 *
 * 6 4
 * give me one grand today night
 * give one grand today
 * Sample Output 0
 *
 * Yes
 * Sample Input 1
 *
 * 6 5
 * two times three is not four
 * two times two is four
 * Sample Output 1
 *
 * No
 * Explanation 1
 *
 * 'two' only occurs once in the magazine.
 *
 * Sample Input 2
 *
 * 7 4
 * ive got a lovely bunch of coconuts
 * ive got some coconuts
 * Sample Output 2
 *
 * No
 * Explanation 2
 *
 * Harold's magazine is missing the word .
 */