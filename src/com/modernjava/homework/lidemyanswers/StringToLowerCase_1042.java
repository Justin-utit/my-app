package com.modernjava.homework.lidemyanswers;
/*
    A 65 - Z 90     -> + 32 就會從 大寫變小寫
    a 97 - z 122    -> - 32 就會從 小寫變大寫
 */
public class StringToLowerCase_1042 {
    public static void main(String[] args) {
        String str = "AbC!!";
        String lowerCaseStr = toLowerCase(str);
        System.out.println("lowerCaseStr: "+lowerCaseStr);
    }

    public static String toLowerCase(String str){
        char[] chars = str.toCharArray();
        char[] lowerChars = new char[chars.length];

        int counter = 0;
        for(char c : chars){
            int cNum = c;
            if(cNum>=65 && cNum<=90){
                char xx = (char) (cNum+32);
                lowerChars[counter] = xx;
            } else {
                lowerChars[counter] = c;
            }
            counter++;
        }

        String lowerStr = "";
        for(char c : lowerChars){
            lowerStr += c;
        }

        return lowerStr;
    }
}
