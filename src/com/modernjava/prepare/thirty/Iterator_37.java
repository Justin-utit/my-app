package com.modernjava.prepare.thirty;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_37 {
    public static void main(String[] args) {
        /*
        An Iterator is an object that can be used to loop through collections,
        like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
        To use an Iterator, you must import it from the java.util package.
         */
        // Make a collection
        ArrayList<String> cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        while(it.hasNext()) { // Volvo是否有Next?
            System.out.println(it.next()); // Volvo.Next -> BMW
        }

        /*
        (重要) Iterators are designed to easily change the collections that they loop through.
        The remove() method can remove items from a collection while looping.
         */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        // 容器
        // for() -> 跑容器內的東西
        // 使用情境: 如果在跑的過程中，需要去異動容器內的元素時 -> Iterator

        // 使用iterator
//        Iterator<Integer> it2 = numbers.iterator();
//        while(it2.hasNext()) {
//
//            Integer i = it2.next();
////            System.out.println(i);
//            if(i < 10) {
//                it2.remove(); // 8 & 2 removed
//            }
//        }
//        System.out.println(numbers);

        /* (重要)
        Note: Trying to remove items using a for loop or a for-each loop would not work correctly
        because the collection is changing size at the same time that the code is trying to loop.
         */

        // 這個直接例外錯誤
//        numbers.clear();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(2);
//        numbers.add(23);
//        // 使用for loop / for each
//        for(Integer i : numbers){
//            if(i<10){
//                numbers.remove(i);
//            }
//        }
//        System.out.println(numbers);

        // 這個是資料會錯亂
        numbers.clear();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        for(int i = 0; i<numbers.size(); i++){
            if(numbers.get(i)<10){
                numbers.remove(i); // 跑for loop 的過程中，若有新增/刪除元素等，改變size的動作，就用 Iterator
            }
        }
        System.out.println(numbers);


        /* 重要
        Note: Trying to remove items using a for loop or a for-each loop would not work correctly
        because the collection is changing size at the same time that the code is trying to loop.
         */


    }
}
