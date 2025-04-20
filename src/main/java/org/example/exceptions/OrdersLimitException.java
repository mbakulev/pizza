package org.example.exceptions;

public class OrdersLimitException extends Exception {
    public OrdersLimitException() {
        super("Превышен лимит на количество заказов");
    }
}
