package pl.sda.rav.Order;

import pl.sda.rav.Vehicle.Vehicle;
import pl.sda.rav.users.User;

public class Order {

    private int id;
    private User customer;
    private Vehicle vehicle;
    private Period period;

    public Order(int id, User customer, Vehicle vehicle, Period period) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
        this.period = period;
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
