package com.example.alyss.memory;

import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by jazz on 12/11/15.
 */
public class Animation {

    ImageButton img_tmp;
    int id_tmp;
   // private  Thread anime;

    public int clear_id(int id){

        int drawable=0;

        switch (id){

            case 0:
                drawable=R.drawable.clear1;
                break;
            case 1:
                drawable=R.drawable.clear2;
                break;
            case 2:
                drawable=R.drawable.clear3;
                break;
            case 3:
                drawable=R.drawable.clear4;
                break;
            case 4:
                drawable=R.drawable.clear5;
                break;
            case 5:
                drawable=R.drawable.clear6;
                break;
            case 6:
                drawable=id_tmp;
                break;
            default:break;
        }


        return drawable;




    }


    public void Animate_clear(ImageButton img, int id) {

        img_tmp = img;
        id_tmp = id;

        th b =  new th() ;
        Thread thread =  new Thread(b) ;
        thread.start() ;


        }

    public  class th  implements Runnable {

        // surcharge de la méthode run() de la classe Thread
        public  void run() {

            int n =  6 ;


              // img_tmp.setImageResource(id_tmp);
                System.out.println("Je vogue !") ;
               /* try {

                    Thread.sleep(1000) ;
                }  catch (InterruptedException e) {

                    // gestion de l'erreur
                }*/

        }
    }




    }



