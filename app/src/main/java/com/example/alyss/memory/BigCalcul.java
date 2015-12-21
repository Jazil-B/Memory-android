package com.example.alyss.memory;

import android.os.AsyncTask;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jazz on 19/11/15.
 */
public class BigCalcul  {
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private TextView textView;
    int i=0;
    private Handler handler = new Handler();
    ProgressBar mProgressBar;

     void launch() {
        if (i == 0 || i == 10) {
            //make the progress bar visible
            progressBar.setVisibility(View.VISIBLE);
            progressBar.setMax(150);
        } else if (i < progressBar.getMax()) {
            //Set first progress bar value
            progressBar.setProgress(i);
            //Set the second progress bar value
        } else {
            progressBar.setProgress(0);
            i = 0;
            progressBar.setVisibility(View.GONE);

        }
        i = i + 10;
    }
}