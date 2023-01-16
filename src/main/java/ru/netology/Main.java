package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .age(40)
                .name("Иван")
                .surname("Иванов")
                .address("Москва").build();
        System.out.println(person);
        Person smallPerson = person
                .newChildBuilder()
                .name("МиниИван")
                .build();
        System.out.println(smallPerson);
        smallPerson.happyBirthday();
        System.out.println(smallPerson);
        Person person1 = new PersonBuilder()
                .name("Мария")
                .surname("Ивановна")
                .build();
        person1.happyBirthday();
        person1.getAddress();
        try {
            Person person2 = new PersonBuilder().build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            Person person3 = new PersonBuilder()
                    .name("Николай")
                    .surname("николаев")
                    .age(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}