package com.modernjava.prepare;

public class Operators_5 {

    // 運算子，變數跟值的互動主要靠運算子
    // Operators are used to perform operations on variables and values.

    // 一共有四種運算子，以下一一說明:

    public static void main(String[] args) {

        // 算術運算子:
        // 值 + 值
        int sum1 = 100 + 50;        // 150 (100 + 50)
        // 變數 + 值
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        // 變數 + 變數
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        System.out.println(1 + 2);
        System.out.println(3 - 1);
        System.out.println(2 * 2);

        System.out.println();
        System.out.println();

        System.out.println();

        System.out.println(4 / 2);

        System.out.println(5 / 2); // 注意 (解法是，使其中一個為浮點數，最後出來就會是浮點數
        // 5.0
        // 5f
        // 5d

        System.out.println(10 % 7);
        System.out.println(2 % 3);
        System.out.println(0 % 3);

        int num = 1; // 變數++
        System.out.println(num++); // 先印 再1++
        System.out.println(++num); // 先1++ 再印

//        System.out.println(num); // 2



        // System.out.println(num++);
        // System.out.println(++num);

        int num2 = 3; // 變數--

        // System.out.println(num2--);
        // System.out.println(--num2);

        // Assignment operators are used to assign values to variables.
        // 塞值運算子
        int x = 10;

        // +=
        int y = 10;
        // y += 5; // y = y + 5;
        y = y + 5;
//        System.out.println(y);

        System.out.println(y);

        int m = 3;
        m *= 10;
        // This means, a = a * 10
        System.out.println(m);

        // m -= 3    ->    m = m - 3;
        // m /= 3    ->    m = m / 3;
        // m %= 3    ->    m = m % 3;

        // 特殊的 這些 不用學，工作以來幾乎沒看過，網路上也沒什麼人討論這個
        // x &= 3	x = x & 3
        // x |= 3	x = x | 3
        // x ^= 3	x = x ^ 3
        // x >>= 3	x = x >> 3
        // x <<= 3	x = x << 3

        /* 比較運算子: Comparison operators are used to compare two values:
                ==	Equal to	x == y
                !=	Not equal	x != y
                >	Greater than	x > y
                <	Less than	x < y
                >=	Greater than or equal to	x >= y
                <=	Less than or equal to	x <= y
        */
        // 這個很直覺，不用多說明
        int aa = 1;
        int bb = 2;
        System.out.println(1 == 1); // false
        System.out.println(1 != 2); // true

        // 邏輯運算子: Logical operators are used to determine the logic between variables or values:
        // &&
        System.out.println(1 < 2 && 3 < 4); // 且(兩個都要true才為true)
        // ||
        System.out.println(1 < 2 || 3 > 4); // 或(一個true即為true)
        // ! 把結果反過來 !true就是false
        System.out.println(!(1 < 2 && 3 < 4));
        System.out.println(!true);


    }
}
