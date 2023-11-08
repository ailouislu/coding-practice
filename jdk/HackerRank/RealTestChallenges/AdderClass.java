package jdk.HackerRank.RealTestChallenges;

import java.util.Scanner;

abstract class Calculator {
    abstract int add(int a, int b);
}

/*
 Write the Adder class here. Do not use an access modifier at the beginning of your class declaration.
 */

class Adder extends Calculator{
    public int add(int a, int b){
        return a + b;
    }
}

public class AdderClass {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}

/***
 * 1. The Adder ClassThere are different kinds of calculators which are available in the market for different purposes. Sam wants to make a calculator which can return the sum of two integers.Implement the Adder class which should follow the following:It should inherit from the Calculator class.should implementhe method add(int a, int ) which should calculate ano return the sum of two integer barameters, a and b.The locked stub code in the editor consists of the following:An abstract class named Calculator which contains an abstract method, add (int a, int b).A solution class which creates an object of the.Adder classreads the inputs and passes them in a method.called by the object of the Adder class.
 */