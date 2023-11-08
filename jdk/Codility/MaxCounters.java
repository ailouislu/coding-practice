package jdk.Codility;

import java.util.Arrays;

public class MaxCounters {
    public static void main (String[] args) throws Exception {

        int n = 5;
        int a[] = {3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(getMaxCounters(n, a)));
    }

    public static int[] getMaxCounters(int n, int[] a) {
        int length = a.length;
        int[] result = new int[n];
        Arrays.fill(result,0);

        int max = 0;
        int m = 0;
        int min = 0;
        for(int i = 0; i < length; i ++){
            m = a[i];
            if(m >= 1 && m <= n){
                if(m < min)
                    result[m - 1]  = min;
                result[m - 1] += 1;
                max = Math.max(max, result[m - 1]);
                System.out.println(Arrays.toString(result));
            }
            else if(m == (n + 1)){
                min = max;
                System.out.println("min1:" + min);
            }
        }

        for(int i = 0; i < result.length; i ++){
            System.out.println("min:" + min);
            if(result[i] < min){
                result[i] = min;
                System.out.println(Arrays.toString(result));

            }
        }

        return result;
    }

    public static int[] getMaxCounters2(int N, int[] A) {
        // 1. key point: maintain the max value
        int max = 0;

        // 2. key point: maintain the current_min (very important!!!)
        // so, we can move "the 2nd for-loop" outside "the 1st for-loop"
        // by maintaining "min"
        int min = 0;

        // new integer array
        int[] my_array = new int[N];

        /* no need to initialize (because the values are "0" by default)
        for(int i=0; i<my_array.length; i++){
            my_array[i] =0;
        }
        */

        for(int i = 0; i < A.length; i++){
            if( A[i] >= 1 && A[i] <= N){ // normal case

                // important: check the "min" before "increasing by 1"
                if(my_array[ A[i] -1] < min)
                    my_array[ A[i] -1] = min; // update it to "min"

                my_array[ A[i] -1 ] ++;  // increased by 1

                if( my_array[ A[i] -1 ] > max) // maintain max
                    max = my_array[ A[i] -1 ];
            }
            else if( A[i] == N+1){      // special case
                /* cannot use for-loop (will take too much time)
                Arrays.fill(my_array, max);
                for(int j=0; j<my_array.length; j++){
                    my_array[j] = max;
                }
                // instead, we maintain "min", so we can move the for-loop outside */
                min = max; // all the values should be bigger than "max"
                // therefore, "min = max"
            }
        }

        // move the 2nd for-loop outside the 1st for-loop
        // update some elements who have not been updated yet
        for(int j=0; j<my_array.length; j++){
            if(my_array[j] < min){
                my_array[j] = min; // update it to "min"
            }
        }

        return my_array;
    }

}

/****
 * MaxCounters: Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.

 You are given N counters, initially set to 0, and you have two possible operations on them:

 increase(X) − counter X is increased by 1,
 max counter − all counters are set to the maximum value of any counter.
 A non-empty array A of M integers is given. This array represents consecutive operations:

 if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 if A[K] = N + 1 then operation K is max counter.
 For example, given integer N = 5 and array A such that:

 A[0] = 3
 A[1] = 4
 A[2] = 4
 A[3] = 6
 A[4] = 1
 A[5] = 4
 A[6] = 4
 the values of the counters after each consecutive operation will be:

 (0, 0, 1, 0, 0)
 (0, 0, 1, 1, 0)
 (0, 0, 1, 2, 0)
 (2, 2, 2, 2, 2)
 (3, 2, 2, 2, 2)
 (3, 2, 2, 3, 2)
 (3, 2, 2, 4, 2)
 The goal is to calculate the value of every counter after all operations.

 Write a function:

 class Solution { public int[] solution(int N, int[] A); }

 that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.

 Result array should be returned as an array of integers.

 For example, given:

 A[0] = 3
 A[1] = 4
 A[2] = 4
 A[3] = 6
 A[4] = 1
 A[5] = 4
 A[6] = 4
 the function should return [3, 2, 2, 4, 2], as explained above.

 Write an efficient algorithm for the following assumptions:

 N and M are integers within the range [1..100,000];
 each element of array A is an integer within the range [1..N + 1].
 */