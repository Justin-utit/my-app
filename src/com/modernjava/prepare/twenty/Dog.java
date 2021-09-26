package com.modernjava.prepare.twenty;

public class Dog extends Animal {

    int age;

    public Dog(){

    }

    public Dog(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    String gender;
    int weight;

//    public Dog() {
//        System.out.println();
//    }

    @Override
    public void animalSound() {

        System.out.println("The dog says: bow wow");
    }


}
