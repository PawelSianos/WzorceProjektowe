package Wzorce.projektowe.factory.cars;

abstract public class Car {
    private final String engine;
    private final String fuel;
    private final String productionYear;
    private final SteeringWheelPosition position;

    public Car(String engine, String fuel, String productionYear, SteeringWheelPosition position) {
        this.engine = engine;
        this.fuel = fuel;
        this.productionYear = productionYear;
        this.position = position;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
