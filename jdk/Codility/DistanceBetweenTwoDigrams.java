package jdk.Codility;

public class DistanceBetweenTwoDigrams {
    public static void main (String[] args) throws Exception {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int inputNumber = Integer.parseInt(bufferedReader.readLine());

//        int inputNumber = 1041;
//        int inputNumber = 15;
        String s = "aakmaakmakda";
//        String s = "codility";
        System.out.println(findDistanceBetweenTwoDigrams(s));

//        bufferedReader.close();
    }

    public static int findDistanceBetweenTwoDigrams(String s) {
        // write your code in Java SE 8
        int max = -1;
        int result = -1;
        int index = 0;
        int length = s.length();
        String digram = "";

        for(int i = 0; i < length/2; i ++ ){
            digram = s.substring(i, i + 2);
            System.out.println("digram:" +  digram);
            index = s.lastIndexOf(digram);
            System.out.println("index:" + index);
            System.out.println("i:" + i);
            if(index > 0 && index != i){
                result = index - i;
                System.out.println("result:" + result);
                if(i == 0)
                    max = result;
                if(max < result)
                    max = result;
            }
        }

        return max;
    }

}

/****
 * Write a function solution that, given two integers A and B,
 * returns the number of integers from the range [A..B]
 * (ends are included) which can be expressed as the product
 * of two consecutive integers, that is X* (X + 1),
 * for some integer X.Examples:1. Given A = 6 and B = 20,
 * the function should return 3. These integers are:
 * 6 =2*3, 12 = 3* 4 and 20 =4*5.2. Given A = 21 and B = 29,
 * the function should return 0. There are no integers of the
 * form X* (X+1) in this interval.Write an efficient algorithm for
 * the following assumptions: A and B are integers within
 * the range [1..1,000,000,000]ASB.
 */