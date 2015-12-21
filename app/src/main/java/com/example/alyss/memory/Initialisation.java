package com.example.alyss.memory;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by jazz on 09/11/15.
 */
public class Initialisation {






    public ArrayList init() {


        ArrayList l = new ArrayList();
        for(int j=0;j<2;j++) {
            for (int i = 0; i < 10; i++) {
                l.add(i);
            }
        }
        Collections.shuffle(l);


        return  l;
    }


    public int carte(int id){

        int drawable=0;

        switch (id){

            case 0:
                drawable=R.drawable.chevre;
                break;
            case 1:
                drawable=R.drawable.chien;
                break;
            case 2:
                drawable=R.drawable.cochon;
                break;
            case 3:
                drawable=R.drawable.coq;
                break;
            case 4:
                drawable=R.drawable.dragon;
                break;
            case 5:
                drawable=R.drawable.rat;
                break;
            case 6:
                drawable=R.drawable.serpent;
                break;
            case 7:
                drawable=R.drawable.singe;
                break;
            case 8:
                drawable=R.drawable.tigre;
                break;
            case 9:
                drawable=R.drawable.vache;
                break;
            case 10:
                drawable=R.drawable.fond;
                break;

            default:break;
        }


        return drawable;




    }



}
