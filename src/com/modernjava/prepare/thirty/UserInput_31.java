package com.modernjava.prepare.thirty;


import java.util.Scanner;


public class UserInput_31 {
    public static void main(String[] args) {
        /*
        套件、api、Library -> 直接使用別人已經寫好的程式

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        */

        Scanner myObj2 = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj2.nextLine();

        // Numerical input
        int age = myObj2.nextInt();
        double salary = myObj2.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}
