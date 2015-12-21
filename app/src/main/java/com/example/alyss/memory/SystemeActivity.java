package com.example.alyss.memory;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SystemeActivity extends AppCompatActivity {

    private Switch switch_music;

    //SharedPreferences musicPref = getSharedPreferences("musicPref", MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systeme);

        switch_music    = (Switch) findViewById(R.id.switch_music);
        final Button button_quitter = (Button) findViewById(R.id.button_quitter);

        //set the switch to OFF
        switch_music.setChecked(MainActivity.musicPref.getBoolean(MainActivity.musicOnString, false));
        //attach a listener to check for changes in state
        switch_music.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MainActivity.backgroundMusic.start();
                    MainActivity.backgroundMusic.setLooping(true);
                    MainActivity.musicPrefEditor.putBoolean(MainActivity.musicOnString, true);
                    MainActivity.musicPrefEditor.apply();
                } else {
                    MainActivity.backgroundMusic.pause();
                    MainActivity.musicPrefEditor.putBoolean(MainActivity.musicOnString, false);
                    MainActivity.musicPrefEditor.apply();

                    //musicPref.getBoolean("musicOn", true);
                }
            }
        });

        button_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });
    }
}
