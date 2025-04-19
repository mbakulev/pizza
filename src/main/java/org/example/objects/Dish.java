package org.example.objects;

// Общий класс для всех блюд
public abstract class Dish {
    protected final String name;
    protected final double price;

    protected Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
