package org.example.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.OrdersLimitException;

import java.util.Arrays;

// Класс для кухни
public class Kitchen implements IKitchen {

    private static final Logger logger = LogManager.getLogger(Kitchen.class);
    private int ordersCount;
    private int ordersLimit;

    public Kitchen(int ordersLimit) {
        this.ordersLimit = ordersLimit;
    }

    @Override
    public void makeOrder(Order order) throws OrdersLimitException {
        ordersCount++;
        if (ordersCount > ordersLimit) throw new OrdersLimitException();

        System.out.println("Выполняем заказ #" + order.getOrderId() + " для " + order.getCustomerName() + " за " + order.calculateTotalPrice());
        System.out.print("Состав заказа: ");
        order.getDishes().forEach(dish -> System.out.print(dish.name + " "));
        System.out.println();

        for (Dish dish : order.getDishes()) {
            dish.cook();
        }

        System.out.println("Заказ #" + order.getOrderId() + " готов!\n");
    }
}
