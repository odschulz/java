package softuni.advanced.strings;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        findKeywords(scanner);
//        stringConcatTimeMeasure(50);
    }

    /**
     * Find keywords in a text.
     *
     * Sample input:
     * ODB Test
     * asdsda lasdlaskd ;askdasd k askdsadk klasdjasjd asdlkjasdas asdkljasdj odb Asdasd odb test ;lasjsajd
     *
     * @param scanner
     *
     */
    public static void findKeywords(Scanner scanner) {
        String[] keywords = scanner.nextLine().split("\\s+");
        String [] textWords = scanner.nextLine().split("\\s+");
        // Use LinkedHashMap to keep keyword order.
        LinkedHashMap<String, Integer> resultMapping = new LinkedHashMap<>();

        for (String keyWord : keywords) {
            resultMapping.put(keyWord, 0);
            for (String textWord : textWords) {
                if (textWord.compareToIgnoreCase(keyWord) == 0) {
                    resultMapping.put(keyWord, resultMapping.get(keyWord) + 1);
                }
            }
        }

        for (String s : resultMapping.keySet()) {
            // %1$-5s pads 5 spaces right, %2$5s pads left.
            System.out.println(String.format("%1$-5s-%2$5s", s, resultMapping.get(s)));
        }
    }

    public static void stringConcatTimeMeasure(int length) {
        String plusString = "";
        String concatString = "";
        String chunk = "1";
        long startTime = System.nanoTime();
        int i = 1;

        startTime = System.nanoTime();
        for (i = 1; i <= length; i++) {
            plusString += chunk;
        }
        System.out.println("PLUS:");
        System.out.println(System.nanoTime() - startTime);

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (i = 1; i <= length; i++) {
            sb.append(chunk);
        }
        System.out.println("Builder:");
        System.out.println(System.nanoTime() - startTime);

        startTime = System.nanoTime();
        for (i = 1; i <= length; i++) {
            concatString = concatString.concat(chunk);
        }
        System.out.println("Concat:");
        System.out.println(System.nanoTime() - startTime);
    }
}
