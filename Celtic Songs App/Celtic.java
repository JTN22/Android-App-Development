package com.example.celticsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Celtic extends AppCompatActivity
{
    Button button1, button2;
    MediaPlayer mpJig, mpBagpipes;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celtic);

        button1 = (Button) findViewById(R.id.btnJig);
        button2 = (Button) findViewById(R.id.btnBagpipes);

        button1.setOnClickListener(bJig);
        button2.setOnClickListener(bBagpipes);

        mpJig = new MediaPlayer();
        mpBagpipes = new MediaPlayer();

        mpJig = MediaPlayer.create(this, R.raw.jig);
        mpBagpipes = MediaPlayer.create(this, R.raw.bagpipes);
        playing = 0;
    }

    View.OnClickListener bJig = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            switch (playing)
            {
                case 0:
                    mpJig.start();
                    playing = 1;
                    button1.setText("Pause Irish Jig");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpJig.pause();
                    playing = 0;
                    button1.setText("Play Irish Jig");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

    View.OnClickListener bBagpipes = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            switch (playing)
            {
                case 0:
                    mpBagpipes.start();
                    playing = 1;
                    button2.setText("Pause Bagpipes Song");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpBagpipes.pause();
                    playing = 0;
                    button2.setText("Play Bagpipes Song");
                    button1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
