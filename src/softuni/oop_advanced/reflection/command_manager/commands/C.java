package softuni.oop_advanced.reflection.command_manager.commands;

import softuni.oop_advanced.reflection.command_manager.annotations.Command;
import softuni.oop_advanced.reflection.command_manager.interfaces.Executable;

@Command(value = "c")
public class C implements Executable {
    @Override
    public void execute() {
        System.exit(0);
    }
}
