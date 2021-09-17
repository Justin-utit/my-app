package com.modernjava.homework.lidemyanswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 最近點對_1033 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/input_1033_2.txt");
            Scanner myReader = new Scanner(myObj);

            StringBuilder sb = new StringBuilder();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                 System.out.println(data);
                sb.append(data);
            }

            String data = sb.toString();
//            System.out.println(data);

            int setOfNumbers = Integer.valueOf(data.substring(0,1));
//            System.out.println(setOfNumbers); // 4 (組資料) = 4個點
            String dataSet = data.substring(1).replace(" ","");
            System.out.println(dataSet); // 23131211

            // 先格式化成: int[][] arrBox = new int[4][2];

            // "23131211"
            // 02
            // 24
            // 46
            // 68
            // {{0,2},{2,4},{4,6},{6,8}}
            int[][] arrBox = new int[4][2];
            int index = 0;
            for(int i = 0; i<setOfNumbers; i++){ // 0 1 2 3

                String oneSubSet = dataSet.substring(index, index+2);
                int[] intArr = new int[2];
                intArr[0] = Integer.valueOf(oneSubSet.substring(0,1));  // 2
                intArr[1] = Integer.valueOf(oneSubSet.substring(1));    // 3
                arrBox[i] = intArr;

                index += 2;
            }
            // System.out.println(arrBox);

            // arrBox: {{0,2},{2,4},{4,6},{6,8}} 4個點會有6條線
            double minDis = Double.MAX_VALUE;
            for(int i = 0; i<setOfNumbers; i++){ // 0 1 2 3
                for(int j = i+1; j<setOfNumbers; j++){
                    System.out.print("("+i + ", " + j+")  -> "); // p to p
                    // 0 1
                    int[] p1 = arrBox[i];
                    int[] p2 = arrBox[j];
                    double distanceOf2Points = getDistanceOf2Points(p1, p2);
                    System.out.println("兩點距離: "+distanceOf2Points);

                    if(distanceOf2Points<minDis)
                        minDis = distanceOf2Points;
                }
            }

            int[] which2Point = getWhich2Point(setOfNumbers,arrBox,minDis);

            // 請輸出距離最近的兩個點，若是有兩組以上，請輸出最先出現在測資的那組
            System.out.println("距離最近的兩個點: "+which2Point[0]+", "+which2Point[1]); // 點0 點1

            /* 測資:
                2 3 點1
                1 3 點2
                1 2 點3
                1 1 點4
             */
            // 輸出的時候請先輸出 x 比較小的那個點，若是 x 相同，請先輸出 y 比較小的那個點
            int px1 = arrBox[which2Point[0]][0];
            int px2 = arrBox[which2Point[1]][0];
            int py1 = arrBox[which2Point[0]][1];
            int py2 = arrBox[which2Point[1]][1];
            if(px1 < px2){
                System.out.println(px1 + " " + py1);
                System.out.println(px2 + " " + py2);
            } else if (px2 < px1){
                System.out.println(px2 + " " + py2);
                System.out.println(px1 + " " + py1);
            } else { // x相同
                if(py1<py2){
                    System.out.println(px1 + " " + py1);
                    System.out.println(px2 + " " + py2);
                } else {
                    System.out.println(px2 + " " + py2);
                    System.out.println(px1 + " " + py1);
                }
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int[] getWhich2Point(int setOfNumbers,int[][] arrBox,double minDis){
        int[] which2Point = new int[2];
        for(int i = 0; i<setOfNumbers; i++){ // 0 1 2 3
            for(int j = i+1; j<setOfNumbers; j++){
//                System.out.print("("+i + ", " + j+")  -> "); // p to p
                // 0 1
                int[] p1 = arrBox[i];
                int[] p2 = arrBox[j];
                double distanceOf2Points = getDistanceOf2Points(p1, p2);
//                System.out.println("兩點距離: "+distanceOf2Points);

                if(minDis==distanceOf2Points){
                    which2Point[0] = i;
                    which2Point[1] = j;
                    return which2Point;
                }
            }
        }
        return null;
    }

    public static double getDistanceOf2Points(int[] p1, int[] p2){
        int x1 = p1[0];
        int y1 = p1[1];
        int x2 = p2[0];
        int y2 = p2[1];
//                System.out.println(""+x1+y1+x2+y2);
        double distanceOf2points = Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
        DecimalFormat df = new DecimalFormat("##.00");
        distanceOf2points = Double.parseDouble(df.format(distanceOf2points));
//        System.out.println(distanceOf2points); // 輸出結果
        return distanceOf2points;
    }
}












