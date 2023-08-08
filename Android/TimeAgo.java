package com.socirank.Z_Extension;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class TimeAgo {
    public static String toDuration(long time_ago) {
        time_ago = TimeUnit.MILLISECONDS.convert(time_ago, TimeUnit.MICROSECONDS);

        long cur_time = (Calendar.getInstance().getTimeInMillis()) / 1000;
        long time_elapsed = cur_time - time_ago;
        long seconds = time_elapsed;
        int minutes = Math.round(time_elapsed / 60);
        int hours = Math.round(time_elapsed / 3600);
        int days = Math.round(time_elapsed / 86400);
        int weeks = Math.round(time_elapsed / 604800);
        int months = Math.round(time_elapsed / 2600640);
        int years = Math.round(time_elapsed / 31207680);

        // Seconds
        if (seconds <= 60) {
            return "now";
        }
        //Minutes
        else if (minutes <= 60) {
            if (minutes == 1) {
                return "1m";
            } else {
                return minutes + "m";
            }
        }
        //Hours
        else if (hours <= 24) {
            if (hours == 1) {
                return "1h";
            } else {
                return hours + "h";
            }
        }
        //Days
        else if (days <= 7) {
            if (days == 1) {
                return "1d";
            } else {
                return days + "d";
            }
        }
        //Weeks
        else if (weeks <= 4.3) {
            if (weeks == 1) {
                return "1w";
            } else {
                return weeks + "w";
            }
        }
        //Months
        else if (months <= 12) {
            if (months == 1) {
                return "1mo";
            } else {
                return months + "mo";
            }
        }
        //Years
        else {
            if (years == 1) {
                return "1y";
            } else {
                return years + "y";
            }
        }
    }
}