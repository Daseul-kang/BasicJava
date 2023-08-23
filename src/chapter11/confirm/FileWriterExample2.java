package chapter11.confirm;

import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.text")){
            fw.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
