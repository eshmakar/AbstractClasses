package com.test;

public abstract class Dog extends AbstractClassAnimal {
    String works;

    Dog(String name, String sound, int weight, String works) {
        super(name, sound, weight);
        this.works = works;


        System.out.printf("Животное %s весит примерно %d кг, издает звук %s\n", name, weight, sound);
        System.out.printf("Это животное выполняет действие: %s\n\n", works);
    }
}
