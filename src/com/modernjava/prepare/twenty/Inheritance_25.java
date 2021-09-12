package com.modernjava.prepare.twenty;

/*
    Why And When To Use "Inheritance"?
    - It is useful for code reusability: reuse attributes and methods of an existing class
        when you create a new class.

        If you don't want other classes to inherit from a class, use the final keyword:
        final class Vehicle

        動物的例子:
        父類別: 動物 (吃，睡)
        子類別: 各種動物: 鳥、魚、貓、狗

        dog is a kind of animal 子類是某個父類

        繼承是單向的，子類會拿到父類的屬性與方法，但父類不會拿到子類的屬性與方法

 */
public class Inheritance_25 {
    public static void main(String[] args) {
        Car car = new Car(); // Car extends Vehicle
        car.honk(); // 介紹 override
        System.out.println(car.brand);
    }
}
