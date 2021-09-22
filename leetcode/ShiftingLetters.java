package leetcode;

public class ShiftingLetters {
    public static <Char> void main (String[] args) throws Exception {
        int[] shifts  = {3, 5, 9};
        String s = "abc";
//        int[] shifts  = {1, 2, 3};
//        String s = "aaa";

        System.out.println(shiftingLetters(s, shifts));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        s = s.toUpperCase();
        StringBuilder strBuilder = new StringBuilder(s);

        int length = shifts.length;
        final int letterNums = 26;
        final int ASII_a = 90;

        for (int i = 0; i < length; i++) {
            long shiftsNumber = sumArrays(shifts, i);
            shiftsNumber = shiftsNumber > letterNums ? shiftsNumber % letterNums : shiftsNumber;

            long b = (byte) strBuilder.charAt(i) + shiftsNumber;
            if(b > ASII_a)
                b = strBuilder.charAt(i) + 6 + shiftsNumber;

            strBuilder.setCharAt( i, (char) b );
        }

        return strBuilder.toString().toLowerCase();
    }

    public static long sumArrays(int[] nums, int begin){
        if ( begin == nums.length - 1 )
            return nums[begin];

        return nums[begin] +  sumArrays(nums, begin + 1);
    }
}

/**
 * Shifting Letters
 *
  Solution
 You are given a string s of lowercase English letters and an integer array shifts of the same length.

 Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').

 For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.

 Return the final string after all such shifts to s are applied.

 Example 1:

 Input: s = "abc", shifts = [3,5,9]
 Output: "rpl"
 Explanation: We start with "abc".
 After shifting the first 1 letters of s by 3, we have "dbc".
 After shifting the first 2 letters of s by 5, we have "igc".
 After shifting the first 3 letters of s by 9, we have "rpl", the answer.
 Example 2:

 Input: s = "aaa", shifts = [1,2,3]
 Output: "gfd"

 Constraints:

 1 <= s.length <= 105
 s consists of lowercase English letters.
 shifts.length == s.length
 0 <= shifts[i] <= 109
 *
 */