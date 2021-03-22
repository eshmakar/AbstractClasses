package com.test;

public abstract class AbstractClassAnimal {
    String name;
    String sound;
    int weight;

    AbstractClassAnimal(String name, String sound, int weight){
        this.name=name;
        this.sound=sound;
        this.weight=weight;
    }

    abstract void doAnimal();
}
