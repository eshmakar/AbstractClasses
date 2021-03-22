package com.test;

public class DogOvcharka {
    Dog ovcharka = new Dog("Овчарка", "гав-гав", 15, "охрана") {
        @Override
        void doAnimal() {
            System.out.println("Это овчарка");
        }
    };
}
