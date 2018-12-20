package сom.company.vehicles;

import сom.company.details.Engine;
import сom.company.professions.Driver;

public class Lorry extends Car {
    private int loadCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public Lorry(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public Lorry() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int printLoad(){
        return loadCapacity;
    }
}
