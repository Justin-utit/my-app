package com.modernjava.homework.lidemyanswers;
// https://zh.wikipedia.org/wiki/ASCII
    /*
    A 65 - Z 90     -> + 32 就會從 大寫變小寫
    a 97 - z 122    -> - 32 就會從 小寫變大寫
     */
public class 大小寫互換 {
   /*
        hELLo -> HellO
    */
   public static void main(String[] args) {
        /*
        字串轉大寫
        若為大寫字母，不動
        若為小寫字母，轉大寫
         */
       String str = "Justin Chen";
       String oppositeCase = toOppositeCase(str);
       System.out.println(oppositeCase);
   }

    public static String toOppositeCase(String str){

        char[] charArr = str.toCharArray();

        for(int i = 0; i<charArr.length; i++){
            int charInt = charArr[i];
            if(charInt>=97 && charInt<=122){ // 該字元為小寫
                charArr[i] = (char)(charInt - 32); // 轉大寫塞回去
            } else if (charInt>=65 && charInt<=90){
                charArr[i] = (char)(charInt + 32);
            }
        }

        return String.valueOf(charArr);
    }
}
