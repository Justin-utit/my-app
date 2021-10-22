package com.modernjava.prepare.thirty;

import java.util.LinkedList;
/*
    When To Use
    Use an ArrayList for storing and accessing data, 如果要大量查詢用
    and LinkedList to manipulate data. 如果經常需要插入用
 */
public class LinkedList_34 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
    /*
        addFirst()	Adds an item to the beginning of the list.
        addLast()	Add an item to the end of the list
        removeFirst()	Remove an item from the beginning of the list.
        removeLast()	Remove an item from the end of the list
        getFirst()	Get the item at the beginning of the list
        getLast()	Get the item at the end of the list
     */
}
