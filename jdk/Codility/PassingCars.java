package jdk.Codility;

public class PassingCars {
    public static void main (String[] args) throws Exception {

        int[] a = {0,1,0,1,1};
        System.out.println(countPassingCars(a));
    }

    public static int countPassingCars(int[] A) {
        // write your code in Java SE 8

        // note: find number of pairs (P, Q)
        // where P < Q (important)
        // try to use "one pass" solution (low time complexity)

        int num_east = 0; // initial
        int num_pass = 0; // initial

        for(int i=0; i< A.length; i++){
            if(A[i] == 0){ // to east
                num_east++;
            }
            if(A[i] == 1){ // to west
                num_pass = num_pass + num_east;
            }
            // note: just look back "num_east"
            //       that will be the number of cars can be paired
            //       (with the current car)
        }

        // note 1: can use "_" for a big value
        // note 2: "num_pass < 0" is for the "overflow" cases
        //         when "overflow" occurs, the value will "< 0" (important)
        if(num_pass > 1_000_000_000 || num_pass < 0)
            return -1;
        else
            return num_pass;
    }
}

/****
 * PassingCars: Count the number of passing cars on the road.

 A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.

 Array A contains only 0s and/or 1s:

 0 represents a car traveling east,
 1 represents a car traveling west.
 The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

 For example, consider array A such that:

 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

 The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

 For example, given:

 A[0] = 0
 A[1] = 1
 A[2] = 0
 A[3] = 1
 A[4] = 1
 the function should return 5, as explained above.

 Write an efficient algorithm for the following assumptions:

 N is an integer within the range [1..100,000];
 each element of array A is an integer that can have one of the following values: 0, 1.
 */