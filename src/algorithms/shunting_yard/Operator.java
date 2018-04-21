package algorithms.shunting_yard;

public enum Operator {
    LEFT_BRACKET(0, "("),
    ADD(1, "+"),
    SUBTRACT(1, "-"),
    MULTIPLY(2, "*"),
    DIVIDE(2, "/"),
    POWER(3, "^"),
    RIGHT_BRACKET(10, ")");

    private final int precedence;
    private final String symbol;

    private Operator(int precedence, String symbol) {
        this.precedence = precedence;
        this.symbol = symbol;
    }

    public int getPrecedence() {
        return this.precedence;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
