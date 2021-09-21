package CodeAssess;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CircleIntersection {
    public static void main (String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String[] inputString = new String[3];
        int[] circle1 = new int [3];
        int[] circle2 = new int [3];

        while((line=br.readLine()) != null) {
            inputString = line.split(" ");

            if (count == 0){
                circle1 = strArrayToIntArray(inputString);
                count++;
                continue;
            }

            circle2 = strArrayToIntArray(inputString);
            System.out.println(isIntersection(circle1, circle2));
            count = 0;
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

/***
 * Circle Intersection
 * Problem Level: EasyMediumHard
 * Problem Description:
 * This problem tests the knowledge of basic geometry skills,
 * such as circles and point to point distance.
 * Recommended time for solving this problem:
 * 15 minutes
 * Added by:
 * Team Codeassess
 * Tags:
 * Geometry, If condition, If else condition, Logical operations,
 * Logical operators, Print, Output, Input Output, STDIN STDOUT,
 * Console, Console Read, Console Write, Reading, Writing, Squareroot,
 * SquareProblem Root, Circle, Radius, Intersection, Coordinates, Co-ordinates
 * Problem Text:
 * 7/10
 * Write a program that takes the center co-ordinates and radius of
 * two circles and gives output YES, if they intersect each other,
 * otherwise gives output NO. The input will be given in the following format:
 *
 *
 * x1 y1 c1
 * x2 y2 c2
 *
 * One line for each circle, where xi,yi stands for the center coordinates
 * of the i-th circle and c1 for its radius. Note that xi, yi and ci are all integers.
 *
 * Two circles intersect each other if it's not possible to find a line
 * that separates them.
 *
 *
 * Example
 *
 * Case 1: For the input provided as follows:
 *
 * 0 0 1
 * 0 0 2
 *
 * Output of the program will be:
 *
 * YES
 *
 * Description:
 *
 * Since they share the same center co-ordinates, they intersect each other.
 *
 * Case 2:
 * For the input provided as follows:
 *
 * 0 0 1
 * 4 0 2
 *
 * Output of the program will be:
 *
 * NO
 *
 * Description:
 *
 * They do not share any point, so they do not intersect with each other.
 */