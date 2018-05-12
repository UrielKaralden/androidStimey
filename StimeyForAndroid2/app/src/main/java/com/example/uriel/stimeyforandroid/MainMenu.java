package com.example.uriel.stimeyforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button toPostureButton, toEmotionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        toPostureButton = findViewById(R.id.toPostureButton);
        toEmotionButton = findViewById(R.id.toEmotionButton);

        toPostureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPostureRecognition = new Intent(MainMenu.this, PostureRecognition.class);
                startActivity(toPostureRecognition);
            }
        });

        toEmotionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toEmotionRecognition = new Intent(MainMenu.this, EmotionRecognition.class);
                startActivity(toEmotionRecognition);
            }
        });



    }

}
