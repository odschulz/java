package softuni.oop_advanced.reflection.command_manager.commands;

import softuni.oop_advanced.reflection.command_manager.annotations.Command;
import softuni.oop_advanced.reflection.command_manager.interfaces.Executable;

@Command(value = "b")
public class B implements Executable {

    @Override
    public void execute() {
        System.out.println("b");
    }
}
