package com.modernjava.prepare.forty.horseracing;

public class Horse extends Thread{
    //覆寫Thread方法run()
    public void run(){ // 獨立需完成的任務
        //由1跑到5000
        int h = 0;
        for (int i=0; i<1000; i++){
            h++;
            System.out.println(getName()+":"+h);
            try {
                Thread.sleep(800); // 暫停0.8秒
            } catch (InterruptedException e) {}
        }
    }
}
