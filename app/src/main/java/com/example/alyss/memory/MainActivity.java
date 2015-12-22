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
import android.widget.Toast;

public class MainActivity extends Activity {

    public static SharedPreferences musicPref;
    public static SharedPreferences.Editor musicPrefEditor;
    public static MediaPlayer backgroundMusic;
    public static String musicOnString = "musicOn";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicPref = getSharedPreferences("musicPref", MODE_PRIVATE);
        musicPrefEditor = musicPref.edit();

        if (backgroundMusic == null) backgroundMusic = MediaPlayer.create(this, R.raw.cadeau);
        if (musicPref.getBoolean(musicOnString, false))
        {
            backgroundMusic.start();
            backgroundMusic.setLooping(true);
        }

        final Button jouerButton = (Button) findViewById(R.id.button_jouer);
        jouerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "1 min restant", Toast.LENGTH_SHORT).show();
                Intent play = new Intent(MainActivity.this, InitGame.class);
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

    @Override protected void onPause() {
        super.onPause();
        backgroundMusic.pause();
       // mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        backgroundMusic.start();
       // mView.onResume();

    }

}
