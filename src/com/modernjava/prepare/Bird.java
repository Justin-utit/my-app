package com.modernjava.prepare;
// 物件 = 東西
// 鳥 class 類別 -> 設計圖/ 藍圖
// 鳥 object 物件
// 鳥 attributes 屬性(特徵) e.g. 羽毛的顏色=red, mouse length=3cm, 腳的長短=1cm 、叫聲高低
// 鳥 methods 方法(行為) e.g. 捕食、下蛋、飛

// For classes, you can use either public or default
public class Bird {

    // attribute: public > protected, default, private
    String color; // 屬性

    // method: public > protected, default, private
    // 任何類別可以呼叫
    public void fly(){ // 方法
        // 實作 飛 這個行為
        System.out.println("birds fly");
    }

    // 範圍: 本類別限定
    void fly1(){ // 方法
        // 實作 飛 這個行為
        System.out.println("birds fly");
    }



}
