package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try( FileInputStream fileIn = new FileInputStream("src\\lesson18\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\lesson18\\copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        }
    }

