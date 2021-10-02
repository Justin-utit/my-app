package com.modernjava.homework.inclasspractice.p211003;

public class 刪除特定字元 {
    // 刪除特定字元
    /*
        給定一個字串 "hello"
        指定一個要刪除的字元 例如 l
        刪完之後，結果為"heo"
     */
    public static void main(String[] args) {
        String str = "hello";
        char delThisChar = 'l';
        String modifiedStr = removeCertainCharacter(str, delThisChar);
        System.out.println(modifiedStr);
    }

    public static String removeCertainCharacter(String str, char delThisChar){

        char[] charArr = str.toCharArray();
        String container = "";

        for(int i = 0; i<charArr.length; i++){
            char currentChar = charArr[i];
            if(currentChar != delThisChar)
                container += currentChar;

        }

        return container;
    }


}
