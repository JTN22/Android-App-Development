package com.example.animalvoiceschildrensapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animal extends AppCompatActivity
{
    Button button1, button2;
    MediaPlayer mpCow, mpPig;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        button1 = (Button) findViewById(R.id.btnCows);
        button2 = (Button) findViewById(R.id.btnPigs);

        button1.setOnClickListener(bCow);
        button2.setOnClickListener(bPig);

        mpCow = new MediaPlayer();
        mpPig = new MediaPlayer();

        mpCow = MediaPlayer.create(this, R.raw.cows);
        mpPig = MediaPlayer.create(this, R.raw.pigs);
        playing = 0;
    }

    View.OnClickListener bCow = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            switch (playing)
            {
                case 0:
                    mpCow.start();
                    playing = 1;
                    button1.setText("Pause the Cows");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpCow.pause();
                    playing = 0;
                    button1.setText("Listen to the Cows");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

    View.OnClickListener bPig = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            switch (playing)
            {
                case 0:
                    mpPig.start();
                    playing = 1;
                    button2.setText("Pause the Pigs");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpPig.pause();
                    playing = 0;
                    button2.setText("Listen to the Pigs");
                    button1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
