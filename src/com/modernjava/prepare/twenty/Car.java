package com.modernjava.prepare.twenty;

import com.modernjava.prepare.Engine;

public class Car extends Vehicle {

    public int hp;
    public Engine engine;

    // model
    // manufacturer
    // year of manufacture
    public String color; // instance variable 實體變數
    int speed;
    int cc;

    // final int cc = 1500;

    // 出廠設定
    public Car(){
        // color = "blue";
    }

//    @Override
//    public void honk() {
//        System.out.println("Tuut, tuut! tuut");
//    }

    public Car(int speed, int cc, String color){
        // color = "blue";
        this.cc = cc;
        this.speed = speed;
        this.color = color;
    }

    public void smartPilot(){
        System.out.println("do smart pilot");
    }

     void getColor(){
        System.out.println(color);
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

}
