package com.socirank.Z_Extension;

import android.content.Context;
import android.content.res.Configuration;

public class isTablet {
    public static boolean getTablet(Context ctx){
        return (ctx.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
