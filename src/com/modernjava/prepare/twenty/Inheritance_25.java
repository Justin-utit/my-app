package com.modernjava.prepare.twenty;
/*
    Java物件導向 有三個大觀念，這三大觀察念的主要目的，是讓程式更加的有序、乾淨(減少重複)、有邏輯
    1 封裝
    2 繼承 <--
    3 多型
    介面 與 抽象類別 也是在強化相同的目的，不過這個下次再說

    Why And When To Use "Inheritance"?
    - It is useful for code reusability: reuse attributes and methods of an existing class
        when you create a new class.

        If you don't want other classes to inherit from a class, use the final keyword:
        final class Vehicle

        動物的例子:
        父類別: 動物 (吃，睡) 眼睛的型狀
        子類別: 各種動物: 鳥、魚、貓、狗  @Override 覆寫

        dog is a kind of animal 子類是某個父類
        car is a kind of vehicle

        // 父 (方法) -> 消除重複
        // a1 a2 ... a99


        繼承是單向的，子類會拿到父類的屬性與方法，但父類不會拿到子類的屬性與方法

 */
public class Inheritance_25 {
    public static void main(String[] args) {
        Car car = new Car(); // Car extends Vehicle
        car.honk(); // 介紹 override
        System.out.println(car.brand);




    }
}
