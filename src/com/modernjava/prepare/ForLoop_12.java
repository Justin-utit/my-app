package com.modernjava.prepare;

public class ForLoop_12 {

    public static void main(String[] args) {
        /*
        When you know exactly how many times you want to loop through a block of code,
        use the for loop instead of a while loop:
         */
        /*
        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
        for (statement 1; statement 2; statement 3) {
          // code block to be executed
        }
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        /*
        For-Each Loop
        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
        for (type variableName : arrayName) {
          // code block to be executed
        }
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
