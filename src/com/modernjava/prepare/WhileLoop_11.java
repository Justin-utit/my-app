package com.modernjava.prepare;

public class WhileLoop_11 {
    public static void main(String[] args) {
        /*
        Loops
        Loops can execute a block of code as long as a specified condition is reached.
        Loops are handy because they save time, reduce errors, and they make code more readable.
         */

        /*
        Java While Loop
        The while loop loops through a block of code as long as a specified condition is true:

        while (condition) {
            // code block to be executed
        }
        */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        /*
        The Do/While Loop
        The do/while loop is a variant of the while loop.
        This loop will execute the code block once, before checking if the condition is true,
        then it will repeat the loop as long as the condition is true.

        do {
          // code block to be executed
        }
        while (condition);
         */

        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        }
        while (i2 < 5);


    }
}
