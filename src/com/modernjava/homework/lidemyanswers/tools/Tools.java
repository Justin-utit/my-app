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

        /*
        使用.pow()
        double result1 =Math.pow(10, 2);//10的2次方 -> 100 (10*10) -> loop can do the same
        double result2 =Math.pow(2, 5);//2的5次方 -> 32 (2*2*2*2*2)

        或是.sqrt() 開根號
        double result_sqrt = Math.sqrt(100); -> 10
        OR
        double result_pow=Math.pow( 100 , 0.5 ); //100的0.5次方 = 100開根號 -> 10

         */


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
