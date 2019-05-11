package pl.sda.rav.Vehicle;

import java.time.LocalDate;

public abstract class Vehicle implements Comparable<Vehicle> {

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

    @Override
    public int compareTo (Vehicle v) {

        if (v == null) {
            return 1;
        }

        if (productionDate.compareTo(v.productionDate) != 0 ) {
            return productionDate.compareTo(v.productionDate);
        }

        return v.getName().compareTo(getName());
    }


}
