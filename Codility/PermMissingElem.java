package Codility;

import java.util.Arrays;

public class PermMissingElem {
    public static void main (String[] args) throws Exception {

        int a[] = {1,2,3};
        System.out.println(findPermMissingElem(a));
    }

    public static int findPermMissingElem(int[] a) {
        int length = a.length;
        if(length == 0)
            return 1;
        int result = 0;
        Arrays.sort(a);
        int an = 1;
        for(int i = 0; i < a[length-1]; i ++){
            if(a[i] != an){
                result = an;
                break;
            }
            if(i == length - 1 && an == a[i]){
                result = an + 1;
            }
            an ++;
        }

        return result;
    }

}

/****
 An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

 Your goal is to find that missing element.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A, returns the value of the missing element.

 For example, given array A such that:

 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5
 the function should return 4, as it is the missing element.

 Write an efficient algorithm for the following assumptions:

 N is an integer within the range [0..100,000];
 the elements of A are all distinct;
 each element of array A is an integer within the range [1..(N + 1)].
 */