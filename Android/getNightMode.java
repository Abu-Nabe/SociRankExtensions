package com.socirank.Z_Extension;

import android.content.Context;
import android.content.res.Configuration;

public class getNightMode
{
    public static boolean isNightMode(Context context) {
        int nightModeFlags = context.getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        return nightModeFlags == Configuration.UI_MODE_NIGHT_YES;
    }
}
