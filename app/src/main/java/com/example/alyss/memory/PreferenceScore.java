package com.example.alyss.memory;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jazz on 28/12/15.
 */
public  class PreferenceScore extends AppCompatActivity {

    static String tmp;


    void savePreferences(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    String loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

        tmp = sharedPreferences.getString("score", ""+JeuView.score_fin);

        return tmp;
        // txt.setText("Score\n" + string_tmp + "\n");

    }

    public String getTmp (){
        loadSavedPreferences();
        return tmp;
    }
}
