package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class bmi extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        TextView bmi = (TextView) findViewById(R.id.txtCalculate);
        ImageView image = (ImageView) findViewById(R.id.imgYears);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        float floatWeight = sharedPref.getFloat("key1", 0);
        float floatHeight = sharedPref.getFloat("key2", 0);
        float bodyMass;

        bodyMass = ((floatWeight * 703) / (floatHeight * floatHeight));
        DecimalFormat index = new DecimalFormat("###,###.#");

        bmi.setText("Your Body Mass Index is " + index.format(bodyMass));
    }
}
