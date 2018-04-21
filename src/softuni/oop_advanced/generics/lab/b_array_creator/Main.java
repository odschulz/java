package softuni.oop_advanced.generics.lab.b_array_creator;

public class Main {
    public static void main(String[] args) {
        /**
         * Generic cannot do the following:
         * @code
         * obj instanceof T;
         * T[] array = new T[1];
         * T newInstance = new T();
         * Class cl = T.class;
         *
         */
        String[] a = ArrayCreator.create(5, "asdf");
        String[] b = ArrayCreator.create(String.class,5, "asdf");
    }
}
