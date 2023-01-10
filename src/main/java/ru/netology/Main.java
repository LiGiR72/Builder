package ru.netology;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .Age(40)
                .Name("Иван")
                .Surname("Иванов")
                .Address("Москва").build();
        System.out.println(person);
        Person smallPerson = personBuilder
                .newChildBuilder()
                .Name("МиниИван")
                .build();
        System.out.println(smallPerson);
        smallPerson.happyBirthday();
        System.out.println(smallPerson);
        Person person1 = new PersonBuilder()
                .Name("Мария")
                .Surname("Ивановна")
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
                    .Name("Николай")
                    .Surname("николаев")
                    .Age(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}