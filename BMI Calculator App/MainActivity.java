package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    float floatWeight;
    float floatHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText weight = (EditText) findViewById(R.id.txtWeight);
        final EditText height = (EditText) findViewById(R.id.txtHeight);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        Button button = (Button) findViewById(R.id.btnCalculate);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                floatWeight = Float.parseFloat(weight.getText().toString());
                floatHeight = Float.parseFloat(height.getText().toString());
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putFloat("key1", floatWeight);
                editor.putFloat("key2", floatHeight);
                editor.commit();
                startActivity(new Intent(MainActivity.this, bmi.class));
            }
        });
    }
}
