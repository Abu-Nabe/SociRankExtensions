package com.socirank.Z_Extension;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

import androidx.core.content.FileProvider;

import java.io.File;

import static com.project.BuildConfig.APPLICATION_ID;

public class getCropUrl
{
    public static Uri getCaptureImageOutputUri(Context context, String imageID) {
        Uri outputFileUri = null;
        File getImage = context.getExternalCacheDir();
        if (getImage != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                outputFileUri = FileProvider.getUriForFile(context, APPLICATION_ID + ".provider",
                        new File(imageID));
            } else {
                outputFileUri = Uri.fromFile(new File(imageID));
            }
        }
        return outputFileUri;
    }
}
