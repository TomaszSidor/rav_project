package pl.sda.rav.vehicle;

import java.time.LocalDate;

public class VehiclesSamples {
    public static Vehicle SUN_WIND = new MotorBoat("moto-123", "SUN-WIND-2000", LocalDate.of(2019,1,1), 1000, 5);
    public static Vehicle AUDI = new Car("3581321", "S8", LocalDate.of(2010,5,11), 1200, CarBodyType.hatchback);
    public static Vehicle FORD = new Car("600882", "FOCUS", LocalDate.of(2011,4,8), 800, CarBodyType.sedan);
    public static Vehicle BMW = new Car("43327635", "E30", LocalDate.of(2007,11,1), 1000, CarBodyType.combi);
    public static Vehicle MERCEDES = new Car("271365273", "W211", LocalDate.of(2011,11,30), 740, CarBodyType.cabrio);
    public static Vehicle T1000 = new Amphibian("271365273", "W211", LocalDate.of(2011,11,30), 200, 300, 40);

}
