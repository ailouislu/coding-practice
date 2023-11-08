package jdk.Coderbyte;

public class QuestionsMarks {
    public static void main (String[] args) throws Exception {

//        String s = "aa6?9";
        String s = "arrb6???4xxbl5???eee5";
//        String s = "acc?7??sss?3rr1??????5";
        System.out.println(checkQuestionsMarks(s));
    }

    public static String checkQuestionsMarks(String str) {
        String result = "false";
        str = str.replaceAll("[a-zA-Z]","" );
        System.out.println("str:" + str);
        int index = str.indexOf("???");
        System.out.println("index:" + index);

        if(index > 0){
            int firstNumber = Integer.parseInt(str.substring(index - 1,index));
            int lastNumber = Integer.parseInt(str.substring(index + 3,index+4));
            System.out.println("firstNumber:" + firstNumber);
            System.out.println("lastNumber:" + lastNumber);
            if(firstNumber + lastNumber == 10){
                result = "true";
            }
        }

        return result;
    }

}

/****
 * Questions Marks
 * Have the function QuestionsMarks(str) take the str string parameter,
 * which will contain single digit numbers, letters, and question marks,
 * and check if there are exactly 3 question marks between every pair of two numbers
 * that add up to 10. If so, then your program should return the string true,
 * otherwise it should return the string false. If there aren't any two numbers
 * that add up to 10 in the string, then your program should return false as well.
 *
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should
 * return true because there are exactly 3 question marks between 6 and 4,
 * and 3 question marks between 5 and 5 at the end of the string.
 * Examples
 * Input: "aa6?9"
 * Output: false
 * Input: "acc?7??sss?3rr1??????5"
 * Output: true
 * Tags
 * string manipulationsearchinghash tablefree
 */