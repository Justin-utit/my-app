package com.modernjava.prepare.twenty;

/*
    Why And When To Use "Inheritance"?
    - It is useful for code reusability: reuse attributes and methods of an existing class
        when you create a new class.

        If you don't want other classes to inherit from a class, use the final keyword:
        final class Vehicle
 */
public class Inheritance_25 {
    public static void main(String[] args) {
        Car car = new Car(); // Car extends Vehicle
        car.honk(); // 介紹 override
        System.out.println(car.brand);
    }
}
