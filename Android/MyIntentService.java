package com.socirank.Z_Extension;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

import com.socirank.Message.ChatActivity;

public class MyIntentService extends JobIntentService {

    public void onCreate() {
        super.onCreate();
        if(getBaseContext() != null){
            Log.d("xas", "name");
        }else {
            Log.d("Xas", "null");
        }

    }

    public MyIntentService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, startId, startId);

        String name = intent.getStringExtra("username");
        String profile = intent.getStringExtra("image");

        intent = new Intent(getBaseContext(), ChatActivity.class);
        intent.putExtra("username",name);
        intent.putExtra("image", profile);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        return START_STICKY;
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {
//
//        clearNotification(name, profile);
    }

    public void clearNotification(String name, String profile) {
        if(getBaseContext() != null){
            Intent intent = new Intent(getBaseContext(), ChatActivity.class);
            intent.putExtra("username", name);
            intent.putExtra("image", profile);
            startActivity(intent);
        }else {
        }

    }
}