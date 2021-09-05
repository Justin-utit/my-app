package com.modernjava.prepare.ten;

public class Arrays_14 {


    public static void main(String[] args) {

        String car = "Volvo";



        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

                // index:  0     ,  1   , 2     , 3
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]);

        // 印出index=2 的東西


        int[] myNum = {10, 20, 30, 40};

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars3[0] = "Opel";
        System.out.println(cars3[0]);
        System.out.println(cars3.length);

        for (int i = 0; i < cars3.length; i++) {
            System.out.println(cars3[i]);
        }

        String xxx = "12345678";
        System.out.println(xxx.length());

        // 存取 屬性 -> 物件.屬性
        // 存取 方法 -> 物件.方法()

        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars4) {
            System.out.println(i);
        }

        // try View > Appearance > Enter Presentation Mode

        /*
                { {}, {}, {},...  }


                { {1, 2, 3, 4}, {7, 8, 7} };
         */


        int[][] myNumbers = { {1, 2, 3, 4}, {7, 8, 7} };
//        int x = myNumbers[1][2];
//        System.out.println(x);
        System.out.println();

//        for (int i = 0; i < myNumbers.length; i++) { // i -> 0, 1
//            // i -> 0
//            for(int j = 0; j < myNumbers[i].length; j++) { // j -> 0, 1, 2, 3
//                System.out.println(myNumbers[i][j]); // 1, 2,
//            }
//
//        }

    }

}
