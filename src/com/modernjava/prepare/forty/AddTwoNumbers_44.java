package com.modernjava.prepare.forty;

import java.util.Scanner;

// Learn how to add two numbers with user input:
public class AddTwoNumbers_44 {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sum = x + y;  // Calculate the sum of x + y
        System.out.println("Sum is: " + sum); // Print the sum
    }
}