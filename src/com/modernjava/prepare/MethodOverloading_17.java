package com.modernjava.prepare;

public class MethodOverloading_17 {

    // Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
    // 參數的型態不同或參數的數量不同即可形成overload, 但若只有回傳型態不同，則不行

    public static void main(String[] args) {
        // With method overloading, multiple methods can have the same name with different parameters:
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

//        plusMethodInt(8, 5);
//        plusMethodDouble(4.3, 6.26);
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    /*
        Instead of defining two methods that should do the same thing, it is better to overload one.
        In the example below, we overload the plusMethod method to work for both int and double:
     */
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // 參數的型態不同或參數的數量不同即可形成overload, 但若只有回傳型態不同，則不行
    int myMethod(int x){
        return 0;
    }
    int myMethod(double x){
        return 0;
    }
}
