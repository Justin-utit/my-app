package com.modernjava.prepare.twenty;

/*

    Java物件導向 有三個大觀念，這三大觀察念的主要目的，是讓程式更加的有序、乾淨(減少重複)、有邏輯
    1 封裝
    2 繼承
    3 多型 <--

    Polymorphism means "many forms", and it occurs when we have many classes
    that are related to each other by inheritance.

    Like we specified in the previous chapter;
    (重要) Inheritance lets us inherit attributes and methods from another class.
    Polymorphism uses those methods to perform different tasks.
    This allows us to perform a single action in different ways.

    For example, think of a superclass called Animal that has a method called animalSound().
    Subclasses of Animals could be Pigs, Cats, Dogs, Birds -
    And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
 */
public class Polymorphism_26 {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object

        Animal myPig = new BlackPig();  // Create a Pig object



        // Animal myDog = new Dog();  // Create a Dog object

        /*

            1000行程式

            myDog
            pig方法、變數

        pig方法、變數
        myDog


        pig方法、變數

        myDog

         */

//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();

        // 為什麼加@Override?
        // 多型的實務情境
    }

}






