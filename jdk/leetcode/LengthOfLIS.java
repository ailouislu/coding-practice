package jdk.leetcode;

/***
 * Longest Increasing Subsequence II
 * You are given an integer array nums and an integer k.
 *
 * Find the longest subsequence of nums that meets the following requirements:
 *
 * The subsequence is strictly increasing and
 * The difference between adjacent elements in the subsequence is at most k.
 * Return the length of the longest subsequence that meets the requirements.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,1,4,3,4,5,8,15], k = 3
 * Output: 5
 * Explanation:
 * The longest subsequence that meets the requirements is [1,3,4,5,8].
 * The subsequence has a length of 5, so we return 5.
 * Note that the subsequence [1,3,4,5,8,15] does not meet the requirements because 15 - 8 = 7 is larger than 3.
 * Example 2:
 *
 * Input: nums = [7,4,5,1,8,12,4,7], k = 5
 * Output: 4
 * Explanation:
 * The longest subsequence that meets the requirements is [4,5,8,12].
 * The subsequence has a length of 4, so we return 4.
 * Example 3:
 *
 * Input: nums = [1,5], k = 1
 * Output: 1
 * Explanation:
 * The longest subsequence that meets the requirements is [1].
 * The subsequence has a length of 1, so we return 1.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * 1 <= nums[i], k <= 105
 * Accepted
 * 7.9K
 * Submissions
 * 36.4K
 * Acceptance Rate
 * 21.7%
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums, int k) {
        // 创建一个数组dp，初始化为1
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        // 遍历nums数组
        for (int i = 0; i < nums.length; i++) {
            // 遍历之前所有的元素
            for (int j = 0; j < i; j++) {
                // 如果满足条件，则更新dp[i]
                if (nums[j] < nums[i] && Math.abs(nums[j] - nums[i]) <= k) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        // 找到dp数组中的最大值并返回
        int max = 0;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,1,4,3,4,5,8,15};
        int k = 3;
        LengthOfLIS solution = new LengthOfLIS();
        System.out.println(solution.lengthOfLIS(nums, k));
    }
}

/****
 * Longest Increasing Subsequence II
 *
 * Hard
 *
 * 540
 *
 * 22
 *
 * Companies
 *
 * You are given an integer array nums and an integer k.
 *
 * Find the longest subsequence of nums that meets the following requirements:
 *
 * The subsequence is strictly increasing and
 *
 * The difference between adjacent elements in the subsequence is at most k.
 *
 * Return the length of the longest subsequence that meets the requirements.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 * Example 1:
 *
 * Input: nums = [4,2,1,4,3,4,5,8,15], k = 3
 *
 * Output: 5
 *
 * Explanation:
 *
 * The longest subsequence that meets the requirements is [1,3,4,5,8].
 *
 * The subsequence has a length of 5, so we return 5.
 *
 * Note that the subsequence [1,3,4,5,8,15] does not meet the requirements because 15 - 8 = 7 is larger than 3.
 *
 * Example 2:
 *
 * Input: nums = [7,4,5,1,8,12,4,7], k = 5
 *
 * Output: 4
 *
 * Explanation:
 *
 * The longest subsequence that meets the requirements is [4,5,8,12].
 *
 * The subsequence has a length of 4, so we return 4.
 *
 * Example 3:
 *
 * Input: nums = [1,5], k = 1
 *
 * Output: 1
 *
 * Explanation:
 *
 * The longest subsequence that meets the requirements is [1].
 *
 * The subsequence has a length of 1, so we return 1.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 *
 * 1 <= nums[i], k <= 105
 *
 * Accepted
 *
 * 7.9K
 *
 * Submissions
 *
 * 36.4K
 *
 * Acceptance Rate
 *
 * 21.7%
 */
