package com.example.alyss.memory;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {


    ArrayList liste = new ArrayList();
    ArrayList liste_result = new ArrayList();
    Initialisation init = new Initialisation();
    Verification verifie = new Verification();
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton img_tmp1;
    ImageButton img_tmp2;
    Thread td= new Thread();
    ProgressBar mProgressBar;
    CountDownTimer mCountDownTimer;
    Animation anime = new Animation();

    private long duree = 30000;
    int i=30;

    int cpt_flip = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        liste = init.init();
        td.start();

        mProgressBar=(ProgressBar)findViewById(R.id.progressbar);
        mProgressBar.setProgress(i);
        mCountDownTimer=new CountDownTimer(duree,1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                //Log.v("Log_tag", "Tick of Progress " + i + millisUntilFinished);
                i--;
                mProgressBar.setProgress(i);

            }

            @Override
            public void onFinish() {
                //Do what you want
                i--;
                mProgressBar.setProgress(i);
            }
        };
        mCountDownTimer.start();

        onPause();


        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                imageButton1.setTag(liste.get(0));

                //liste.get(0);



               // anime.Animate_clear(imageButton1, init.carte((int) liste.get(0)));


                imageButton1.setImageResource(init.carte((int) liste.get(0)));
                cpt_flip++;
                check(imageButton1,(int)liste.get(0));
            }
        });

        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                imageButton2.setTag(liste.get(1));
                // liste.get(1);
              //  liste_result.add(liste.get(1));
                imageButton2.setImageResource(init.carte((int) liste.get(1)));
                cpt_flip++;
                check(imageButton2,(int) liste.get(1));
            }
        });

        final ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(2);
                imageButton3.setImageResource(init.carte((int) liste.get(2)));
                cpt_flip++;
                check(imageButton3, (int) liste.get(2));
            }
        });

        final ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(3);
                imageButton4.setImageResource(init.carte((int) liste.get(3)));
                cpt_flip++;
                check(imageButton4, (int) liste.get(3));
            }
        });

        final ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(4);
                imageButton5.setImageResource(init.carte((int) liste.get(4)));
                cpt_flip++;
                check(imageButton5, (int) liste.get(4));
            }
        });

        final ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(5);
                imageButton6.setImageResource(init.carte((int) liste.get(5)));
                cpt_flip++;
                check(imageButton6, (int) liste.get(5));
            }
        });

        final ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(6);
                imageButton7.setImageResource(init.carte((int) liste.get(6)));
                cpt_flip++;
                check(imageButton7, (int) liste.get(6));
            }
        });

        final ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(7);
                imageButton8.setImageResource(init.carte((int) liste.get(7)));
                cpt_flip++;
                check(imageButton8, (int) liste.get(7));
            }
        });

        final ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(8);
                imageButton9.setImageResource(init.carte((int) liste.get(8)));
                cpt_flip++;
                check(imageButton9, (int) liste.get(8));
            }
        });

        final ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(9);
                imageButton10.setImageResource(init.carte((int) liste.get(9)));
                cpt_flip++;
                check(imageButton10, (int) liste.get(9));
            }
        });

        final ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        imageButton11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(10);
                imageButton11.setImageResource(init.carte((int) liste.get(10)));
                cpt_flip++;
                check(imageButton11, (int) liste.get(10));
            }
        });

        final ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        imageButton12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(11);
                imageButton12.setImageResource(init.carte((int) liste.get(11)));
                cpt_flip++;
                check(imageButton12, (int) liste.get(11));
            }
        });

        final ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        imageButton13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(12);
                imageButton13.setImageResource(init.carte((int) liste.get(12)));
                cpt_flip++;
                check(imageButton13, (int) liste.get(12));
            }
        });

        final ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(13);
                imageButton14.setImageResource(init.carte((int) liste.get(13)));
                cpt_flip++;
                check(imageButton14, (int) liste.get(13));
            }
        });

        final ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        imageButton15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(14);
                imageButton15.setImageResource(init.carte((int) liste.get(14)));
                cpt_flip++;
                check(imageButton15, (int) liste.get(14));
            }
        });

        final ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
        imageButton16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(15);
                imageButton16.setImageResource(init.carte((int) liste.get(15)));
                cpt_flip++;
                check(imageButton16, (int) liste.get(15));
            }
        });

        final ImageButton imageButton17 = (ImageButton) findViewById(R.id.imageButton17);
        imageButton17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(16);
                imageButton17.setImageResource(init.carte((int) liste.get(16)));
                cpt_flip++;
                check(imageButton17, (int) liste.get(16));
            }
        });

        final ImageButton imageButton18 = (ImageButton) findViewById(R.id.imageButton18);
        imageButton18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(17);
                imageButton18.setImageResource(init.carte((int) liste.get(17)));
                cpt_flip++;
                check(imageButton18, (int) liste.get(17));

            }
        });

        final ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        imageButton19.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                liste.get(18);
                imageButton19.setImageResource(init.carte((int) liste.get(18)));
                cpt_flip++;
                check(imageButton19, (int) liste.get(18));

            }
        });

        final ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        imageButton20.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // liste.get(19);
                imageButton20.setImageResource(init.carte((int) liste.get(19)));
                cpt_flip++;
                check(imageButton20, (int) liste.get(19));
            }
        });

    }



    void check(ImageButton img,int id) {
        if (cpt_flip%2==0 && cpt_flip!=0){
            liste_result.add(id);
            if(verifie.verif(liste_result)==1){

                try {
                    //wait(100);
                    Thread.sleep(500);

                    img_tmp1.setImageResource(init.carte(10));
                    img.setImageResource(init.carte(10));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }else if(cpt_flip%2==1){
            img_tmp1 =img;
            if(!liste_result.isEmpty()){
                liste_result.clear();
            }

            liste_result.add(id);
        }
    }
    }
