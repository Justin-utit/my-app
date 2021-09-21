package com.modernjava.homework.lidemyanswers.a3c;

// 解題是一個倒吃甘蔗的過程，腦習慣了，負擔就變小，手上的演算法工具也變多了。
// a 97 - z 122

public class 凱薩加密_1034 {
    public static void main(String[] args) {
        int n = 10; // 最大100
        String str = "xray";
        doCaesarCipher(n,str);
    }

    public static void doCaesarCipher(int n, String str){
        char[] chars = str.toCharArray(); // xray
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            char encryptedChar = encryptOneChar(c,n);
            sb.append(encryptedChar);
        }
        System.out.println(sb.toString());
    }

    public static char encryptOneChar(char c, int n){
        int[] intArr = new int[130];
        int k = 0;
        for(int i = 0; i<5; i++){ // 5 times
            for(int j = 97; j<123; j++){
                intArr[k] = j;
                k++;
            }
        }

        int cNum = c; // 122
        // 122 - 97 = 25
        int indexBeforeShift = cNum - 97; // 25
        int indexAfterShift = indexBeforeShift + n;
        char cChar = (char) intArr[indexAfterShift];
        System.out.println(cChar);
        return cChar;
    }

}
