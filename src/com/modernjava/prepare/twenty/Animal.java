package com.modernjava.prepare.twenty;

public class Animal {

    int age;
    String gender;
    int weight;

    public Animal() {
    }

    public Animal(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }
}
