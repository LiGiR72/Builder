package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder age(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Неверный возраст!!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if ((name == null) || (surname == null)) {
            String message = "Не хватает аргументнов: " + ((name == null) ? " Имя " : "") + "|" + ((surname == null) ? " Фамилия " : "");
            throw new IllegalStateException(message);
        }
        return new Person(name, surname, age, address);
    }

}
