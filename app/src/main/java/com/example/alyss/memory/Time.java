package com.example.alyss.memory;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by jazz on 10/11/15.
 */


    public class Time extends Thread{
    int Temps = 60;
    int delay = Temps;


    public void run() {
        long start = System.currentTimeMillis();
        int i = 0;
        // boucle tant que la durée de vie du thread est < à 1 minutes
        while (System.currentTimeMillis() < (start + (1000 * Temps))) {
            // traitement
            System.out.println("Ligne affichée par le thread " + (Temps - i++) + " sec");

            delay --;
            try {
                // pause
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

    public int delai_jeu() {
        return delay;
    }
}

