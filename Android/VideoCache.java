package com.socirank.Z_Extension;

import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class VideoCache
{
    public static void downloadAndCacheMp4(String urlString, File cacheFile) throws IOException {
        // Create a URL object for the file to download.
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();;

        Request request = new Request.Builder()
                .url(urlString)
                .build();

        Response response = null;
        try {
            response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                InputStream inputStream = response.body().byteStream();

                // Save the video to the external storage
                OutputStream outputStream = new FileOutputStream(cacheFile);

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.flush();
                outputStream.close();
                inputStream.close();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
            Log.d("XAS", exception.toString());
        }
    }
}
