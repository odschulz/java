package algorithms.shunting_yard;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ShuntingYard {
    private String input;
    private ArrayDeque<String> reversedPolishNotation;
    private Map<String, Operator> operatorMap;

    public ShuntingYard(String input) {
        this.input = input;
        this.operatorMap = new HashMap<>();
        for (Operator operator : Operator.values()) {
            this.operatorMap.put(operator.getSymbol(), operator);
        }

        this.reversedPolishNotation = null;
    }

    public double calculate() {
        ArrayDeque<String> rpn = this.getReversedPolishNotation();
        ArrayDeque<Double> resultStack = new ArrayDeque<>();

        for (String token : rpn) {
            if (this.isNumeric(token)) {
                resultStack.push(Double.valueOf(token));
            } else {
                Double right = resultStack.pop();
                Double left = resultStack.pop();
                resultStack.push(OperatorFunctions.calculate(left, right, this.operatorMap.get(token)));
            }
        }

        // @todo Validate if not more than one.
        return resultStack.pop();
    }

    /**
     * Build a queue of reversed Polish notation tokens.
     *
     * @return a queue implementation of the ordered tokens.
     */
    public ArrayDeque<String> getReversedPolishNotation() {
        if (this.reversedPolishNotation != null) {
            return this.reversedPolishNotation;
        }

        String[] inputArr = this.input.split("\\s+");
        ArrayDeque<String> tokensQueue = new ArrayDeque<>();
        ArrayDeque<Operator> operatorsStack = new ArrayDeque<>();
        for (String token : inputArr) {
            if (this.isNumeric(token)) {
                tokensQueue.add(token);
            } else if (this.operatorMap.containsKey(token)) {
                Operator op = this.operatorMap.get(token);
                int precedence = op.getPrecedence();

                // We always push left brackets.
                if (op == Operator.LEFT_BRACKET || operatorsStack.isEmpty()) {
                    operatorsStack.push(op);
                    continue;
                }

                // We have to pop everything until we match the left bracket.
                if (op == Operator.RIGHT_BRACKET) {
                    findMatchingBracket:
                    while (!operatorsStack.isEmpty()) {
                        Operator poppedOperator = operatorsStack.pop();
                        if (poppedOperator == Operator.LEFT_BRACKET) {
                            break findMatchingBracket;
                        }

                        tokensQueue.add(poppedOperator.getSymbol());
                    }
                    continue;
                }

                Operator topOperator = operatorsStack.peek();
                if (topOperator.getPrecedence() < precedence) {
                    operatorsStack.push(op);
                    continue;
                }

                tokensQueue.add(operatorsStack.pop().getSymbol());

                if (operatorsStack.isEmpty()) {
                    operatorsStack.push(op);
                    continue;
                } else {
                    removeOperators:
                    while (!operatorsStack.isEmpty()) {
                        if (operatorsStack.peek().getPrecedence() < precedence) {
                            operatorsStack.push(op);
                            break removeOperators;
                        }
                        tokensQueue.add(operatorsStack.pop().getSymbol());
                    }
                }
            } else {
                throw new IllegalArgumentException("Illegal character in input: " + token);
            }
        }

        // Get all remaining operators to the result queue.
        while (!operatorsStack.isEmpty()) {
            Operator poppedOp = operatorsStack.pop();
            if (poppedOp == Operator.LEFT_BRACKET) {
                throw new IllegalArgumentException("Left bracket is never closed.");
            }

            tokensQueue.add(poppedOp.getSymbol());
        }

        this.reversedPolishNotation = tokensQueue;
        return tokensQueue.clone();
    }

    private boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException e) {
            return false;
        }

        return true;
    }
}
