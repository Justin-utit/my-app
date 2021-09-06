package com.modernjava.homework;

public class HW210830_MethodCalls {
    public static void main(String[] args) {

        int xxx = 10;

        System.out.println("-");
        run();
        System.out.println("--");

        System.out.println("---");
        walk();
        System.out.println("----");

        System.out.println("-----");
        talk();
        System.out.println("------");

        // 介紹 method call stack heap 概念
    }


    public static void run() {
        System.out.println("run");
    }

    public static void walk() {
        System.out.println("walk");
    }

    public static void talk() {
        System.out.println("talk");
    }

}
