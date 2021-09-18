package com.modernjava.homework.lidemyanswers;

public class StringTrim_1041 {
    public static void main(String[] args) {
//        String str = "      a b c";
//        String str = "  abc  ";
        String str = "  a bc  ";
        String trimmedStr = trim(str);
        System.out.println("trimmedStr: "+ trimmedStr);
    }

    public static String trim(String str){
        char[] chars = str.toCharArray();
        int length = chars.length;

        int firstCharPos = 0;
        for (int i = 0; i<length; i++){ // "  a bc  "
            if(chars[i]!=' '){
                firstCharPos = i;
                break;
            }
        }
        int lastCharPos = 0;
        for (int i = length-1; i>=0; i--){
            if (chars[i]!=' '){
                lastCharPos = i;
                break;
            }
        }

        String trimmedStr = str.substring(firstCharPos,lastCharPos+1);
        // System.out.println("長度: "+trimmedStr.length());

        return trimmedStr;
    }
}
