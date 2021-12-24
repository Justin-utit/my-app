package com.modernjava.prepare.forty.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    Read a File
    In the previous chapter, you learned how to create and write to a file.
    In the following example, we use the Scanner class to read the contents of the text file
    we created in the previous chapter:
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
