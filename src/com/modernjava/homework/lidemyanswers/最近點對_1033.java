package com.modernjava.homework.lidemyanswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 最近點對_1033 {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1033_2.txt");
            Scanner myReader = new Scanner(myObj);

            int setOfNumbers = 0;
            int[][] arrContainer = new int[100][2];
            int ci = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                 System.out.println(data); // 100 100

                if(ci==0) { // 跳過第一行 數字N
                    setOfNumbers = Integer.valueOf(data);
                    ci++;
                    continue;
                }

                String[] strArr = data.split(" ");
                int[] intArr = {Integer.valueOf(strArr[0]),Integer.valueOf(strArr[1])}; // {100,100}

                arrContainer[ci-1] = intArr;
                ci++;
            }

            double minDis = Double.MAX_VALUE;
            for(int i = 0; i<setOfNumbers; i++){ // 0 1 2 3
                for(int j = i+1; j<setOfNumbers; j++){
                    System.out.print("("+i + ", " + j+")  -> "); // p to p
                    // 0 1
                    int[] p1 = arrContainer[i];
                    int[] p2 = arrContainer[j];
                    double distanceOf2Points = getDistanceOf2Points(p1, p2);
                    System.out.println("兩點距離: "+distanceOf2Points);

                    if(distanceOf2Points<minDis)
                        minDis = distanceOf2Points;
                }
            }

            int[] which2Point = getWhich2Point(setOfNumbers,arrContainer,minDis);

            // 請輸出距離最近的兩個點，若是有兩組以上，請輸出最先出現在測資的那組
            System.out.println("距離最近的兩個點: "+which2Point[0]+", "+which2Point[1]); // 點0 點1

            /* 測資:
                2 3 點1
                1 3 點2
                1 2 點3
                1 1 點4
             */
            // 輸出的時候請先輸出 x 比較小的那個點，若是 x 相同，請先輸出 y 比較小的那個點
            int px1 = arrContainer[which2Point[0]][0];
            int px2 = arrContainer[which2Point[1]][0];
            int py1 = arrContainer[which2Point[0]][1];
            int py2 = arrContainer[which2Point[1]][1];
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












