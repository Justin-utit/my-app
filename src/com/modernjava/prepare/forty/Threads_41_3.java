package com.modernjava.prepare.forty;

// If the class implements the Runnable interface, the thread can be run by passing an instance of the class
// to a Thread object's constructor and then calling the thread's start()
public class Threads_41_3 implements Runnable
{
    public static void main(String[] args) {
        Thread guruThread1 = new Thread("Guru1");
        Thread guruThread2 = new Thread("Guru2");
        guruThread1.start();
        guruThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(guruThread1.getName());
        System.out.println(guruThread2.getName());

        // java 8
        new Thread(() -> {
            System.out.println("hello thread");
        }).start();
    }

    /*
    Advantages of multithread:
        The users are not blocked because threads are independent, and we can perform multiple operations at times
        As such the threads are independent, the other threads won’t get affected if one thread meets an exception.
     */

    @Override
    public void run() {
    }

    /*
    使用時機
    https://popcornylu.gitbooks.io/java_multithread/content/thread.html
    以賽馬為例
    https://litotom.com/java-thread-runnable/

    https://programming.im.ncnu.edu.tw/J_Chapter9.htm
     */
}