package com.modernjava.prepare.forty.concurrency_problems;

public class CP2 extends Thread{
/*
    To avoid concurrency problems, it is best to share as few attributes between threads as possible.
    If attributes need to be shared, one possible solution is to use the isAlive() method of the thread
    to check whether the thread has finished running before using any attributes that the thread can change.

    Use isAlive() to prevent concurrency problems:
 */
    public static int amount = 0;

    public static void main(String[] args) {
        CP2 thread = new CP2();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
        System.out.println("extra thread: " + amount);
    }
}
