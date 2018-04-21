package softuni.advanced.stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kids = scanner.nextLine();
        int num = scanner.nextInt();
        hotPotato(kids, num);
    }

    public static void hotPotato(String kids, int num) {
        String[] kidsArr = kids.split("\\s+");
        ArrayDeque<String> kidsQueue = new ArrayDeque<>();
        Collections.addAll(kidsQueue, kidsArr);

        int counter = 1;
        while (kidsQueue.size() > 1) {
            String kid = kidsQueue.remove();
            if (++counter < num) {
                kidsQueue.add(kid);
            } else {
                counter = 1;
            }
        }
        System.out.println(kidsQueue.remove());
    }

    public static String getBinary(int num) {
        if (num == 0) {
            return "0";
        }
        ArrayDeque<Integer> binarySequence = new ArrayDeque<>();
        while (num > 0) {
            binarySequence.add(num % 2);
            num = num / 2;
        }
        return Arrays.toString(binarySequence.toArray());
    }
}
