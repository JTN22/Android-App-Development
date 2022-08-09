package com.example.facialexpressions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    AnimationDrawable facialAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame = (ImageView) findViewById(R.id.imgActor);
        imgFrame.setBackgroundResource(R.drawable.animation);
        facialAnimation = (AnimationDrawable) imgFrame.getBackground();
        Button button = (Button) findViewById(R.id.btnStart);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                facialAnimation.start();
            }
        });
    }
}
