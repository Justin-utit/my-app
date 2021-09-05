package com.modernjava.homework;

import com.modernjava.prepare.twenty.Car;
import com.modernjava.prepare.Engine;

public class HW210830_MethodCalls2 {

    public static void main(String[] args) {

        System.out.println("-");
        doWork();
        System.out.println("--");

        // 介紹 method call stack & heap 概念
        Car myCar = new Car();
        System.out.println();
        myCar = new Car();
        System.out.println();
        Engine engine = new Engine();
    }


    public static void doWork() {
        System.out.println("doWork");
        doMore();
    }

    public static void doMore() {
        System.out.println("doMore");
    }


}
