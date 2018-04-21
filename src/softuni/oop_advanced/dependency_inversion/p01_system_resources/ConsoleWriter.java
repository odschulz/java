package softuni.oop_advanced.dependency_inversion.p01_system_resources;

import softuni.oop_advanced.dependency_inversion.p01_system_resources.interfaces.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
