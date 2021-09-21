package com.modernjava.homework.lidemyanswers.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 不合群的人_1016 {
/* 處理這樣的資料
    5
    A
    B
    B
    A
    B
 */
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1016.txt");
            Scanner myReader = new Scanner(myObj);

            // 存input data (區域變數要手動給值)
            int firstHowManyPlayers = 0;
            char[] intArr = new char[0];

            // get input data
            int counter = 0;
            int pos = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                if(counter==0) { // 取得第一個數字，並拿之做容器初始化
                    firstHowManyPlayers = Integer.valueOf(data);
                    intArr = new char[firstHowManyPlayers];
                } else {
                    intArr[pos] = data.charAt(0);
                    pos++;
                }

                counter++;
            }


            // ------------------------------------------------ 以上拿到該拿的東西


            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void conformityCheck(){

    }

}
