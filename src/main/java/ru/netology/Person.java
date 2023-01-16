package ru.netology;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private Integer age;
    private String address;

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
            return;
        }
        System.out.println("Возраст неизвестен!");
    }

    public boolean hasAge() {
        return (age != null);
    }

    public boolean hasAddress() {
        return (address != null);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        if (hasAddress()) {
            return address;
        }
        System.out.println("Адресс неизвестен!");
        return null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .address(this.address)
                .surname(this.surname)
                .age(0);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(age, person.age) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
