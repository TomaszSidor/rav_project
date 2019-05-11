package pl.sda.rav.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.rav.users.UsersSamples;
import pl.sda.rav.vehicle.VehiclesSamples;

import java.time.LocalDate;
import java.util.Set;

class OrdersDaoTest {

    @Test
    void shouldCheckOrderExistence(){
        //given
        OrdersDao ordersDao = new OrdersDao();
        Period period = new Period(LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 20));

        ordersDao.addOrder(new Order(UsersSamples.ADAM, VehiclesSamples.SUN_WIND, period));
        ordersDao.addOrder(new Order(UsersSamples.ADAM, VehiclesSamples.SUN_WIND, period));

        //when
        Set<Order> orders = ordersDao.getOrders();

        //then
        Assertions.assertEquals(1, orders.size());
    }

}