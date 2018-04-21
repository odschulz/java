package softuni.oop_advanced.enums;

import softuni.oop_advanced.enums.weekdays.Test;

public class Main {
    public static void main(String[] args) {

        // Get toString.
        System.out.println(Season.SPRING);
        // Get index.
        System.out.println(Season.SUMMER.ordinal());
        System.out.println(Season.SUMMER.getMaxTemp());

        System.out.println(Test.AA);
    }
}
