package com.modernjava.prepare.twenty;
/*
    Abstract Classes and Methods
    (重要) Data abstraction is the process of hiding certain details and showing only essential information to the user.
    Abstraction can be achieved with either abstract classes or interfaces
    (which you will learn more about in the next chapter).

    The abstract keyword is a non-access modifier, used for classes and methods:

    Abstract class: is a restricted class that cannot be used to create objects
    (to access it, it must be inherited from another class).

    Abstract method: can only be used in an abstract class, and it does not have a body.
    (重要) The body is provided by the subclass (inherited from).

    An abstract class can have both abstract and regular methods:
 */

// Abstract class
abstract class Animal1 {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig1 extends Animal1 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Abstraction_28 {
    public static void main(String[] args) {
        Pig1 myPig = new Pig1(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
