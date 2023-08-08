package com.socirank.Z_Extension;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

import androidx.core.view.WindowInsetsControllerCompat;

public class getBar
{
    public static void setBar(Activity context)
    {
        int nightModeFlags =
                context.getResources().getConfiguration().uiMode &
                        Configuration.UI_MODE_NIGHT_MASK;
        switch (nightModeFlags) {
            case Configuration.UI_MODE_NIGHT_YES:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Window window = context.getWindow();
                    View decorView = window.getDecorView();

                    WindowInsetsControllerCompat wic = new WindowInsetsControllerCompat(window, decorView);

                    wic.setAppearanceLightStatusBars(false); // true or false as desired.

                    // And then you can set any background color to the status bar.
                    window.setStatusBarColor(Color.BLACK);
                }
                break;

            case Configuration.UI_MODE_NIGHT_NO:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Window window = context.getWindow();
                    View decorView = window.getDecorView();

                    WindowInsetsControllerCompat wic = new WindowInsetsControllerCompat(window, decorView);

                    wic.setAppearanceLightStatusBars(true); // true or false as desired.

                    // And then you can set any background color to the status bar.
                    window.setStatusBarColor(Color.TRANSPARENT);
                }else{
                    context.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//  set status text dark
                }
                break;

            case Configuration.UI_MODE_NIGHT_UNDEFINED:
                break;
        }

    }
}
