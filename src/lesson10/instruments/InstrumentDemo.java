package lesson10.instruments;
import java.util.Formatter;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(6);
        Instrument drum = new Drum("Big");
        Instrument trumpet = new Trumpet(34.56);

        Instrument instruments [] = {guitar,drum,trumpet};
        for(Instrument instrument : instruments){
            instrument.play();
        }

    }
}
