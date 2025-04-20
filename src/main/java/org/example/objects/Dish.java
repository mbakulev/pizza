package org.example.objects;

// Общий класс для всех блюд
public abstract class Dish implements ICookable {
    protected final String name;
    // Базовая цена на блюдо
    protected double basePrice;

    protected Dish(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    public void cook() {
        System.out.println("Готовится " + name);
    }

    protected abstract double calculatePrice();
}
