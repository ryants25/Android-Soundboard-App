package com.example.soundboardrt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonTDStart, buttonTDStop, button2TDStart, button2TDStop, button3TDStart, button3TDStop, killButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTDStart = findViewById(R.id.buttonStart);
        buttonTDStop = findViewById(R.id.buttonStop);

        button2TDStart = findViewById(R.id.button2Start);
        button2TDStop = findViewById(R.id.button2Stop);

        button3TDStart = findViewById(R.id.button3Start);
        button3TDStop = findViewById(R.id.button3Stop);

        killButton = findViewById(R.id.stopAll);

        buttonTDStart.setOnClickListener(this);
        buttonTDStop.setOnClickListener(this);
        button2TDStart.setOnClickListener(this);
        button2TDStop.setOnClickListener(this);
        button3TDStart.setOnClickListener(this);
        button3TDStop.setOnClickListener(this);
        killButton.setOnClickListener(this);


    }

    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.buttonStart:
                startService(new Intent(this, TDService1.class));
                break;
            case R.id.buttonStop:
                stopService(new Intent(this, TDService1.class));
                break;
            case R.id.button2Start:
                startService(new Intent(this,TDService2.class));
                break;
            case R.id.button2Stop:
                stopService(new Intent(this, TDService2.class));
                break;
            case R.id.button3Start:
                startService(new Intent(this,TDService3.class));
                break;
            case R.id.button3Stop:
                stopService(new Intent(this, TDService3.class));
                break;
            case R.id.stopAll:
                stopService(new Intent(this, TDService1.class));
                stopService(new Intent(this, TDService2.class));
                stopService(new Intent(this, TDService3.class));
                break;
        }
    }
}
