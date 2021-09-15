package com.modernjava.homework.lidemyanswers;

// https://oj.lidemy.com/problem/1024

public class NM乘法表_1024 {
    /*
    簡單來說，N 代表 N 個數，M 代表每個數要乘到多少，例如說 N=2, M=3，就會是：
    1*1, 1*2, 1*3
    2*1, 2*2, 2*3
    現在給你 N 以及 M，請你輸出 NM 乘法表會長什麼樣子
    Input
    輸入為兩行，第一行為一個數字 N，第二行為一個數字 M，1&lt;=N, M &lt;= 301<=N,M<=30
    Output
    請根據輸出範例的格式輸出 NM 乘法表
    進:
    2
    3
    出:
        1*1=1
        1*2=2
        1*3=3
        2*1=2
        2*2=4
        2*3=6
     */
    public static void main(String[] args) {
        int n = 2;
        int m = 4;
        print99Multiplication(n,m);
    }

    public static void print99Multiplication(int n, int m){
        for(int i = 1; i<=n; i++){ // 1 2
            for(int j = 1; j<=m; j++){ // 1 2 3
                int result = i*j;
                System.out.println(i+"*"+j+"="+result);
            }
        }
    }

}
