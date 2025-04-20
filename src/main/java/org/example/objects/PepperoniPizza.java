package org.example.objects;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(int size) {
        super("Пепперони", size, 30);
    }

    @Override
    protected double calculatePrice() {
        return basePrice * size;
    }
}
