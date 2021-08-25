package com.modernjava.prepare;

public class MethodParams_16 {
    // try View > Appearance > Enter Presentation Mode

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);

        System.out.println(myMethod(3));

        System.out.println(myMethod(5, 3));

        checkAge(20); // Call the checkAge method and pass along an age of 20
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod(int x) {
        return 5 + x;
    }

    static int myMethod(int x, int y) {
        return x + y;
    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }
}
