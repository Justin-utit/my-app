package com.modernjava.prepare.thirty;

import java.util.ArrayList;
import java.util.Collections;

/*
    The ArrayList class is a resizable array, which can be found in the java.util package.
    The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
    (if you want to add or remove elements to/from an array, you have to create a new one).
    While elements can be added and removed from an ArrayList whenever you want.
 */
public class ArrayList_33 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String zero = cars.get(0);
        System.out.println(zero);

        cars.set(0, "Opel");
        zero = cars.get(0);
        System.out.println(zero);

        cars.remove(0);
        zero = cars.get(0);
        System.out.println(zero);

//        cars.clear();
//        System.out.println(cars.size());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("-> " + cars.get(i));
        }

        for (String i : cars) {
            System.out.println("::: "+i);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }


        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        Collections.sort(cars2);  // Sort cars
        for (String i : cars2) {
            System.out.println("sort: "+i);
        }

        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(33);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(34);
        myNumbers2.add(8);
        myNumbers2.add(12);

        Collections.sort(myNumbers2);  // Sort myNumbers

        for (int i : myNumbers2) {
            System.out.println("sorted numbers: "+i);
        }
    }
}
