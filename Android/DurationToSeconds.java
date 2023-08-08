package com.socirank.Z_Extension;

public class DurationToSeconds {
    public static String getTime(int seconds){
        int hr = seconds/3600;
        int rem = seconds % 3600;
        int mn = rem/60;
        int sec = rem % 60;

        if(hr > 0){
            return String.format("%02d",hr) + ":"+ String.format("%02d",mn) + ":"+ String.format("%02d",sec);
        }else {
            return String.format("%02d",mn) + ":"+ String.format("%02d",sec);
        }
    }
}
