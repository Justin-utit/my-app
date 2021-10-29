package com.modernjava.prepare.thirty;

// https://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html?utm_source=dlvr.it&utm_medium=facebook#axzz75ITxRK3H

/*
        An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

        (重要) To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
        Note that they should be in uppercase letters:

        Enum is short for "enumerations", which means "specifically listed".
 */

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums_30 {

    // You can also have an enum inside a class:
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static int num = 0;
    public static final double PI = 3.1415967;

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        String[] strArr = new String[7];
        strArr[0] = "MONDAY";

        // 因為它是變數
//        num = 10;

        // Enums are often used in switch statements to check for corresponding values:
        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        System.out.println("-----------");
        // The enum type has a values() method, which returns an array of all enum constants.
        // This method is useful when you want to loop through the constants of an enum:
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
    }
}

/*
    Difference between Enums and Classes

    An enum can, just like a class, have attributes and methods.
    (重要) The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
    (因此，enum也可以理解為常數的容器)

    An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

    Why And When To Use Enums? 主要的用途就是拿來放那裡 不會變動的常數(像是星期一到星期日之類的東西)
    Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
 */
















