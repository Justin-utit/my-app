package com.modernjava.homework;

public class Temp {
    public static void main(String[] args) {
        int[] numbers = { 19, 11, 70, 8, 23 };
        for ( int b = 0; b < numbers.length; b++ ) {
            if (b == 1) {
                continue;
            }
            if (b == 4) {
                break;
            }
            System.out.println(numbers[b]);
        }
    }
}
