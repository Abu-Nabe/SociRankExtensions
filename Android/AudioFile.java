package com.socirank.Z_Extension;

import android.os.StrictMode;
import android.util.Log;

import com.google.android.gms.common.util.IOUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class AudioFile
{
    public static byte[] downloadFile(URL url) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        try {
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            IOUtils.copyStream(conn.getInputStream(), baos);

            return baos.toByteArray();
        } catch (IOException e) {
            Log.d("XAS", e.toString());
            // Log error and return null, some default or throw a runtime exception
        }

        return null;
    }
}
