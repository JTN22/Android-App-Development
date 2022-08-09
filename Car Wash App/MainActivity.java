package com.example.carwash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    double price1 = 10.99;
    double price2 = 15.99;
    double discount1 = 8.99;
    double discount2 = 12.99;
    double washEntered;
    double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText wash = (EditText) findViewById(R.id.txtWash);
        final RadioButton exterior = (RadioButton) findViewById(R.id.rad1);
        final RadioButton ex_interior = (RadioButton) findViewById(R.id.rad2);
        TextView result = (TextView) findViewById(R.id.txtResult);

        Button cost = (Button) findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                washEntered = Double.parseDouble(wash.getText().toString());
                DecimalFormat decimal = new DecimalFormat("$#,###.##");

                if (exterior.isChecked())
                {
                    if (washEntered >= 12)
                    {
                        totalCost = washEntered * discount1;
                        result.setText(decimal.format(totalCost) + " for " + washEntered + " washes.");
                    }
                    else
                    {
                        totalCost = washEntered * price1;
                        result.setText(decimal.format(totalCost) + " for " + washEntered + " washes.");
                        Toast.makeText(MainActivity.this, "Buy 12 or more washes to receive a discount", Toast.LENGTH_LONG).show();
                    }
                }

                if (ex_interior.isChecked())
                {
                    if (washEntered >= 12)
                    {
                        totalCost = washEntered * discount2;
                        result.setText(decimal.format(totalCost) + " for " + washEntered + " washes.");
                    }
                    else
                    {
                        totalCost = washEntered * price2;
                        result.setText(decimal.format(totalCost) + " for " + washEntered + " washes.");
                        Toast.makeText(MainActivity.this, "Buy 12 or more washes to receive a discount", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
