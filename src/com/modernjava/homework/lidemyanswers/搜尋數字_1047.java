package com.modernjava.homework.lidemyanswers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 搜尋數字_1047 {
    public static void main(String[] args) {
        // 從檔案把資料讀進來
        try {
            File myObj = new File("src/com/modernjava/homework/lidemyanswers/inputdata/input_1047.txt");
            Scanner myReader = new Scanner(myObj);

            int numPool = 0;
            int howManyToSearch = 0;

            int[] allNums = new int[0];
            int numsPosition = 0;

            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                if(counter==0){
                    numPool = Integer.valueOf(data.split(" ")[0]); // 5
                    howManyToSearch = Integer.valueOf(data.split(" ")[1]); // 3
                    allNums = new int[numPool+howManyToSearch];
                } else {
                    allNums[numsPosition] = Integer.valueOf(data);
                    numsPosition++;
                }

                counter++;
            }

            int[] np = new int[numPool];
            for(int i = 0; i<numPool; i++){
                np[i] = allNums[i];
            }

            // 0 - 7 ->
            for(int i = numPool; i<allNums.length; i++){ // 100, 3, 6
                int searchThisNum = allNums[i];
                int result = -1;
                for(int j = 0; j<np.length; j++){ // 1,2,3,4,5
                    if(np[j]==searchThisNum) {
                        result = j;
                        break;
                    }
                }

                System.out.println(result);
            }









            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
