package softuni.oop_advanced.reflection.command_manager;

import softuni.oop_advanced.reflection.command_manager.annotations.Command;
import softuni.oop_advanced.reflection.command_manager.interfaces.Executable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
        Package mainPckg = Main.class.getPackage();
        String commandsPackage = mainPckg.getName() + "." + "commands";
        String commandsPackagePath = commandsPackage.replace('.', '/');
        File[] files = new File("src/" + commandsPackagePath).listFiles();
        if (files != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map<String, Executable> commandsPool = new HashMap<>();
            for (File file : files) {
                String className = commandsPackage
                        + "."
                        +  file.getName().replace(".java", "");
                Class commandClass = Class.forName(className);
                if (commandClass.isAnnotationPresent(Command.class)) {
                    Command annotation = (Command) commandClass.getDeclaredAnnotation(Command.class);
                    Executable exec = (Executable) commandClass.newInstance();
                    commandsPool.put(annotation.value(), exec);
                }
            }
            while (true) {
                String commandString = reader.readLine();
                if (commandsPool.containsKey(commandString)) {
                    commandsPool.get(commandString).execute();
                } else {
                    System.out.println("Command not found. Available commands are: ");
                    for (String s : commandsPool.keySet()) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}
