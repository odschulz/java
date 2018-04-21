package softuni.oop_advanced.reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class reflClass = Reflection.class;
        System.out.println(reflClass);
        System.out.println(reflClass.getSuperclass());
        Class[] interfaces = reflClass.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        // Get an instance with an empty argument list.
        Reflection instance = (Reflection) reflClass.newInstance();
        System.out.println(instance);

        // Get specific constructor.
        // getDeclaredConstructor() returns ctors with all modifiers, but
        // trying to instantiate a non-public will throw exception.
        // getConstructor() gets only public.
        Constructor ctor = Reflection.class.getDeclaredConstructor(String.class, String.class, String.class);

        Field privateRefField = reflClass.getDeclaredField("zip");
        // Set access for private field.
        privateRefField.setAccessible(true);
        Object privateRefFieldValue = privateRefField.get(new Reflection());
        System.out.println("private field val: " +  privateRefFieldValue);

        getPrefixedMethods(reflClass, "get");
    }

    public static void getPrefixedMethods(Class refClass, String prefix) {
        Arrays.stream(refClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith(prefix))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(method.getName() + " will return " + method.getReturnType()));
    }
}
