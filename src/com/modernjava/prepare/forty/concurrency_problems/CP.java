package com.modernjava.prepare.forty.concurrency_problems;

public class CP extends Thread{
/*
    Concurrency Problems
    Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run.
    兩個執行緒同時對某個變數讀寫時，該變數的值會變得不可預測
    When the threads and main program are reading and writing the same variables, the values are unpredictable.
    The problems that result from this are called concurrency problems.
 */
    public static int amount = 0;

    public static void main(String[] args) {
        CP thread = new CP();
        thread.start();

        System.out.println(amount);

        amount++;

        System.out.println(amount);
    }

    public void run() {

        amount++;
    }
}
