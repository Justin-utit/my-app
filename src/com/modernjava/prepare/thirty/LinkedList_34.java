package com.modernjava.prepare.thirty;

/*
    When To Use

    查詢成本低:
    Use an ArrayList for storing and accessing data, 如果要大量查詢用
    [0] [1] [2] [3] ... [10000000]
    a    b   c   d       z
    list.get(2); -> c
    [0] [1] [2] [3] ... [10000000]
    a    b   c   d       z
    [0] [1] [2] [3] ... [10000000]
    a    b   d   e       z

    and LinkedList to manipulate data. 如果經常需要插入用
    查詢 -> 成本高 浪費運算效能
    [0] -> [1] -> [2] -> [3] -> [4] ... -> [1000000000]
    // 插入、刪除(作業)
    [0] -> [1] -> [2] -> [3] -> [4] ... -> [1000000000]
    [0] -> [1] -> [2].next = 00x8 -> [].next=00x9 -> [3] 00x9 -> [4] ... -> [1000000000]

 */
public class LinkedList_34 {

    static class Node{
        Node next;
        int num;
        public Node(){
        }
    }

    public static void main(String[] args) {

        //     [0] -> [1] -> [2] -> [3] -> [4] ... -> [1000000000]
        //     n1     n2     n3
        Node n1 = new Node();
        Node n2 = new Node(); // n2 "記憶體位置" -> 00x1
        n1.next = n2; // 00x1
        Node n3 = new Node();
        n2.next = n3;

        System.out.println();



        /*
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        */

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
