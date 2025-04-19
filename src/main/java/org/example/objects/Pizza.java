package org.example.objects;

import org.example.exceptions.PizzaSizeException;

// Общий класс для всех пицц
public abstract class Pizza extends Dish {
    protected int size;
    protected Pizza(String name, int size, double price) {
        super(name, price);
        try{
            if (size <=0 || size >= 10) throw new PizzaSizeException(size);
            this.size = size;
        } catch (PizzaSizeException exception) {
            // TODO Заменить на logger
            System.out.println("Ошибка размера пиццы");
        }
    }
}
