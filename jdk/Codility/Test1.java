package jdk.Codility;

import java.util.Arrays;

public class Test1 {
    public static void main (String[] args) throws Exception {


        int[] x = {2,-3,3,1,10,8,2,5,13,-5,3,-18};
        System.out.println(findJumpNumbers(x));
    }

    public static String findJumpNumbers(int[] T) {

        String result = "";
        int length = T.length;
        int scope = length / 4;

        int WinterArray[] = Arrays.copyOfRange(T, 0, scope -1);
        int SpringArray[] = Arrays.copyOfRange(T, scope, 2*scope -1);
        int SummerArray[] = Arrays.copyOfRange(T, 2*scope, 3*scope -1);
        int AutumnArray[] = Arrays.copyOfRange(T, 3*scope, 4*scope);

        int max = 0;
        int WinterMax = max_difference(WinterArray);
        int SpringMax = max_difference(SpringArray);
        int SummerMax = max_difference(SummerArray);
        int AutumnMax = max_difference(AutumnArray);
        if(WinterMax > max){
            max = WinterMax;
            result = "WINTER";
        }else if(SpringMax > max){
            max = SpringMax;
            result = "SPRING";
        }else if(SummerMax > max){
            max = SummerMax;
            result = "SUMMER";
        }else if(AutumnMax > max){
            max = AutumnMax;
            result = "AUTOMN";
        }

        return result;
    }

    public static int max_difference(int[] a){
        int len=a.length;
        if(len<2){
            return 0;
        }
        int min=Math.min(a[0], a[1]);
        int max_diff = a[1]-a[0];
        for(int i=2;i<len;i++){
            if(a[i]-min>max_diff){
                max_diff=a[i]-min;
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        return max_diff;
    }

}

/****
 * FrogJmp: Count minimal number of jumps from position X to Y.
 *
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 *
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 *
 * Write a function:
 *
 * class Solution { public int solution(int X, int Y, int D); }
 *
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 *
 * For example, given:
 *
 *   X = 10
 *   Y = 85
 *   D = 30
 * the function should return 3, because the frog will be positioned as follows:
 *
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Write an efficient algorithm for the following assumptions:
 *
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 */