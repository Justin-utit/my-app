package com.modernjava.prepare.forty.horseracing;

public class HorseExampleInOne extends Thread {
    String myId;
    public HorseExampleInOne(String id) {
        myId = id;
    }
    public void run() { // overwrite Thread's run()
        for (int i=0; i < 500; i++) {
            System.out.println(myId+" Thread");
            try {
                sleep(100);
            } catch (InterruptedException e) {}
        }
    }
    public static void main(String[] argv) {
        Thread t1 = new HorseExampleInOne("T1"); // 產生Thread物件
        Thread t2 = new HorseExampleInOne("T2"); // 產生Thread物件
        t1.start(); // 開始執行t1.run()
        t2.start();
    }
}