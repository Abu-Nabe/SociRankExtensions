package com.socirank.Z_Extension;

public class numberCalculation
{
    public static String numberCalculation(long number) {
        if (number < 1000)
            return "" + number;
        int exp = (int) (Math.log(number) / Math.log(1000));

        if (number % 1000 == 0) {
            return String.format("%.0f%c", number / Math.pow(1000, exp), "kMGTPE".charAt(exp-1));
        } else {
            return String.format("%.1f%c", number / Math.pow(1000, exp), "kMGTPE".charAt(exp-1));
        }
    }
}
