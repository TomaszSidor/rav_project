package pl.sda.rav.vehicle;

import java.time.LocalDate;

public class Car extends Vehicle {

    int maxDistance;
    CarBodyType bodyType;


    public Car(String VIN, String name, LocalDate productionDate, int maxDistance, CarBodyType bodyType) {
        super(VIN, name, productionDate);
        this.maxDistance = maxDistance;
        this.bodyType = bodyType;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }
}
