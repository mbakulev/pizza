package org.example.objects;

import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int ordersCount = 0;
    private Client client;
    private List<Dish> dishes;
    private int orderId;

    public Order(Client client) {
        this.client = client;
        this.dishes = new ArrayList<>();
        ordersCount++;
        orderId = ordersCount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public String getCustomerName() {
        return this.client.getName();
    }

    protected double calculateTotalPrice() {
        double totalPrice = 0;
        for (Dish dish : dishes) {
            totalPrice += dish.calculatePrice();
        }
        System.out.println("Итоговая цена заказа " + orderId + " : " + totalPrice);

        return totalPrice;
    }

    public void approveOrder() {
        calculateTotalPrice();
    }
}
