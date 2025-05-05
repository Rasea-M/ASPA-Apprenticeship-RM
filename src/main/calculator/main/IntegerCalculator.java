package main.calculator.main;

import java.util.Arrays;

public class IntegerCalculator implements Calculator<Integer> {
    @Override
    public Integer sum(Integer... number) throws IllegalArgumentException {
        return Arrays.stream(number).mapToInt(x -> x).sum();
    }

    @Override
    public Integer subtract(Integer... number) throws IllegalArgumentException {
        return Arrays.stream(number).mapToInt(x -> x).reduce((a, b) -> a - b ).orElse(0);
    }

    @Override
    public Integer multiply(Integer... number) throws IllegalArgumentException {
        return Arrays.stream(number).mapToInt(x -> x).reduce((a, b) -> a * b).orElse(0);
    }

    @Override
    public Integer divide(Integer dividend, Integer divisor) throws IllegalArgumentException {
        try {
            return dividend/divisor;
        } catch (ArithmeticException | NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }
}
