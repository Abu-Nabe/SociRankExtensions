package com.socirank.Z_Extension;

public class reduceString {
    public static String reduce(String string) {
        if(string.length() > 16){
            String cutString = string.substring(0, 16);
            string = cutString;
        }
        return string;
    }
}
