package com.modernjava.prepare.forty.horseracing;

public class HorseExampleInOne extends Thread {

    String myId;
    public HorseExampleInOne(String id) {
        myId = id;
    }
    // 500 * 0.1 = 50秒
    public void run() { // overwrite Thread's run()
        for (int i=0; i < 500; i++) { // 0 - 499
            System.out.println(myId+" Thread");
            try {
                sleep(100); // 1000毫秒 = 1秒
            } catch (InterruptedException e) {}
        }
        someMethod();
    }
    public static void main(String[] argv) { // 程式進入點

        System.out.println(1);

        Thread t1 = new HorseExampleInOne("T1"); // 產生Thread物件
        Thread t2 = new HorseExampleInOne("T2"); // 產生Thread物件
        t1.start(); // 開始執行t1.run()
        t2.start();

        System.out.println(2);
    }

    public static void someMethod(){

        System.out.println(3);

    }
}