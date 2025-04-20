package org.example.objects;

import org.example.exceptions.OrdersLimitException;

public interface IKitchen {
    void makeOrder(Order order) throws OrdersLimitException;
}
