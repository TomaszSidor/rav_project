package pl.sda.rav.vehicle;

import java.time.LocalDate;

public abstract class Vehicle {

    public String VIN;
    public String name;
    public  LocalDate productionDate;

    public Vehicle(String VIN, String name, LocalDate productionDate) {
        this.VIN = VIN;
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getVIN() {
        return VIN;
    }

    public String getName() {
        return name;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }
}
