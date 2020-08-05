package com.example.soundboardrt;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class TDService2 extends Service{
        MediaPlayer myPlayer2;

        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }
        @Override
        public void onCreate() {
            Toast.makeText(this, "Investigate Started", Toast.LENGTH_SHORT).show();

            myPlayer2 = MediaPlayer.create(this, R.raw.investigatesong);
            myPlayer2.setLooping(false); // Set looping
        }
        @Override
        public void onStart(Intent intent, int startid) {
            Toast.makeText(this, "Investigate Started", Toast.LENGTH_SHORT).show();
            myPlayer2.start();
        }
        @Override
        public void onDestroy() {
            Toast.makeText(this, "Investigate Stopped", Toast.LENGTH_LONG).show();
            myPlayer2.stop();
        }
    }

