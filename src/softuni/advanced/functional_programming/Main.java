package softuni.advanced.functional_programming;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;
import java.util.stream.IntStream;

/**
 * Consumer<T>
 *  Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional generics, {@code Consumer} is expected
 * to operate via side-effects.
 *
 * Supplier<T>
 * Represents a supplier of results.
 *
 * Predicate<T>
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * UnaryOperator<T>
 * Represents an operation on a single operand that produces a result of the
 * same type as its operand.  This is a specialization of {@code Function} for
 * the case where the operand and result are of the same type.
 *
 * BiFunction<T, U, R>
 * Represents a function that accepts two arguments and produces a result.
 */


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        IntStream range = IntStream.range(0, 10);
        IntStream.range(0, 10).forEach(num -> {
            numbers.add(num);
        });

        Function<Integer, Boolean> isEven = n -> n % 2 == 0;

        // Sort desc with lambda.
        numbers.sort((a, b) -> b.compareTo(a));

        // Remove evens.
        numbers.removeIf(num -> num % 2 == 0);
//
//        numbers.forEach(num -> System.out.println(num));

        Consumer<String> printer = message -> System.out.println(message);
        Supplier<Integer> dice = () -> (new Random()).nextInt(12 - 2) + 1;
        Supplier<Integer> dice2 = () -> ThreadLocalRandom.current().nextInt(2, 12);
        printer.accept(dice.get().toString());
        printer.accept(dice2.get().toString());
    }
}
