package com.modernjava.homework.inclasspractice.p211003;

public class 字串轉大寫 {
    // 字串轉大寫
    // https://zh.wikipedia.org/wiki/ASCII
    /*
        A 65 - Z 90     -> + 32 就會從 大寫變小寫
        a 97 - z 122    -> - 32 就會從 小寫變大寫
     */
    public static void main(String[] args) {

        char x = 'a';
        char y = 'a' - 32;
        System.out.println(y);


        /*
        字串轉大寫
        若為大寫字母，不動
        若為小寫字母，轉大寫
         */
        String str = "Justin Chen";
        String upperCase = toUpperCase(str);
        System.out.println(upperCase);
    }

    public static String toUpperCase(String str){

        char[] charArr = str.toCharArray();

        for(int i = 0; i<charArr.length; i++){
            int charInt = charArr[i];
            if(charInt>=97 && charInt<=122){ // 該字元為小寫
                charArr[i] = (char)(charInt - 32); // 轉大寫塞回去
            }
        }

        return String.valueOf(charArr);
    }

}
