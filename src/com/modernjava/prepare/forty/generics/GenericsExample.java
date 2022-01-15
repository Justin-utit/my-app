package com.modernjava.prepare.forty.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        // (一) generic classes
//        IntegerPrinter printer = new IntegerPrinter(23);
//        printer.print();
//
//        DoublePrinter printer2 = new DoublePrinter(23.3);
//        printer2.print();

        // StringPrinter same thing
        // Car, Cat...
//        Printer<Integer> printer1 = new Printer<>(24); // tells java i want a printer for integer
//        printer1.print();


        // 現在，有了這個泛型的printer，其他兩個就可以刪掉了

        // 注意只能放wrapper class, 不能用原始資料型態

        // 不知不覺在使用的泛型 ArrayList<>
        ArrayList<Cat> list = new ArrayList<>(); // 這個就只能放Cat 不能放Dog或任何Cat以外的型別
        list.add(new Cat());

        // Object 所有類別的父類別

        // 不能使用Object的理由，type safety
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(new Cat()); // index 0
        list2.add(new Dog()); // index 1

        // 1 程式碼較醜
        // 2 錯誤在執行時期才會發現
//        Dog dog = (Dog) list2.get(0); // Object
        Cat cat = (Cat) list2.get(0);
        // what if adding Dog?
        System.out.println();


        // (二) bounded generic classes
        // 讓Print 可以接受的Type 更加的明確(或說加一個限制): Printer <T extends Animals> -> makes T some types of animal
//        Printer<Cat> printer1 = new Printer<>(new Cat());
//        printer1.print();

        // Printer <T extends Animals> 這裡的Animals 是類別，不過也可以換成介面 (例外: 可以用extends的介面)
        // Printer <T extends Animals & Serializable & 介面 & 介面> 規則是 只能有一個類別，且須放在最前面，其餘的是介面，可以有多個，用& 分隔

        // 以上是泛型類別的部分，
        // (三) 泛型方法
        printAgain(1);
        printAgain("ok");
        printAgain(new Cat());


        // (四) wild card

        // collection 集合 -> 可以放多個 物件/東西 的容器

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        printList(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("str");
        printList(list4);

        // Java 三大原則
        // 1 Java is simple -> bullshit
        // 2 萬般皆物件
        // 3 要什麼給什麼 (v)

    }

    /*
        Object 是所有類別的父類別

        List<Integer> & List<String> 並不是 List<Object> 的子類別 (看是否有extends這個關鍵字)
     */

    // wild card -> ? 未知 (x factor)
    private static void printList(List<?> list){ // 而不是 List<Object> 因為 List<Integer> 並不是其子類別，因此才需要wildcard
        System.out.println(list);
    }
    /* ? extends Animal -> ? is a kind of Animal
       T extends Animal -> T is a kind of Animal */
    // bounded (加限制) wild card
    private static void printList2(List<? extends Animal> list){ // wild card也可以加入限制
        System.out.println(list);
    }




    /*
        method signature 方法的簽名 = 名稱本身 + 傳入參數 + 回傳型態
        對Java來說，上述的元素，只要有一個不一樣，就是不同的方法
     */

    // 如何告訴Java這個T代表泛型? 在回傳型態前加入<T>即可
    // T 不一定只能寫T，可以寫任何東西，但程式是大家一起看的，所以還是儘可能follow convention
//    private static void printAgain(String things){
//        System.out.println(things + "!!!");
//    }

    private static <T> void printAgain(T things){
        System.out.println(things + "!!!");
    }

    // 多個參數 & return type 也泛型的寫法 (原void)
    private static <T,T2> T2 printAgainAgain(T things, T2 things2){ // 如何告訴Java這個T代表泛型? 在回傳型態前加入<T>即可
        System.out.println(things + "!!!");
        System.out.println(things2 + "!");
        return things2;
    }
    // 類別也可以用多個參數，寫法同上


}













