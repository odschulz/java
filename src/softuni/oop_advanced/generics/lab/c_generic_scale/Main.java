package softuni.oop_advanced.generics.lab.c_generic_scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(1, 2);
        System.out.println(scale.getHeavier());
        Scale<String> scale2 = new Scale<>("ab", "ab");
        System.out.println(scale2.getHeavier());
    }
}
