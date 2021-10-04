package com.modernjava.prepare.twenty;

public class AnonymousInnerClass_Driver {
    public static void main(String[] args) {

        AnonymousInnerClass aic = new AnonymousInnerClass();
        aic.print();

        /*
        所以匿名內部類別的作用是，針對某一個特定物件，進行行為上的改變(method override)
        由於這個行為的改變，是在程式執行時(run time)，只發生一次(or才會發生)，
        所以不用再額外開一個類別，來override意欲改變的方法
         */
        AnonymousInnerClass aic2 = new AnonymousInnerClass(){
            @Override
            public void print() {
                System.out.println("aic2's override");
            }
        };
        // 當場改變物件行為的寫法 (內部匿名類別)
        aic2.print();


        // 當場改變物件行為的寫法 (內部匿名類別)
        Object obj = new Object() {
            public String toString() {
                return "匿名類別物件";
            }
        };
        System.out.println(obj.toString());

    }
}
