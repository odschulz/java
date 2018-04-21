package softuni.oop_advanced.dependency_inversion.p01_system_resources;

import softuni.oop_advanced.dependency_inversion.p01_system_resources.interfaces.Writer;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTimeProvider time = new LocalTimeProvider(LocalTime.now());
        Writer writer = new ConsoleWriter();
        GreetingClock clock = new GreetingClock(time, writer);

        clock.greeting();
    }

}
