//package com.project.Z_Extension;
//
//import android.app.Activity;
//import android.app.Service;
//import android.content.Intent;
//import android.os.Binder;
//import android.os.IBinder;
//
//import androidx.annotation.Nullable;
//import androidx.lifecycle.MutableLiveData;
//
//import com.arthenica.mobileffmpeg.FFmpeg;
//
//public class FFMpegService extends Service
//{
//    FFmpeg ffmpeg;
//    int duration;
//
//    public MutableLiveData<Integer> percentage;
//    IBinder myBinder = new LocalBinder();
//
//    String[] command;
//    Callbacks activity;
//
//
//    @Override
//    public void onStart(Intent intent, int startId) {
//        super.onStart(intent, startId);
//    }
//
//    @Override
//    public void onCreate() {
//        loadFFMpegBinary();
//        super.onCreate();
//    }
//
//    private void loadFFMpegBinary()
//    {
//        if(ffmpeg == null){
////            ffmpeg = FFmpeg.ge
//        }
//    }
//
//    public FFMpegService(){
//        super();
//    }
//
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//
//    public class LocalBinder extends Binder
//    {
//        public FFMpegService getServiceInstance(){
//            return FFMpegService.this;
//        }
//    }
//
//    public void registerClient(Activity activity){
//        this.activity = (Callbacks) activity;
//    }
//
//    public MutableLiveData<Integer> getPercentage()
//    {
//        return percentage;
//
//
//    }
//
//    public interface Callbacks
//    {
//        void updateClient(float data);
//
//    }
//}
