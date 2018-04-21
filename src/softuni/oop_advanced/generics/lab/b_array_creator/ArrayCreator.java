package softuni.oop_advanced.generics.lab.b_array_creator;

import java.lang.reflect.Array;

public class ArrayCreator {
    public static <T> T[] create(int length, T item) {
        // new T[] cannot be compiled so we have to cast.
        T[] arr = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }

        return arr;
    }
    public static <T> T[] create(Class<T> tClass, int length, T item) {
        T[] arr = (T[]) Array.newInstance(tClass, length);

        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }

        return arr;
    }
}
