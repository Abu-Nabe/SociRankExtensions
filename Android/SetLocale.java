package com.socirank.Z_Extension;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;

import java.util.Locale;

public class SetLocale
{
    public static void setLocale(Activity activity, String language)
    {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        activity.getBaseContext().getResources()
                .updateConfiguration(configuration,
                        activity.getBaseContext().getResources().getDisplayMetrics());

        SharedPreferences.Editor editor = activity.getSharedPreferences("Settings", Context.MODE_PRIVATE).edit();
        editor.putString("Lang", language);
        editor.apply();
    }
}
