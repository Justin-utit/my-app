package com.modernjava.prepare.twenty;

public class Animal {


    public void animalSound() {

        System.out.println("The animal makes a sound");
    }









    // 屬性
    int age;
    String gender;
    int weight;

    // 方法
    public void eat() {

        System.out.println("Animal eat");
    }

    public void sleep() {

        System.out.println("Animal sleep");
    }



    public Animal() {
    }

    public Animal(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

}
