package org.example.objects;

public class MargaritaPizza extends Pizza {
    public MargaritaPizza(int size) {
        super("Маргарита", size, 20);
    }

    @Override
    protected double calculatePrice() {
        return 10 + basePrice * size;
    }
}
