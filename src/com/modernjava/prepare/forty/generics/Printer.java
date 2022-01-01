package com.modernjava.prepare.forty.generics;

public class Printer <T>{
    T thingstoprint;

    public Printer(T thingstoprint){
        this.thingstoprint = thingstoprint;
    }

    public void print(){
        System.out.println(thingstoprint);
    }
}
