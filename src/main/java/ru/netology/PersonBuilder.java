package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder Name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder Surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder Age(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Неверный возраст!!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder Address(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .Address(this.address)
                .Surname(this.surname)
                .Age(0);
    }


    public Person build() {
        if ((name == null) || (surname == null)) {
            String message = "Не хватает аргументнов: " + ((name == null) ? " Имя " : "") + "|" + ((surname == null) ? " Фамилия " : "");
            throw new IllegalArgumentException(message);
        }
        return new Person(name, surname, age, address);
    }

}
