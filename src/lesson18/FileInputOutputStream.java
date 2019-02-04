package lesson18;

import java.io.*;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\lesson18\\a.txt");
             InputStream input = new FileInputStream("src\\lesson18\\a.txt");) {
            char[] symbols = {'a', 'b', 'c'};
            for (char symbol : symbols) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }
            int size = input.available();
            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

