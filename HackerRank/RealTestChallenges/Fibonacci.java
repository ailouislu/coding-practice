package HackerRank.RealTestChallenges;

public class Fibonacci {
    public static void main (String[] args) throws Exception {
        int number = 18;
        printFibonacci(number);

        int number1 = 4181;
        System.out.println(FibonacciChecker(number1));
    }

    static int a = 0, b = 1, n = 0;
    static void printFibonacci(int count) {
        if (count > 0) {
            n = a + b;
            a = b;
            b = n;
            System.out.print(" " + n);
            printFibonacci(count - 1);
        }
    }

    public static String FibonacciChecker(int num) {
        // code goes here
        int a = 0, b = 1, n;
        while(b < num){
            n = a + b;
            a = b;
            b = n;
        }
        if(num == b)
            return "yes";
        else
            return "no";
    }



    public static int fibonacci(int n){
        int fibonacci[] = new int[n + 2];
        int i;

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(i = 2; i <= n; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        return fibonacci[n];
    }

}

/***
 * Fibonacci sequence
 *
 * A Fibonacci sequence is an ordering of numbers where each number
 * is the sum of the preceding two For example, the first ten numbers of
 * the Fibonacci sequence are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
 * The Fibonacci challenge usually goes something like this: write a function
 * that returns the nth entry in the Fibonacci sequence, where n is a number
 * you pass in as argument to the function.
 */