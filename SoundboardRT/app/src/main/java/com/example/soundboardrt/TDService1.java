package com.example.soundboardrt;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class TDService1 extends Service{
    MediaPlayer myPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        Toast.makeText(this, "Horn Starting", Toast.LENGTH_SHORT).show();

        myPlayer = MediaPlayer.create(this, R.raw.horn);
        myPlayer.setLooping(false); // Set looping
    }
    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Horn Starting", Toast.LENGTH_SHORT).show();
        myPlayer.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Horn Stopped", Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }
}


