package com.example.improveyourgolfstroke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    AnimationDrawable golfAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame = (ImageView) findViewById(R.id.imgGolf);
        imgFrame.setBackgroundResource(R.drawable.animation);
        golfAnimation = (AnimationDrawable) imgFrame.getBackground();
        Button button1 = (Button) findViewById(R.id.btnStart);
        Button button2 = (Button) findViewById(R.id.btnStop);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                golfAnimation.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                golfAnimation.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));
            }
        });
    }
}
