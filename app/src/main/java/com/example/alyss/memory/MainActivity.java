package com.example.alyss.memory;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {

    static SharedPreferences musicPref;
    static SharedPreferences.Editor musicPrefEditor;
    static String musicOnString = "musicOn";

    static MediaPlayer backgroundMusic;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Launch_musique();


        final Button jouerButton = (Button) findViewById(R.id.button_jouer);
        jouerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "1 min restant", Toast.LENGTH_SHORT).show();
                Intent play = new Intent(MainActivity.this, LaunchGame.class);
                startActivity(play);

            }
        });

        final Button aboutButton = (Button) findViewById(R.id.button_about);
        aboutButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);
            }
        });

        final Button systemeButton = (Button) findViewById(R.id.button_systeme);
        systemeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent systeme = new Intent(MainActivity.this, SystemeActivity.class);
                startActivity(systeme);
            }
        });

        final Button autre = (Button) findViewById(R.id.button_score);
        autre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent score = new Intent(MainActivity.this, ScoreActivity.class);
                startActivity(score);
            }
        });

    }


    public void Launch_musique(){
        musicPref = getSharedPreferences("musicPref", MODE_PRIVATE);
        musicPrefEditor = musicPref.edit();

        if (backgroundMusic == null) backgroundMusic = MediaPlayer.create(this, R.raw.cadeau);
        if (musicPref.getBoolean(musicOnString, true))
        {
            SystemeActivity.music_active=1;
            backgroundMusic.start();
            backgroundMusic.setLooping(true);
        }
    }

    @Override protected void onPause() {
        super.onPause();
        backgroundMusic.pause();

       // mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        if(SystemeActivity.music_active==1) {
            backgroundMusic.start();
        }
       // mView.onResume();

    }

}
