package com.sparta.lh;

import java.util.Scanner;

public class FibonacciCalc
{

    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter which digit in the fibonacci series you would like to see and press enter...");
        int n = myObj.nextInt();
        System.out.println("Digit '" +n+ "' in the Fibonacci series is "+fib(n));
    }

        static int fib(int n)
        {
            if (n == 0 || n == 1)
                return n;
            else if (n<0)
                return 0;
            else return fib(n - 1) + fib(n - 2);
        }

}
