package сom.company.vehicles;

import сom.company.details.Engine;
import сom.company.professions.Driver;

public class Car {
    private String Brand, carClass;
    private int weight;
    Driver driver;
    Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        Brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = "Dodge Charger";
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = "D class";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = 2000;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Let's go!");
    }

    public void stop() {
        System.out.println("Breaking");
    }

    public void turnRight() {
        System.out.println("Turning right");
    }

    public void turnLeft() {
        System.out.println("Turning left");
    }

    public void printInfo() {
        System.out.println("The " + getBrand() + " " + getCarClass() + " sedan " + " it has weight " + getWeight() + "kilograms");
        System.out.println("Driven by " + driver.getFistLastName() + " with " + driver.getDrivingSkill() + " years of driving skill");
        System.out.println("Engine manufacturer: " + engine.getManufacturer() + " Engine has " + engine.getPower() + " horsepowers");
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Nikita Dekar", 3);
        Driver driver1 = new Driver("Ivan Petrov", 25);
        Engine engine = new Engine("Mazda Diesel", 136);
        Engine engine1 = new Engine("ZMZ", 105);
        Car car = new Car("Mazda 6", "D class", 1420, driver, engine);
        Lorry gazelle = new Lorry("Gazelle", "Truck", 2000, driver1, engine1, 3500);
        ((Car) car).printInfo();
        System.out.println(" ");
        System.out.println("Lorry: " + gazelle.getBrand() + " " + gazelle.getCarClass() + " with self weight:" + gazelle.getWeight() + " and with load capacity:" + gazelle.getLoadCapacity());

        System.out.println("Driven by " + driver1.getFistLastName() + " with " + driver1.getDrivingSkill() + "years of driving skill");
    }
}

