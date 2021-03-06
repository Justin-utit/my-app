package com.modernjava.prepare.thirty;

import java.util.HashSet;

public class HashSet_36 {
    /*
    A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

     */
    public static void main(String[] args) {
        // Create a HashSet object called cars that will store strings:
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // 重複的元素(項目)，會自動消除
        cars.add("Mazda");
        System.out.println(cars);
        // Note: In the example above, even though BMW is added twice it only appears once in the set
        // because every item in a set has to be unique.

        // To check whether an item exists in a HashSet, use the contains() method:
        cars.contains("Mazda");

        // To remove an item, use the remove() method:
        cars.remove("Volvo");

        // To remove all items, use the clear() method:
        cars.clear();

        // To find out how many items there are, use the size method:
        cars.size();

        /*
            Loop Through a HashSet
            Loop through the items of an HashSet with a for-each loop:
         */
        for (String i : cars) {
            System.out.println(i);
        }

        /*
        Other Types
        Items in an HashSet are actually objects.
        In the examples above, we created items (objects) of type "String".
        Remember that a String in Java is an object (not a primitive type).
        To use other types, such as int, you must specify an equivalent wrapper class: Integer.
        For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
         */
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(7);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
