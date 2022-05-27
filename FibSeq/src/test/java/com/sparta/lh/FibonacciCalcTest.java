package com.sparta.lh;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class FibonacciCalcTest
{
    @Test
    @DisplayName("Check 5th digit in fib sequence is 5")
    public void checkDigit5is5() {
        int n;
        Assertions.assertEquals(FibonacciCalc.fib(5), n=5);
    }
    @Test
    @DisplayName("Check 0 value returns 0")
    public void check0Returns0() {
        int n;
        Assertions.assertEquals(FibonacciCalc.fib(0), n=0);
    }
    @Test
    @DisplayName("Check negative value returns 0")
    public void checkNegativeReturns0() {
        int n;
        Assertions.assertEquals(FibonacciCalc.fib(0), n=-4);
    }
}
