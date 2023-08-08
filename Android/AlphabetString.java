package com.socirank.Z_Extension;

import java.util.regex.Pattern;

public class AlphabetString
{
    public static boolean containsAlphabets(String input) {
        return Pattern.compile("[a-zA-Z]").matcher(input).find();
    }
}
