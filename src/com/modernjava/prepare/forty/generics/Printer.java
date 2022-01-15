package com.modernjava.prepare.forty.generics;

public class Printer <T,V>{ //T stands for Type      extends Animal
    T thingstoprint;
    V things2print;

    public Printer(T thingstoprint){

        this.thingstoprint = thingstoprint;
    }

    public void print(){
//        thingstoprint.eat();
        System.out.println(thingstoprint);
    }
}
