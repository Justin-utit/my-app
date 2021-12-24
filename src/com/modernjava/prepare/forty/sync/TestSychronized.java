package com.modernjava.prepare.forty.sync;

// 這個例子說明有加 Sychronized 跟沒有加的差別
public class TestSychronized {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            // 如果加了synchronized当前线程取完所有数据后，才会释放锁，输出结果是有序的：
            @Override
            public synchronized void run() {

                for(int i=1; i<4; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1 still alive, " + i);
                }
            }
        });

        new Thread(thread1).start();
        new Thread(thread1).start();
    }
}
