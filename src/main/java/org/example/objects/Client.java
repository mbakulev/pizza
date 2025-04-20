package org.example.objects;

// Общий класс клиентов
public abstract class Client {
    private final String name;

    public Client(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
