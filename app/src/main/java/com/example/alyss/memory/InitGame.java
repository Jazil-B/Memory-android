package com.example.alyss.memory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by jazz on 16/11/15.
 */
public class InitGame extends AppCompatActivity implements Runnable{



    public JeuView mjeu;
    static ProgressBar progressBar;
    static int progressStatus = 60;
    static int return_stat=60;
    static int block_tmp=0;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // initialise notre activity avec le constructeur parent
        super.onCreate(savedInstanceState);
        // charge le fichier main.xml comme vue de l'activit
        setContentView(R.layout.main);

        mjeu = (JeuView)findViewById(R.id.JeuView);
        // rend visible la vue
        mjeu.setVisibility(View.VISIBLE);

        // recuperation de la vue une voie cree  partir de son id
        progressBar = (ProgressBar) findViewById(R.id.pBAsync);
        //textView = (TextView) findViewById(R.id.textView1);
        // Start long running operation in a background thread


    }

public  void launch(){
   // startProgress();
    new Thread(new InitGame()).start();
}


     public void run(){

            while (progressStatus > 0) {

                // Update the progress bar and display the current value in the text view


                //textView.setText(progressStatus+"/"+progressBar.getMax());

                if(block_tmp==1){
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressStatus -= 1;
                status_time_tempo(progressStatus);
                progressBar.setProgress(progressStatus);
            }
        }




    public void status_time_tempo(int tmp){
        return_stat= progressStatus;
    }


    public int status_time(){
        return return_stat;
    }

    public int block(int block){

        if(block==1) {
            block_tmp=1;
            return block_tmp;
        }
        return block_tmp;
    }

}
