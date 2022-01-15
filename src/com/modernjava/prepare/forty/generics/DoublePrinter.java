package com.modernjava.prepare.forty.generics;

public class DoublePrinter {
    Double aDouble;

    public DoublePrinter(Double integer){

        this.aDouble = integer;
    }

    public void print(){

        System.out.println(aDouble);
    }
}
