package com.modernjava.homework;

public class HW210823 {

    public static void main(String[] args) {


        System.out.println("第一題: ");
        int day2 = 6;
        switch (day2) {
            case 6:
                System.out.println("Today is Saturday");
            case 7:
                System.out.println("Today is Sunday");
                break;
            default: // else
                System.out.println("Looking forward to the Weekend");
        }

        System.out.println("\n第二題: ");
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("\n第三題: ");

        int j = 5;
        do {
            System.out.println(j);
            j = j - 1;
        }
        while (j >= 3);

        System.out.println("\n第四題: ");
        // 實作題: 使用 for loop 印出 55-60
        for(int k = 55; k<61; k++){
            System.out.println(k);
        }

        System.out.println("\n第五題: ");
        // 實作題:
        // 1 宣告一個整數陣列，裡面放3個整數 19 11 70 8 23
        // 2 使用 for each loop, 依序列出 19 11 70 8 23
        int[] l = {19,11,70,8,23};
        // for(個別物件 : 陣列/集合){
        //
        // }
        for(int m : l){
            System.out.println(m);
        }

        /*


        第六題: 承上題(第五題)
                使用 break & continue
                印出 19 70 8
         */
        System.out.println("\n第六題: ");
        // 承上題(第五題)
        // 使用 break & continue
        // 印出 19 70 8
        for(int m : l){ // 19 11 70 8 23
            if(m==11)
                continue;
            System.out.println(m); // 8
            if(m==8)
                break;
        }


    }

}
