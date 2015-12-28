package com.example.alyss.memory;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by jazz on 20/11/15.
 */
public class ScoreActivity extends AppCompatActivity {


    static TextView txt ;
    static String tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        txt = (TextView) findViewById(R.id.textView);
        loadSavedPreferences();


        txt.setText("Score\n" + loadSavedPreferences()+ "\n");

       // Log.d("Pref->", string_tmp);
    }

    @Override protected void onPause() {
        super.onPause();
        MainActivity.backgroundMusic.pause();

        // mView.onPause();
    }

    @Override protected void onResume() {
        super.onResume();
        if(SystemeActivity.music_active==1) {
            MainActivity.backgroundMusic.start();
        }
        // mView.onResume();

    }


 /*   void savePreferences(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }
*/


     String loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

          tmp = sharedPreferences.getString("score", ""+JeuView.score_fin);

        return tmp;
       // txt.setText("Score\n" + string_tmp + "\n");

    }

}
