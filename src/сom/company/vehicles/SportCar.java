package сom.company.vehicles;

import сom.company.details.Engine;
import сom.company.professions.Driver;

public class SportCar extends Car {
    private int speedLimit;

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, int speedLimit) {
        super(brand, carClass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    public SportCar(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public SportCar() {
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
