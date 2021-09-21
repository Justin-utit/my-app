package com.modernjava.homework.lidemyanswers;

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
            char[] charArr = new char[0];

            // get input data
            int counter = 0;
            int pos = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                if(counter==0) { // 取得第一個數字，並拿之做容器初始化
                    firstHowManyPlayers = Integer.valueOf(data);
                    charArr = new char[firstHowManyPlayers];
                } else {
                    charArr[pos] = data.charAt(0);
                    pos++;
                }

                counter++;
            }

            // ------------------------------------------------ 以上拿到該拿的東西


            conformityCheck(firstHowManyPlayers, charArr);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void conformityCheck(int firstHowManyPlayers, char[] charArr){

        int numOfA = 0;
        int numOfB = 0;

        int[] aPosition = new int[firstHowManyPlayers];
        int[] bPosition = new int[firstHowManyPlayers];
        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i<firstHowManyPlayers; i++){
            if(charArr[i]=='A') {
                numOfA++;
                aPosition[aIndex] = i+1;
                aIndex++;
            } else if(charArr[i]=='B') {
                numOfB++;
                bPosition[bIndex] = i+1;
                bIndex++;
            }
        }

        boolean allA = numOfA>numOfB && numOfB==0;
        boolean allB = numOfB>numOfA && numOfA==0;
        // 數量一樣 : PEACE
        // 全部一樣 : PEACE
        if(numOfA==numOfB || allA || allB)
            System.out.println("PEACE");
        else if(numOfA>numOfB) {
//            System.out.println("B是少數(B不合群)");
            for (int b : bPosition) {
                if(b>0)
                    System.out.println(b);
            }
        }else if(numOfB>numOfA) {
//            System.out.println("A是少數(A不合群)");
            for (int a : aPosition) {
                if(a>0)
                    System.out.println(a);
            }
        }


    }

}











