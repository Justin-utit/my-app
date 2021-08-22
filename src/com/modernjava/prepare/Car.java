package com.modernjava.prepare;

public class Car {

    // 出廠設定
    public Car(){
        // color = "blue";
    }

    public Car(int speed, int cc, String color){
        // color = "blue";
        this.cc = cc;
        this.speed = speed;
        this.color = color;
    }

    // model
    // manufacturer
    // year of manufacture
    String color;
    int speed;

    int cc;
    // final int cc = 1500;

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
