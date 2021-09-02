package com.modernjava.prepare;

/*
    Why And When To Use Abstract Classes and Methods?

    An interface is a completely "abstract class" that is used to group related methods with empty bodies:
    To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class
    with the implements keyword (instead of extends).
    The body of the interface method is provided by the "implement" class:

    介面: u expect certain behaviors but u don't care how the behaviors executed
    簡單來說，就是一紙合約，上面寫明了必須完成的功能，簽了這個合約，就必須完成合約上的功能。

    抽象類別: 有一般的方法，也有抽象的方法
    一般方法:
        主要是用來減少重覆的程式碼，例如有10個類別都有一個共通的類別，那麼就把這個共通的類別，提取到父類別即可。
    抽象方法:
        share behavior, but not implementation (如同介面)
    -> 抽象類別-實例.png

 */

// Interface
interface Animal2 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig2 implements Animal2 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Interface_29 {

    public static void main(String[] args) {
        Pig2 myPig = new Pig2();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }

}
