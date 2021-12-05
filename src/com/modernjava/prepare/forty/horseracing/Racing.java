package com.modernjava.prepare.forty.horseracing;

public class Racing {

    public static void main(String[] args) {
        int h1 = 0; // 馬1

        //產生Horse物件並啟動執行緒
        Horse h2 = new Horse();
        h2.start();

        Horse h3 = new Horse();
        h3.start();

        for (int i=0; i<1000; i++){
            h1++;
            System.out.println("Main Thread (h1):"+h1);
            try {
                Thread.sleep(800); // 暫停0.8秒
            } catch (InterruptedException e) {}
        }
    }
}
