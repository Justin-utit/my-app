package com.modernjava.prepare.thirty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_32_實務 {
    public static void main(String[] args) throws ParseException {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        System.out.println(formatDate(new Date()));
        Date currentDate = parse("2021-10-22 17:18:38");
        System.out.println(currentDate);

    }

    public static  String formatDate(Date date)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Date parse(String strDate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(strDate);
    }
}
