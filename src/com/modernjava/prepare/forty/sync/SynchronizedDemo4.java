package com.modernjava.prepare.forty.sync;

// 這個例子說明 实现同步是要很大的系统开销作为代价的，甚至可能造成死锁，所以尽量避免无谓的同步控制。
public class SynchronizedDemo4 {


    public void synMethod_a() {
        for(int i=0; i<1000000; i++) ;
    }
    // 鎖整個方法
    public synchronized void synMethod_b() {
        for(int i=0; i<1000000; i++) ;
    }


    public void synBlock_a() {
            for(int i=0; i<1000000; i++) ;
    }
    // 鎖方法內的某個區塊
    public void synBlock_b() {
        synchronized( this ) {
            for(int i=0; i<1000000; i++) ;
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo4 demo = new SynchronizedDemo4();

        long start, diff;
//        start = System.currentTimeMillis();                // 获取当前时间(millis)
//        demo.synMethod_a();                                // 调用“synchronized方法”
//        diff = System.currentTimeMillis() - start;        // 获取“时间差值”
//        System.out.println("synMethod_a() : "+ diff);
//
//
//        start = System.currentTimeMillis();                // 获取当前时间(millis)
//        demo.synMethod_b();                                // 调用“synchronized方法”
//        diff = System.currentTimeMillis() - start;        // 获取“时间差值”
//        System.out.println("synMethod_b() : "+ diff);


        start = System.currentTimeMillis();                // 获取当前时间(millis)
        demo.synBlock_a();                                // 调用“synchronized方法块”
        diff = System.currentTimeMillis() - start;        // 获取“时间差值”
        System.out.println("synBlock_a()  : "+ diff);

        start = System.currentTimeMillis();                // 获取当前时间(millis)
        demo.synBlock_b();                                // 调用“synchronized方法块”
        diff = System.currentTimeMillis() - start;        // 获取“时间差值”
        System.out.println("synBlock_b()  : "+ diff);
    }
}
