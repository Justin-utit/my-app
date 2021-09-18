package com.modernjava.homework.lidemyanswers.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tools {

    public static void main(String[] args) {
        char[] chars = "str".toCharArray();

        /*
            A 65 - Z 90     -> + 32 就會從 大寫變小寫
            a 97 - z 122    -> - 32 就會從 小寫變大寫
         */

        // 可用的演算法:
        // 平面兩點距離計算: 1032


        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1032.txt");
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
