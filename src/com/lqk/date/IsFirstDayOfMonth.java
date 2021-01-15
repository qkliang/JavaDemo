package com.lqk.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IsFirstDayOfMonth {

    public static void main(String[] args) throws ParseException {
        String sDate = "2020-12-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(sDate);
        boolean b = firstDayOfMonth(date);
        System.out.println("当月首日：" + (b));


    }

    public static boolean firstDayOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)+1);
        if(calendar.get(Calendar.DAY_OF_MONTH) == 2){
            return true;
        }else{
            return false;
        }
    }
}
