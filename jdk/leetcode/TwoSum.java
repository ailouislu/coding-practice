package jdk.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/***
 * 1. Two Sum
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] returnNum = new int[2];

        HashMap<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            numMap.put(nums[i], i);
        }

        int complement;
        for (int j = 0; j < nums.length; j ++) {
            complement = target - nums[j];
            if (numMap.containsKey(complement) && numMap.get(complement) != j){
                returnNum = new int[]{j, numMap.get(complement)};
            }
        }

        return returnNum;
    }
}
