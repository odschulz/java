package softuni.oop_advanced.annotations.coding_tracker;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Tracker {

    @Author(name = "Pesho")
    public static void main(String[] args) {
        printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Pesho")
    static void printMethodsByAuthor(Class<?> cl) {
        Method[] methods = cl.getDeclaredMethods();
        Map<String, ArrayList<String>> mappedMethods = new HashMap<>();
        for (Method method : methods) {
            Author annotation = method.getDeclaredAnnotation(Author.class);
            if (annotation != null) {
                String author = annotation.name();
                String methodName = method.getName() + "()";
                mappedMethods.putIfAbsent(author, new ArrayList<>());
                mappedMethods.get(author).add(methodName);
            }
        }

        for (Map.Entry<String, ArrayList<String>> stringArrayListEntry : mappedMethods.entrySet()) {
            String joinedMethods = String.join(", ", stringArrayListEntry.getValue());
            System.out.println(stringArrayListEntry.getKey() + ": " + joinedMethods);
        }
    }
}
