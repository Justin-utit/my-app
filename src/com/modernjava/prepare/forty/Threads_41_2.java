package com.modernjava.prepare.forty;

// If the class implements the Runnable interface, the thread can be run by passing an instance of the class
// to a Thread object's constructor and then calling the thread's start()
public class Threads_41_2 implements Runnable {

    public static void main(String[] args) {
        Threads_41_2 obj = new Threads_41_2();
        Thread thread = new Thread(obj);
        thread.start();

        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }

}

/*
    The major difference is that when a class extends the Thread class,
    you cannot extend any other class, but by implementing the Runnable interface,
    it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.
 */