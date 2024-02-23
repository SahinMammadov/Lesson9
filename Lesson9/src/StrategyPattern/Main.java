package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationFactory();

        Operation additionOperation = operationFactory.createOperation("ADD");
        Operation subtractionOperation = operationFactory.createOperation("SUBTRACT");
        Operation multiplicationOperation = operationFactory.createOperation("MULTIPLY");
        Operation divideOperation = operationFactory.createOperation("DIVIDE");

        System.out.println(additionOperation.execute(5, 3));
        System.out.println(subtractionOperation.execute(10, 4));
        System.out.println(multiplicationOperation.execute(6, 8));
        System.out.println(divideOperation.execute(40, 2));
    }
}
