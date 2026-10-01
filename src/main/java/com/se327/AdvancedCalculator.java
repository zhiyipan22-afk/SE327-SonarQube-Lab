package com.se327;

public class AdvancedCalculator extends Calculator {

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public int absolute(int value) {
        if (value < 0) {
            return -value;
        }
        return value;
    }
}
