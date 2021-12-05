package com.modernjava.prepare.forty;

/*
    演算法 example 35 -> Search Insert Position
 */

// If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start()
public class Threads_41_1 extends Thread {

    public static void main(String[] args) {
        Threads_41_1 thread = new Threads_41_1();
        thread.start(); // 啟動執行緒
        System.out.println("This code is outside of the thread");
    }

    public void run() {

        System.out.println("This code is running in a thread");
    }

}
