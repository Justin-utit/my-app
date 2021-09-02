package com.modernjava.prepare;

/*
    A package in Java is used to group related classes. Think of it as a folder in a file directory.
    We use packages to avoid name conflicts, and to write a better maintainable code.
    Packages are divided into two categories:

    Built-in Packages (packages from the Java API)
    User-defined Packages (create your own packages)

    The library is divided into packages and classes.
    Meaning you can either import a single class (along with its methods and attributes),
    or a whole package that contain all the classes that belong to the specified package.

    To use a class or a package from the library, you need to use the import keyword:
    import package.name.Class;   // Import a single class
    import package.name.*;   // Import the whole package
 */

import java.util.Scanner;

public class Packages_24 {
    // 由此開始
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
