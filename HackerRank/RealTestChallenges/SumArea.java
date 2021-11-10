package HackerRank.RealTestChallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumArea {
    public static void main (String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = bufferedReader.readLine().split(" ");
        int length = Integer.parseInt(input[0]);
        int breadth = Integer.parseInt(input[1]);

        System.out.println(length + " " + breadth);
        System.out.println(area(length, breadth));

        bufferedReader.close();
    }


    public static int area(int length, int breadth) {

        return length * breadth;
    }

}
