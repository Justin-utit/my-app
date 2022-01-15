package com.modernjava.prepare.forty.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        // (一) generic classes
        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();

        DoublePrinter printer2 = new DoublePrinter(23.3);
        printer2.print();

        // StringPrinter same thing
        // Car, Cat...
//        Printer<Double> printer1 = new Printer<>(24.3); // tells java i want a printer for integer
//        printer1.print();

        // 現在，有了這個泛型的printer，其他兩個就可以刪掉了

        // 注意只能放wrapper class, 不能用原始資料型態

        // 不知不覺在使用的泛型 ArrayList<>
//        ArrayList<Cat> cats = new ArrayList<>(); // 這個就只能放Cat 不能放Dog或任何Cat以外的型別

        // 不能使用Object的理由，type safety
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Cat());
        Cat cat = (Cat) list.get(0);
        // what if adding Dog?


        // (二) bounded generic classes
        // 讓Print 可以接受的Type 更加的明確(或說加一個限制): Printer <T extends Animals> -> makes T some types of animal
//        Printer<Cat> printer1 = new Printer<>(new Cat());
//        printer1.print();

        // Printer <T extends Animals> 這裡的Animals 是類別，不過也可以換成介面 (例外: 可以用extends的介面)
        // Printer <T extends Animals & Serializable> 規則是 只能有一個類別，且須放在最前面，其餘的是介面，可以有多個，用& 分隔

        // 以上是泛型類別的部分，
        // (三) 泛型方法
        printAgain(1);
        printAgain("ok");
        printAgain(new Cat());

        // (四) wild card
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        printList(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("str");
        printList(list3);

    }

    // 如何告訴Java這個T代表泛型? 在回傳型態前加入<T>即可
    // T 不一定只能寫T，可以寫任何東西，但程式是大家一起看的，所以還是儘可能follow convention
    private static <T> void printAgain(T things){
        System.out.println(things + "!!!");
    }

    // 多個參數 & return type 也泛型的寫法 (原void)
    private static <T,T2> T printAgainAgain(T things, T2 things2){ // 如何告訴Java這個T代表泛型? 在回傳型態前加入<T>即可
        System.out.println(things + "!!!");
        System.out.println(things2 + "!");
        return things;
    }
    // 類別也可以用多個參數，寫法同上

    // wild card -> ?
    private static void printList(List<?> list){ // 而不是 List<Object> 因為 List<Integer> 並不是其子類別，因此才需要wildcard
        System.out.println(list);
    }

    // bounded wild card
    private static void printList2(List<? extends Animal> list){ // wild card也可以加入限制

        System.out.println(list);
    }
}













