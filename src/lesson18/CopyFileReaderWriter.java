package lesson18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyFileReaderWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("src\\lesson18\\copiedA.txt");
             FileReader fileReader = new FileReader("src\\lesson18\\a.txt")) {
            char[] symbols = new char[50];
            int size = fileReader.read(symbols);
            System.out.println(Arrays.toString(symbols));
            fileWriter.write(symbols);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
