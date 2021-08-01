package com.modernjava.beginner;

public class 區域實體靜態變數 {
    int 實體變數; // 實體變數
    static int 靜態變數 = 2; // 靜態變數
//    int num;

//    int num3;
//    static int num3;


    // 靜態方法
    public static void main(String[] args) {
        int num3 = 3; // 區域變數
//        System.out.println(num3); // 只能在該方法內被存取
    }
    // 一般方法
    public void 一般方法1(){
        // 可以存取 實體變數 與靜態變數
        System.out.println(實體變數);
        System.out.println(靜態變數);
        // 可以呼叫 一般方法 與靜態方法
        一般方法2();
        靜態方法1();
    }
    public void 一般方法2(){
    }
    // 靜態方法
    public static void 靜態方法1(){

        // 只可以存取 靜態變數
        System.out.println(靜態變數); // 靜態變數
//        System.out.println(num); // 拿不到 實體變數

        // 只可以呼叫 靜態方法
        靜態方法2();
//        一般方法1();
    }

    public static void 靜態方法2(){
    }






}
