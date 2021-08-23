package com.modernjava.prepare;

/*
    Java - What is OOP?
        OOP stands for Object-Oriented Programming.
        object-oriented programming is about creating objects that contain both data and methods.
        Classes and objects are the two main aspects of object-oriented programming.
        a class is a template for objects, and an object is an instance of a class.
        When the individual objects are created, they inherit all the variables and methods from the class.

    類別 class
    物件 objects
    屬性 attributes
    方法 methods
    Everything in Java is associated with classes and objects, along with its attributes and methods.

    For example: in real life, a car is an object.
    The car has attributes, such as weight and color,
    and methods, such as drive and brake.
    A Class is like an object constructor, or a "blueprint" for creating objects.

    https://www.toyota.com.tw/showroom/ALTIS/
    類別 class        -> 車的藍圖
    物件 objects      -> 車
    屬性 attributes   -> 藍曜灰 檀木黑 雲河灰… 排氣量、最大馬力、平均油耗…
    方法 methods      -> 智慧駕駛、自主充電…
    用macbook為例練習。

    The dot (.) is used to access the object's attributes and methods.
    To call a method in Java, write the method name followed by a set of parentheses ()

    Like we specified in the Classes chapter,
    it is a good practice to create an object of a class and access it in another class.

    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created.
    It can be used to set initial values for object attributes:
    the constructor is called when the object is created.
    All classes have constructors by default: if you do not create a class constructor yourself,
    Java creates one for you.
    Constructors can also take parameters, which is used to initialize attributes.
    You can have as many parameters as you want:

    // checklist:
    know how to create objects
    know how to access variables
    know how to create methods

 */

public class CarDriver_20 {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "blue";

        car1.getColor();
        car2.getColor();

        car2.color = "yellow";
        car2.getColor();

        // Static vs. Non-Static
        // Static methods can be called without creating objects
        Car.myStaticMethod();

        System.out.println();
    }

}