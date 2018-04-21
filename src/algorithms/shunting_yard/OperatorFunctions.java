package algorithms.shunting_yard;

import java.util.function.BiFunction;

public class OperatorFunctions {
    public static Double calculate(Double left, Double right, Operator operator) {
        // @todo Use BigDecimal.
        BiFunction<Double, Double, Double> operatorFunction = null;
        switch (operator) {
            case ADD:
                operatorFunction = (leftArg, rightArg) -> left + right;
                break;

            case SUBTRACT:
                operatorFunction = (leftArg, rightArg) -> left - right;
                break;

            case MULTIPLY:
                operatorFunction = (leftArg, rightArg) -> left * right;
                break;

            case DIVIDE:
                operatorFunction = (leftArg, rightArg) -> left / right;
                break;

            case POWER:
                operatorFunction = (leftArg, rightArg) -> Math.pow(left, right);
                break;

            default:
                throw new IllegalArgumentException("Unsupported operator provided.");
        }

        return operatorFunction.apply(left, right);
    }
}
