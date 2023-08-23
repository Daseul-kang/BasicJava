package chapter11.confirm;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.text");
            fw.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {}
        }
    }
}
