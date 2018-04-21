package softuni.advanced.stream_api;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Map scanner input to int list.
        List<Integer> a = Stream.of(scanner.nextLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        // Example of chaining.
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 10, 10, 22, 14);
        numbers.stream()
                .distinct()
                .filter(x -> x >= 10 && x <= 20)
                .limit(2)
                .forEach(System.out::println);

        Stream<Integer> numStream = numbers.stream();
        Optional<Integer> numberExists = numStream
                .filter(n -> n == 40)
                .findFirst();

        if (numberExists.isPresent()) {
            System.out.println("Num is present");
        } else {
            System.out.println("Num not present");
        }

        System.out.println(numbers.stream().mapToInt(Integer::valueOf).average());


        Arrays.asList("a", "sdf", "")
                .stream()
                .filter(s -> !s.isEmpty())
                // .peak() is an intermediary function which
                // doesnt close the stream and lets you see the result
                // .peak(System.out::println)
                .forEach(System.out::println);
    }
}
