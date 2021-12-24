package com.modernjava.prepare.forty.sync;

/*
    演算法 example 35 -> Search Insert Position
 */
class MyClass {
    private static int i;

    public static int getAndIncr() {
        return i++;
    }

    public static int getI(){
        return i;
    }
}
// If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start()
public class Threads_sync extends Thread {

    public static void main(String[] args) {
        Threads_sync thread = new Threads_sync();
        thread.start(); // 啟動執行緒
        System.out.println("This code is outside of the thread");
        MyClass myClass = new MyClass();
        for(int i = 0; i<1000; i++){
            myClass.getAndIncr();
            System.out.println("main: "+myClass.getI());
        }

    }

    public void run() {
        System.out.println("This code is running in a thread");
        MyClass myClass = new MyClass();
        for(int i = 0; i<1000; i++){
            myClass.getAndIncr();
            System.out.println("run: "+myClass.getI());
        }

    }

}
