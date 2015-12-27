package com.example.alyss.memory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by jazz on 16/11/15.
 */
public class LaunchGame extends Activity {



    static JeuView mjeu;
    static ProgressBar progressBar;
    Timer time = new Timer();
    MainActivity music = new MainActivity();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // initialise notre activity avec le constructeur parent
        super.onCreate(savedInstanceState);
        // charge le fichier main.xml comme vue de l'activit
        setContentView(R.layout.main);
//        mjeu.initparameters();


        mjeu = (JeuView)findViewById(R.id.JeuView);
        // rend visible la vue
        mjeu.setVisibility(View.VISIBLE);
        time.init();
        mjeu.setScore();
        // recuperation de la vue une voie cree  partir de son id
        progressBar = (ProgressBar) findViewById(R.id.pBAsync);
        //textView = (TextView) findViewById(R.id.textView1);
        // Start long running operation in a background thread


        time.setProgressBar_tmp(progressBar);

        final Button rejouerButton = (Button) findViewById(R.id.button_rejouer);
        rejouerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent jeu = new Intent(LaunchGame.this, LaunchGame.class);
                startActivity(jeu);
            }
        });

    }


       @Override
         protected void onPause() {
        super.onPause();
        time.block(1);
        //  backgroundMusic.pause();
        // mView.onPause();
           MainActivity.backgroundMusic.pause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (time.getBlock_tmp() == 1) {
            time.block(0);
            time.launch();
        }
        if(SystemeActivity.music_active==1) {
            MainActivity.backgroundMusic.start();
        }
        // backgroundMusic.start();
        // mView.onResume();

    }

}
