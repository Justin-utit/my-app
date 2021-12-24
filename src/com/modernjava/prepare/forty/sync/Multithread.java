package com.modernjava.prepare.forty.sync;

// Java code for thread creation by extending
// the Thread class
// 這個例子 說明 每一個執行緒，跑自己獨立的run()
class MultithreadingDemo extends Thread {


    public void run() {
        for(int i=1; i<4; i++) {
            System.out.println(getName() + " still alive, " + i);
        }

    }
}

// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object = new MultithreadingDemo();

            object.start();
        }
    }
}

