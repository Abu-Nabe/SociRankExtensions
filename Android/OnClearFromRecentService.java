package com.socirank.Z_Extension;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.socirank.Api.MySingleton;
import com.socirank.Utils.PreferencesUtils;

import java.util.HashMap;
import java.util.Map;

public class OnClearFromRecentService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        stopSelf();
        Log.d("ClearFromRecentService", "Service Started");
        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        if(PreferencesUtils.getUsername(getApplicationContext()) != null){
            String URL = "http://10.0.2.2:8080/Project/mobileconnect/settings/Online.php";
            String currentUser = PreferencesUtils.getUsername(getApplicationContext());
            String timestring = String.valueOf(System.currentTimeMillis());

            StringRequest request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String result_code) {

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    Toast.makeText(getApplicationContext(), volleyError + "", Toast.LENGTH_SHORT).show();
                }
            }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    HashMap<String,String> param = new HashMap<>();
                    param.put("username", currentUser);
                    param.put("config", "offline");
                    param.put("status", timestring);
                    return param;
                }
            };

            request.setRetryPolicy(new DefaultRetryPolicy(30000,DefaultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            MySingleton.getmInstance(getApplicationContext()).addToRequestQueue(request);

            Log.d("MyApp", "App Destroyed");
        }
        Log.d("ClearFromRecentService", "Service Destroyed");
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {

    }
}
