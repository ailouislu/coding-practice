package jdk.HackerRank.RealTestChallenges;

public class Fibonacci {
    public static void main (String[] args) throws Exception {
        int numbers = 18;
        printFibonacci(numbers);
        System.out.println();

        int number = 4181;
        System.out.println(FibonacciChecker(number));
        int number0 = 4181;
        System.out.println(FibonacciChecker(number0));
        int number1 = 4181;
        System.out.println(FibonacciChecker1(number1));
        int number11 = 4181;
        System.out.println(FibonacciChecker1(number11));
        int number2 = 4181;
        System.out.println(FibonacciChecker2(number2));
        int number22 = 4181;
        System.out.println(FibonacciChecker2(number22));
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
        if(num == 0)
            return "yes";
        if(num < 0)
            return "no";
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

    public static int firstNumber = 0;
    public static int secondNumber = 1;
    //Get the next fibonacci number
    public static int getNextFibonacci(){
        int nextFibonacci = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextFibonacci;
        return nextFibonacci;
    }

    public static int getNextFibonacci1(){
        int nextFibonacci = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextFibonacci;
        return nextFibonacci;
    }

    public static String FibonacciChecker1(int num) {
        // code goes here
        String isFibonacci = "no";

        if(num < 0) {
            isFibonacci = "no";
        }
        if(num == 0) {
            isFibonacci = "yes";
        }

        for(int i=0; i<num; i++){
            int nextFibonacci = getNextFibonacci();
            if(nextFibonacci==num){
                isFibonacci = "yes";
                break;
            }

            if(nextFibonacci < num){
                continue;
            }

            isFibonacci = "no";
            break;
        }

        return isFibonacci;
    }

    public static String FibonacciChecker2(int num) {
        // code goes here
        String result;
        boolean isFibonacci = isPerfectSquare(5*num*num + 4) || isPerfectSquare(5*num*num - 4);
        if (isFibonacci) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }

    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s*s == x;
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