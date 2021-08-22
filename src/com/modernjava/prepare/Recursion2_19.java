package com.modernjava.prepare;

/*
Java Recursion
    Recursion is the technique of making a function call itself.
    This technique provides a way to break complicated problems down into simple problems which are easier to solve.
    Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.
 */

public class Recursion2_19 {

    /*
    Halting Condition
    Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion.
    Infinite recursion is when the function never stops calling itself.
    Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
    In the previous example, the halting condition is when the parameter k becomes 0.
    It is helpful to see a variety of different examples to better understand the concept.
    In this example, the function adds a range of numbers between a start and an end.
    The halting condition for this recursive function is when end is not greater than start:
     */

    public static void main(String[] args) {
        int result2 = sum(5, 10);
        System.out.println(result2);
    }


    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    /*
        // 10 > 5 -> 10 + sum(5, 9)
        // 9 > 5 ->       9 + sum(5, 8)
        // ...
        // 6 > 5 -> 10 + 9 + 8 + 7 + 6 + sum(5, 5)
     */

}
