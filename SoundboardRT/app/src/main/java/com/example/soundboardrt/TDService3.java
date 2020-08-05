package com.example.soundboardrt;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class TDService3 extends Service{
    MediaPlayer myPlayer3;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        Toast.makeText(this, "Troll Starting", Toast.LENGTH_SHORT).show();

        myPlayer3 = MediaPlayer.create(this, R.raw.troll);
        myPlayer3.setLooping(false); // Set looping
    }
    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Troll Starting", Toast.LENGTH_SHORT).show();
        myPlayer3.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Troll Stopped", Toast.LENGTH_LONG).show();
        myPlayer3.stop();
    }
}
