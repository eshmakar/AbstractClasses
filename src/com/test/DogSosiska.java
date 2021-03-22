package com.test;

public class DogSosiska {
    Dog sosiska = new Dog("Сосиска", "эу-эу", 2, "успакаивает") {
        @Override
        void doAnimal() {
            System.out.println("Это сосиска");
        }
    };
}
