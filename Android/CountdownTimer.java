package com.socirank.Z_Extension;

import android.util.Log;

import java.util.Calendar;
import java.util.TimeZone;

public class CountdownTimer {
    public static String timer() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar cal = Calendar.getInstance(timeZone);


        int hrs = cal.get(Calendar.HOUR_OF_DAY);


        Calendar alCal = Calendar.getInstance(timeZone);
        alCal.set(Calendar.HOUR_OF_DAY, 24);

        alCal.set(Calendar.MINUTE, 0);

        if(24 < hrs){
            alCal.add(Calendar.DAY_OF_MONTH, 1);
        }

        long diff = alCal.getTimeInMillis() - cal.getTimeInMillis();

        long leftHrs = (diff / (60 * 60 * 1000));
        long leftMin = (diff / (60 * 1000)) - (leftHrs * 60);

        if(leftHrs != 0){
            return leftHrs + " hours left";
        }else{
            return leftMin + " minutes left";
        }
    }
}