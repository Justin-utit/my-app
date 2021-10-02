package com.modernjava.prepare.one;

import java.util.Random;

public class Math_7 {
    public static void main(String[] args) {

        Math.max(5, 10);

        Math.min(5, 10);

        // The Math.sqrt(x) method returns the square root of x:
        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        // The Math.abs(x) method returns the absolute (positive) value of x:
        double absoluteValue = Math.abs(-4.7);
        System.out.println(absoluteValue);

        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        double random = Math.random(); // 0.0  ---  0.9999999999999
        System.out.println(random);


        // 應用: To get more control over the random number,
        // e.g. you only want a random number between 0 and 100, you can use the following formula:
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        // 乘以101是因為 Math.random()必會小於1

        int randomRange = getRandomNumberUsingRandom(1,100);
        System.out.println(randomRange);



        int randomNextInt = getRandomNumberUsingNextInt(8,10);
        System.out.println(randomNextInt);

    }

    public static int getRandomNumberUsingRandom(int min, int max) { // 8 - 10
        /* 可以用上下邊界去理解
        以範圍8-10來說 - 8 9 10
        Math.random(): 0.000 - 0.999
        下邊界: 0 + min -> 8
        上邊界: 0.999 * (10 - 8) -> 這個永遠小於2 + 8 = 9.9999999 去浮點後，永遠也不可能到10，這就是需要加1的原因
        */
        return (int) ( (Math.random() * (max - min + 1))  +  min);
        // 0 + 8 = 8
        // 0.999 * 3 = 2.99    + 8 = 10.99 = 10
    }

    //  java.util.Random.nextInt method to get a random number:
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }


}
