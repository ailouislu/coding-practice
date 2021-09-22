package leetcode;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CircleIntersection {
    public static void main (String[] args) throws Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String[] inputString = new String[3];
        int[] circle1 = new int [3];
        int[] circle2 = new int [3];

        while((line=br.readLine()) != null) {
            inputString = line.split(" ");

            if (count == 0){
                circle1 = strArrayToIntArray(inputString);
                count++;
            }
            else {
                circle2 = strArrayToIntArray(inputString);
                System.out.println(isIntersection(circle1, circle2));
                count = 0;
            }
        }
    }

    public static String isIntersection (int[] circle1, int[] circle2){

        int x1 = circle1[0];
        int x2 = circle1[1];
        int r1 = circle1[2];

        int y1 = circle2[0];
        int y2 = circle2[1];
        int r2 = circle2[2];

        if(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)) < (r1+r2))
            return "YES";

        return "NO";
    }

    public static int[] strArrayToIntArray(String[] strings){
        int[] ints = new int[strings.length];
        for ( int i = 0; i < strings.length; i++)
            ints[i] = Integer.parseInt(strings[i]);

        return ints;
    }

}