package com.socirank.Z_Extension;

import android.content.Context;
import android.content.Intent;

public class ShareApp {

    public static void shareLink(String username, String packName, Context context){
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "SociRank");
            String shareMessage= "\nI invite you to to SociRank, it's a new social media app that I'm using and I'm on it as @"+username+" \n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + packName;
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            context.startActivity(Intent.createChooser(shareIntent, "share via"));
        } catch(Exception e) {
            //e.toString();
        }
    }

}
