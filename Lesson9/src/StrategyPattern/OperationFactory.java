package StrategyPattern;

public class OperationFactory {
    public Operation createOperation(String operationType){
        if(operationType==null){
            return null;
        }if(operationType.equalsIgnoreCase("ADD")){
            return new AdditionOperation();
        } else if (operationType.equalsIgnoreCase("SUBTRACT")){
            return new SubtractionOperation();
        } else if (operationType.equalsIgnoreCase("MULTIPLY")){
            return new MultiplicationOperation();
        } else if (operationType.equalsIgnoreCase("DIVIDE")){
            return new DivideOperation();
        }
        return null;
    }
}
