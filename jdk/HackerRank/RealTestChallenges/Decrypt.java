package jdk.HackerRank.RealTestChallenges;

import java.io.*;

import static java.util.stream.Collectors.joining;

public class Decrypt {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String encryptedMessage = bufferedReader.readLine();

        //decryptMessages(encryptedMessage);
        System.out.println(decryptMessage(encryptedMessage));

        bufferedReader.close();
    }

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */
    public static String decryptMessage(String encryptedMessage) {
        String result = "";
        String[] inputs = encryptedMessage.split(" ");
        int length = inputs.length;
        int number = 0;
        for (int i = length-1; i >= 0; i--) {
            char chars[] = inputs[i].toCharArray();
            for (int j = 0; j < inputs[i].length(); j++) {
                if (Character.isDigit(chars[j])) {
                    number = Integer.parseInt(String.valueOf(chars[j]));
                    for (int z = 0; z < number-1; z++) {
                        result += chars[j - 1];
                    }
                    continue;
                }
                result += chars[j];
            }
            result += " ";
        }
        return result;
    }

    public static void decryptMessages(String encryptedMessage) {
        Double a = Math.sqrt(encryptedMessage.length());
        int h = (int) Math.floor(a);
        int w = (int) Math.ceil(a);
        int count = 0;
        char ar[] = encryptedMessage.toCharArray();

        for (int i = 0; i < w; i++) {
            int j = i;
            while (j < encryptedMessage.length()) {
                System.out.print(ar[j]);
                j += w;
                count++;
            }
            System.out.print(" ");
        }
    }
}

/***
 *
 * a3b4q2i abcd2 abc
 * abc abcdd aaabbbbqqi
 */