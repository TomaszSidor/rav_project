package pl.sda.rav.order;

import pl.sda.rav.vehicle.Vehicle;
import pl.sda.rav.users.User;

public class Order {

    private static int COUNT = 1;

    private int id;
    private User customer;
    private Vehicle vehicle;
    private Period period;

    public Order(int id, User customer, Vehicle vehicle, Period period) {
        this.id = COUNT;
        this.customer = customer;
        this.vehicle = vehicle;
        this.period = period;
        COUNT++;

    }

    public int getId() {
        return id;
    }

    public User getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Period getPeriod() {
        return period;
    }
}
