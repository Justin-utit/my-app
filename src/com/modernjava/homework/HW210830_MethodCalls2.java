package com.modernjava.homework;

public class HW210830_MethodCalls2 {

    // 介紹 method call stack & heap 概念

    public static void main(String[] args) {

        doWork();


//        Car car1 = new Car(); // myCar1 = 物件的地址
//        Car car2 = new Car();

//        car1.hp = 100;
//        car2.hp = 200;
//
//        Engine engine = new Engine();
//        car2.engine = engine;

    }

    public static void doWork() {
        doMore();
    }

    public static void doMore() {
    }

}
