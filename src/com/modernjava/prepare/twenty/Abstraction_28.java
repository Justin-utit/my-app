package com.modernjava.prepare.twenty;
/*
    Abstract Classes and Methods
    (重要) Data abstraction is the process of hiding certain details and showing only essential information to the user.
    Abstraction can be achieved with either abstract classes or interfaces 抽象化，可以透過抽象類別與介面做到
    (which you will learn more about in the next chapter).

    The abstract keyword is a non-access modifier, used for classes and methods:
    (access modifier: e.g. private, public, protected...)

    Abstract class: is a restricted class that cannot be used to create objects
    (to access it, it must be inherited from another class). 抽象類別，不能被new，要用的話，要透過使用另一個class繼承

    Abstract method: can only be used in an abstract class, and it does not have a body.
    (重要) The body is provided by the subclass (inherited from).

    An abstract class can have both abstract and regular methods:
 */



// Abstract class (抽象類別: 可以照字面意思理解為，比較模糊的，沒那麼清楚明確定義的類別)
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

    @Override
    public void animalSound() {
        System.out.println("豬叫聲");
    }
}

// Subclass (inherit from Animal)
class Dog1 extends Animal1 {

    @Override
    public void animalSound() {
        System.out.println("狗叫聲");
    }
}

public class Abstraction_28 {
    public static void main(String[] args) {
        Pig1 myPig1 = new Pig1(); // Create a Pig object
        myPig1.animalSound();
        myPig1.sleep();


        Animal1 dog1 = new Dog1();
        dog1.animalSound();
        dog1.sleep();
    }
}
