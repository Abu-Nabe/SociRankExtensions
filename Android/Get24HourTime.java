package com.socirank.Z_Extension;

import java.util.Calendar;

public class Get24HourTime {
    public static String onTimeSet(int hour, int minute) {

        Calendar mCalen = Calendar.getInstance();;
        mCalen.set(Calendar.HOUR_OF_DAY, hour);
        mCalen.set(Calendar.MINUTE, minute);

        int hour12format_local = mCalen.get(Calendar.HOUR);
        int hourOfDay_local = mCalen.get(Calendar.HOUR_OF_DAY);
        int minute_local = mCalen.get(Calendar.MINUTE);
        int ampm = mCalen.get(Calendar.AM_PM);
        String minute1;
        if(minute_local<10){

            minute1="0"+minute_local;
        }
        else
            minute1=""+minute_local;

        String ampmStr = (ampm == 0) ? "AM" : "PM";
        // Set the Time String in Button

        if(hour12format_local==0)
            hour12format_local=12;



        String selectedTime=hour12format_local+":"+ minute1+" "+ampmStr;

        return selectedTime;

    }
}
