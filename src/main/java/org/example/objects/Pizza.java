package org.example.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.PizzaSizeException;

// Общий класс для всех пицц
public abstract class Pizza extends Dish {
    Logger logger = LogManager.getLogger(Pizza.class);

    protected int size;
    protected Pizza(String name, int size, double basePrice) {
        super(name, basePrice);
        try{
            if (size <= 0 || size > 10) throw new PizzaSizeException(size);
            this.size = size;
        } catch (PizzaSizeException exception) {
            logger.error("Нельзя делать пицца размером " + size);
        }
    }
}
