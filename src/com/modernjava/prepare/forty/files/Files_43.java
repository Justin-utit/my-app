package com.modernjava.prepare.forty.files;

import java.io.File;
import java.io.IOException;

/*
    File handling is an important part of any application.

    // 增刪改查
    Java has several methods for creating, reading, updating, and deleting files.

    Java File Handling
    The File class from the java.io package, allows us to work with files.
    To use the File class, create an object of the class, and specify the filename or directory name:

    Create a File
    To create a file in Java, you can use the createNewFile() method.
    This method returns a boolean value: true if the file was successfully created,
    and false if the file already exists.

    Note that the method is enclosed in a try...catch block.
    This is necessary because it throws an IOException if an error occurs
    (if the file cannot be created for some reason):
 */
public class Files_43 {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt"); // Specify the filename D:/
            /*
                To create a file in a specific directory (requires permission),
                specify the path of the file and use double backslashes to escape the "\" character (for Windows).
                On Mac and Linux you can just write the path, like: /Users/name/filename.txt
*/
            // 以下兩種寫法都可以 C:\Users\User\OneDrive\桌面\日文
            // 1 使用跳脫字元:
//            File myObj = new File("C:\\Users\\User\\OneDrive\\桌面\\日文\\filename.txt");
            // 2 手動改斜線的方向:
//            File myObj = new File("C:/Users/User/OneDrive/桌面/日文/filename.txt");
            if (myObj.createNewFile()) { // create new file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }



            /*
                Write To a File
                In the following example, we use the FileWriter class together with its write() method
                to write some text to the file we created in the example above.
                Note that when you are done writing to the file, you should close it with the close() method:

            try {
                FileWriter myWriter = new FileWriter("filename2.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
 */

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
