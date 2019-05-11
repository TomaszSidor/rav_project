package pl.sda.rav.order;

import java.util.HashSet;
import java.util.Set;

public class OrdersDao {
    Set <Order> orders = new HashSet<>();

    public OrdersDao(Set<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public boolean isAvailable(Period period, String VIN){
        for (Order order : orders) {
            if (order.getVehicle().VIN.equals(VIN)){
                if (period.isIncluded(order.getPeriod())){
                    return false;
                }
            }
        }

        return true;
    }

}
