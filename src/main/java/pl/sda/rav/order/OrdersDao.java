package pl.sda.rav.order;

import java.util.HashSet;
import java.util.Set;

public class OrdersDao {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        if(isAvailable(order.getPeriod(), order.getVehicle().getVIN())) {
            orders.add(order);
        }
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

    public Set<Order> getOrders() {
        return orders;
    }
}
