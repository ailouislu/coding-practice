package leetcode;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MediaTwoArrays {

    public static void main (String[] args) throws Exception {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double returnNum = 0.00000;
        int[] nums = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
        Arrays.sort(nums);
        int length = nums.length;

        if(length == 1)  returnNum = nums[0];

        if(length % 2 == 1)  returnNum = nums[length/2];

        if(length % 2 == 0){
            returnNum = (nums[length/2 - 1] + nums[length/2]);
            returnNum = returnNum/2;
        }

        return returnNum;
    }

}


/***
 * Median of Two Sorted Arrays
 * Hard
 *
 * 12147
 *
 * 1663
 *
 * Add to List
 *
 * Share
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Example 3:
 *
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * Example 4:
 *
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * Example 5:
 *
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * Accepted
 * 1,063,779
 * Submissions
 * 3,266,364
 */
