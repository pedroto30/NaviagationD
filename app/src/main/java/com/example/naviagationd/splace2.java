package com.example.naviagationd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splace2 extends AppCompatActivity {
    public static final long SPLASH_SCREEN_DELAY = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace2);
        musica();
        TimerTask time= new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent().setClass(splace2.this,splace1.class);
                startActivity(intent);
                finish();
            }
        };
        //se ejecurata una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }

    private void musica() {
       // MediaPlayer mpmusica=MediaPlayer.create(splace2.this,R.raw.condor);
        //mpmusica.start();
    }
}