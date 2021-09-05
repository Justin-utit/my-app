package com.modernjava.prepare.ten;

public class ForLoop_12 {

    public static void main(String[] args) {
        /*

        while(condition){ // true or false 用於不確定執行次數時
            // execution
        }

        (重要) When you know exactly how many times you want to loop through a block of code,
        use the for loop instead of a while loop:
         */
        /*
        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        (重要) Statement 3 is executed (every time) after the code block has been executed.


        for (statement 1; statement 2; statement 3) {
          // code block to be executed
        }

         */

//        int j = 1; // statement
//        boolean x = j < 5;
//        j++;

        // int i = 0; // 給初值
        // i < 5; // 條件判斷 true / false
        // i++ // executed (every time) after the code block has been executed.


        for (int i = 0; i < 5; i++) { // 知道執行次數時使用
            System.out.println(i); // 0 1 2 …
        }

        // 印出 3 - 11

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
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "55555"}; // 字串的集合

        for (String i : cars) {
            // String i = "Ford";
            System.out.println(i);
        }
    }
}













