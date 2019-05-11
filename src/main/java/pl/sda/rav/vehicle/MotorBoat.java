package pl.sda.rav.vehicle;

import java.time.LocalDate;

public class MotorBoat extends Vehicle{


    int MaxDistance;
    int displacement;


    public MotorBoat(String VIN, String name, LocalDate productionDate, int MaxDistance, int displacement) {
        super(VIN, name, productionDate);
        this.MaxDistance =  MaxDistance;
        this.displacement = displacement;
    }

    public int getMaxDistance() {
        return MaxDistance;
    }

    public int getDisplacement() {
        return displacement;
    }
}
