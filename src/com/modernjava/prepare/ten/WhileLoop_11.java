package com.modernjava.prepare.ten;

public class WhileLoop_11 {
    /*
    1 循序
    2 條件判斷
    3 迴圈 <--
    */
    public static void main(String[] args) {

        /*
        Loops
        Loops can execute a block of code as long as a specified condition is reached.
        Loops are handy because they save time, reduce errors, and they make code more readable.
         */

        /*
        Java While Loop
        The while loop loops through a block of code as long as a specified condition is true:

        while (condition) { // 條件
            // code block to be executed
        }
        */
        int i = 0;
        while (i < 5) { // 0 1 2 3 4
            System.out.println("1"); // 0 1 …
            i++; // 2
        }
        System.out.println();

        /*
        The Do/While Loop
        The do/while loop is a variant of the while loop.
        This loop will execute the code block once, before checking if the condition is true,
        then it will repeat the loop as long as the condition is true.

        while (condition) { // 條件
            // code block to be executed
        }

        do {
          // code block to be executed
        }
        while (condition);
         */

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);
        System.out.println();



    }
}
