package com.example.alyss.memory;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EndActivity extends AppCompatActivity {

    public boolean win = false;

    public ImageView endView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        if (win == true) {
            endView.setImageResource(R.drawable.win);
        }else{
            endView.setImageResource(R.drawable.lose);
        }

        final Button menuButton = (Button) findViewById(R.id.button_menu);
        menuButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent menu = new Intent(EndActivity.this, MainActivity.class);
                startActivity(menu);
            }
        });

        final Button systemeButton = (Button) findViewById(R.id.button_systeme);
        systemeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent jeu = new Intent(EndActivity.this, LaunchGame.class);
                startActivity(jeu);
            }
        });
    }
}
