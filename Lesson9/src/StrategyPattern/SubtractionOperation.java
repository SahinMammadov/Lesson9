package StrategyPattern;

public class SubtractionOperation implements Operation{
    @Override
    public double execute(int num1, int num2) {
        return num1-num2;
    }
}
