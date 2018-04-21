package algorithms.shunting_yard;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
//        String expression = "1 + ( 2 * 3 - 1 ) - 2";
        String expression = "9 + 24 / ( 7 - 3 )";
        ShuntingYard alg = new ShuntingYard(expression);

        System.out.println(expression);
        for (String s : alg.getReversedPolishNotation()) {
            System.out.print(s + " ");
        }

        System.out.println("");
        System.out.println(alg.calculate());
    }
}
