package com.modernjava.prepare;

public class Arrays_14 {

    public static void main(String[] args) {

        String[] cars;

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2[0]);

        int[] myNum = {10, 20, 30, 40};

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars3[0] = "Opel";
        System.out.println(cars3[0]);
        System.out.println(cars3.length);

        for (int i = 0; i < cars3.length; i++) {
            System.out.println(cars3[i]);
        }

        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars4) {
            System.out.println(i);
        }


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x);

        for (int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }

}