package com.modernjava.prepare.one;

public class Circle {

    double radius;

    static int numberOfCircles;

    Circle(){
        numberOfCircles++;
    }

    public static int getNumberOfCircles(){
        return numberOfCircles;
    }
}
