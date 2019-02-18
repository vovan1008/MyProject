package serialisation;

import java.io.*;

public class SerializeHorse {
    private static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Halter halter = new Halter(3);
        Horse horse = new Horse("name", "brown", halter);
        serialize(horse);
        Horse desHorse = deserialize();

        System.out.println(horse.equals(desHorse));
    }

    public static void serialize(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Horse deserialize() {
        Horse horse = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return horse;
    }
}
