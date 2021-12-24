package com.modernjava.prepare.forty.files;

import java.io.File;
//You can also delete a folder. However, it must be empty:
public class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\User\\OneDrive\\桌面\\日文\\test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
