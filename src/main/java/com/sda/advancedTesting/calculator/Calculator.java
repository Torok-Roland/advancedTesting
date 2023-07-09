package com.sda.advancedTesting.calculator;

import com.sda.advancedTesting.calculator.exceptions.TruncatedResultException;

public class Calculator {
    public double sum(double noOne, double noTwo) {
        return noOne + noTwo;
    }

    public double subtract(double noOne, double noTwo) {
        return noOne - noTwo;
    }

    public double multiply(double noOne, double noTwo) {
        if (noOne > Double.MAX_VALUE / noTwo) {
            throw new TruncatedResultException("Cannot multiply numbers of this size. Result will be truncated" +
                    "(rotunjit in jos)");
        }
        return noOne * noTwo;
    }

    public double divide(double noOne, double noTwo) {
        if (noTwo == 0) {
            throw new IllegalArgumentException("Division by 0 is not supported!");
        }
        return noOne / noTwo;
    }

    public int modulo(int noOne, int noTwo) {
        if (noTwo == 0) {
            throw new IllegalArgumentException("Division by 0 is not supported!");
        }
        return noOne % noTwo;
    }

}
