package com.test;

public class Cat extends AbstractClassAnimal {

    Cat(String name, String sound, int weight) {
        super(name, sound, weight);
    }

    @Override
    void doAnimal(){
        System.out.printf("Животное %s весит примерно %d кг, издает звук %s\n", name, weight, sound);
        System.out.print("Это животное выполняет действие: ");
        System.out.println("ловить мышей");
    }
}
