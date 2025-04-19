package org.example.exceptions;

public class PizzaSizeException extends Throwable {
    public PizzaSizeException(int size) {
        // TODO Заменить на logger
        super("Неправильный размер " + size + " пиццы");
    }
}
