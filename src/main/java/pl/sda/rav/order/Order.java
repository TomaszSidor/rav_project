package pl.sda.rav.order;

import pl.sda.rav.vehicle.Vehicle;
import pl.sda.rav.users.User;

public class Order {
    private static int COUNT = 1;

    private int id;
    private User customer;
    private Vehicle vehicle;
    private Period period;

    public Order(User customer, Vehicle vehicle, Period period) {
        this.id = COUNT++;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id == order.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
