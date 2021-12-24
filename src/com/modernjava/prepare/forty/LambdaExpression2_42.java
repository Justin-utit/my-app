package com.modernjava.prepare.forty;

import java.util.ArrayList;
import java.util.function.Consumer;

/*
    這支程式主要在示範這件事情: 把Lambda Expression封裝成一個變數 (條件是: 若該變數的型態是一個只有一個方法的介面)
    那為什麼要? 把Lambda Expression封裝成一個變數? 因為可以把方法，傳給其他方法使用。
    Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.

    The lambda expression should have the same number of parameters and the same return type as that method.
    Java has many of these kinds of interfaces built in,
    such as the Consumer interface (found in the java.util package) used by lists.
 */
public class LambdaExpression2_42 {
    public static void main(String[] args) {
        // Use Java's Consumer interface to store a lambda expression in a variable:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }
}
