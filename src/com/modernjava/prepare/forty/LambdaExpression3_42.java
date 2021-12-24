package com.modernjava.prepare.forty;

/*
    To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type.
    Calling the interface's method will run the lambda expression:
 */

// single-method interface
interface StringFunction {
    String run(String str);
}

public class LambdaExpression3_42 {
    public static void main(String[] args) {
        // A lambda expression is a short block of code which takes in parameters and returns a value.
        // 把Lambda Expression封裝成一個變數
        StringFunction exclaim = (s) -> { return s + "!"; };
//        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
//        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
