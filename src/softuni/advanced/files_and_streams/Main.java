package softuni.advanced.files_and_streams;

import java.io.*;

public class Main {
    public static final String FILE_DIR = "files";

    public static void main(String[] args) {
        readFileBytes("test.txt");
    }

    public static void readFileBytes(String fileName) {
        String path = System.getProperty("user.dir")
                .concat(File.separator)
                .concat(FILE_DIR)
                .concat(File.separator)
                .concat(fileName);
        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.print(oneByte);
                oneByte = in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
