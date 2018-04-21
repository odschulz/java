package practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Runnable r2 = () -> System.out.println("Hello world two!");
        r2.run();
    }

    public static String ReverseString(String str) {
        char[] c = str.toCharArray();
        int len = c.length;
        for (int i = 0; i < len / 2; i++) {
            c[i] = (char) (c[len - 1 - i] + c[i]);
            c[len - 1 - i] = (char) (c[i] - c[len - 1 - i]);
            c[i] = (char) (c[i] - c[len - 1 - i]);
        }
        return new String(c);
    }

    public static void smallestDivisor(int num) {
        int i;
        int count = 1;
        for (i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                System.out.println(i);
                System.out.println(count);
                break;
            }
            count++;
        }

        for (int j = 2; j <= num; j++) {
            if (num % j == 0) {
                System.out.println(num / j);
                System.out.println(j);
                break;
            }
        }
    }

    /**
     * Move bits to the left.
     */
    public static void bitWiseExample() {
        System.out.println("-----------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.println(String.format("%16s", Integer.toBinaryString(1 << i)).replace(" ", "0"));
        }
    }

}
