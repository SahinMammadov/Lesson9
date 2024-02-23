package StrategyPattern;

public class MultiplicationOperation implements Operation{

    @Override
    public double execute(int num1, int num2) {
        return num1*num2;
    }
}
