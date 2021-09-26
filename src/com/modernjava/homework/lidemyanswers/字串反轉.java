package com.modernjava.homework.lidemyanswers;

public class 字串反轉 {
    /*
    給一個字串 str，請輸出 str 反過來的結果
        範例輸入：hello
        範例輸出：olleh
        PS. 可以用 str[i] 取得第 i 個字，例如說 str="abc"，str[0] 就是 'a'
     */
    public static void main(String[] args) {
        String str = "hello";
        String reverseStr = reverseString(str);
        System.out.println(reverseStr);
    }

    public static String reverseString(String str){

        char[] chars = str.toCharArray(); // hello

        String reverseStr = ""; // +'o'+'l'+'h'

        // [h,e,l,l,o] -> 0 - 4     <- i: 4 3 2 1 0
        for(int i = chars.length-1; i>=0; i--){
            // reverseStr += chars[i];
            //
            reverseStr = reverseStr + chars[i];
        }
        return reverseStr;
    }
}















