package pl.sda.rav.vehicle;

import java.time.LocalDate;

public class Amphibian extends Vehicle{

    int maxDistanceKm;
    int MaxDistanceMiles;
    int displacement;


    public Amphibian(String VIN, String name, LocalDate productionDate, int maxDistanceKm, int MaxDistanceMiles, int displacement) {
        super(VIN, name, productionDate);
        this.maxDistanceKm = maxDistanceKm;
        this.MaxDistanceMiles = MaxDistanceMiles;
        this.displacement = displacement;
    }

    public int getMaxDistanceKm() {
        return maxDistanceKm;
    }

    public int getMaxDistanceMiles() {
        return MaxDistanceMiles;
    }

    public int getDisplacement() {
        return displacement;
    }
}
