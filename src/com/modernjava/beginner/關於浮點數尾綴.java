package com.modernjava.beginner;

/*
參考來源:
https://blog.csdn.net/FX677588/article/details/52663805
 */

public class 關於浮點數尾綴 {
    public static void main(String[] args) {

        // long 請用大寫L 避免與數字1 混淆
        long lNum  = 1234L;
        float fNum = 1.23f;
        double dNum = 1.23;

        // 這個寫浮點數不給f會報錯，是因為 當你 直接給浮點數1.2, Java會預設認定為double，所以當宣告的型態是float時，就會報錯了。
        // float a = 1.2;  // 報錯

        float b = 1.2f; // 正確

    }
}
