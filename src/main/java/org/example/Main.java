package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.OrdersLimitException;
import org.example.objects.*;


public class Main {
    static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        Customer firstClient = new Customer("Vasya");
        Customer secondClient = new Customer("Petya");

        Order firstOrder = new Order(firstClient);
        Order secondOrder = new Order(secondClient);

        MargaritaPizza bigMargarita = new MargaritaPizza(10);
        MargaritaPizza smallMargarita = new MargaritaPizza(5);

        // Тут будет ошибка размера пиццы
        // PepperoniPizza bigPepperoni = new PepperoniPizza(20);
        PepperoniPizza middlePepperoni = new PepperoniPizza(10);
        PepperoniPizza smallPepperoni = new PepperoniPizza(5);

        firstOrder.addDish(bigMargarita);
        firstOrder.addDish(smallMargarita);

        // secondOrder.addDish(bigPepperoni);
        secondOrder.addDish(middlePepperoni);
        secondOrder.addDish(smallPepperoni);

        firstOrder.approveOrder();
        secondOrder.approveOrder();

        // Максимальное количество закакзов
        int ordersLimit = 1;
        Kitchen kitchen = new Kitchen(ordersLimit);

        try {
            kitchen.makeOrder(firstOrder);
            kitchen.makeOrder(secondOrder);
        } catch (OrdersLimitException e) {
            logger.error("Превышен лимит на заказы");
        }
    }
}