package com.socirank.Z_Extension;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;

import java.io.File;

public class SaveVideo
{
    public static void saveVideo(Uri videoUrl, Context mContext, ProgressDialog progressDialog)
    {
        progressDialog.setMessage("Downloading");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        try {
            ContextWrapper cw = new ContextWrapper(mContext);
            String mBaseFolderPath = cw.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)
                    + File.separator
                    + "SociRank" + File.separator;
            if (!new File(mBaseFolderPath).exists()) {
                new File(mBaseFolderPath).mkdir();
            }
            String timestamp = String.valueOf(System.currentTimeMillis());

            String mFilePath = "file://" + mBaseFolderPath + "/" +  timestamp + ".mp4";
            DownloadManager.Request req = new DownloadManager.Request(videoUrl);
            req.setDestinationUri(Uri.parse(mFilePath));
            req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            DownloadManager dm = (DownloadManager) mContext.getSystemService(mContext.DOWNLOAD_SERVICE);
            dm.enqueue(req);
            progressDialog.dismiss();

        } catch (Exception e) {
            e.printStackTrace();
            Log.d("XAS", e.toString());
            progressDialog.setMessage("Failed to save");

            Handler h = new Handler();

            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressDialog.dismiss();
                }
            }, 1500);
        }

    }
}
