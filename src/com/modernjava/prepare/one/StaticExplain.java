package com.modernjava.prepare.one;

public class StaticExplain {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        // 用類別呼叫 靜態變數跟靜態方法
        System.out.println(Circle.numberOfCircles);
        System.out.println(Circle.getNumberOfCircles());

        // 用物件呼叫 靜態變數跟靜態方法
        System.out.println(c1.numberOfCircles);
        System.out.println(c1.getNumberOfCircles());

        // 變數共享的證明
        c1.numberOfCircles = 10;
        System.out.println(c2.numberOfCircles);
    }
}
