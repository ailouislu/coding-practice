package HackerRank.RealTestChallenges;

public class Fibonacci {
    public static void main (String[] args) throws Exception {
        int number = 10;
        System.out.println(fibonacci(number));

        System.out.print(1);
        printFibonacci(number);
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

    static int n1 = 0, n2 = 1, n3 = 0;
    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
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