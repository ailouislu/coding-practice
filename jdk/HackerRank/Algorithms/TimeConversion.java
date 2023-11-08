package jdk.HackerRank.Algorithms;

public class TimeConversion {
    public static void main (String[] args) throws Exception {
        String time1 = "07:05:45PM";
        String time2 = "12:01:00PM";
        String time3 = "12:01:00AM";
        String time4 = "07:01:00AM";
        System.out.println(timeConversion(time4));
    }

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    static String timeConversion(String time) {
        // Write your code here
        String result = "";
        String timeTerm[] = time.split(":");
        int hh = Integer.parseInt(timeTerm[0]);
        String mm = timeTerm[1];
        String ss = timeTerm[2].substring(0,2);
        String AMPM = timeTerm[2].substring(2,4);

        String h = String.valueOf(hh);
        if(AMPM.equals("AM") && hh == 12)
            h = "00";
        else if(AMPM.equals("PM") && hh < 12 )
            h = String.valueOf(12 + hh);
        else if(hh < 10)
            h = "0" + String.valueOf(hh);

        result = h + ":" + mm + ":" + ss;
        return result;
    }
}

/***
 * jdk.HackerRank.Algorithms: TimeConversion
 *
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Example
 *
 *
 * Return '12:01:00'.
 *
 *
 * Return '00:01:00'.
 *
 * Function Description
 *
 * Complete the timeConversion function in the editor below.
 * It should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * string s: a time in  hour format
 * Returns
 *
 * string: the time in  hour format
 * Input Format
 *
 * A single string  that represents a time in -hour clock format (i.e.:  or ).
 *
 * Constraints
 *
 * All input times are valid
 * Sample Input 0
 *
 * 07:05:45PM
 * Sample Output 0
 *
 * 19:05:45
 * */