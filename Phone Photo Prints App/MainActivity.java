package com.example.phonephotoprints;

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
    double rate1 = 0.19;
    double rate2 = 0.49;
    double rate3 = 0.79;
    double printsEntered;
    double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText prints = (EditText) findViewById(R.id.txtPrints);
        final RadioButton foursix = (RadioButton) findViewById(R.id.rad4x6);
        final RadioButton fiveseven = (RadioButton) findViewById(R.id.rad5x7);
        final RadioButton eightten = (RadioButton) findViewById(R.id.rad8x10);
        TextView result = (TextView) findViewById(R.id.txtResult);

        Button cost = (Button) findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                printsEntered = Double.parseDouble(prints.getText().toString());
                DecimalFormat decimal = new DecimalFormat("$#,###.##");

                if (foursix.isChecked())
                {
                    if (printsEntered <= 50)
                    {
                        totalCost = printsEntered * rate1;
                        result.setText("The order cost is " + decimal.format(totalCost));
                    }
                    else
                    {
                        result.setText("");
                        Toast.makeText(MainActivity.this, "Prints must be less than 50", Toast.LENGTH_LONG).show();
                    }
                }

                if (fiveseven.isChecked())
                {
                    if (printsEntered <= 50)
                    {
                        totalCost = printsEntered * rate2;
                        result.setText("The order cost is " + decimal.format(totalCost));
                    }
                    else
                    {
                        result.setText("");
                        Toast.makeText(MainActivity.this, "Prints must be less than 50", Toast.LENGTH_LONG).show();
                    }
                }

                if (eightten.isChecked())
                {
                    if (printsEntered <= 50)
                    {
                        totalCost = printsEntered * rate3;
                        result.setText("The order cost is " + decimal.format(totalCost));
                    }
                    else
                    {
                        result.setText("");
                        Toast.makeText(MainActivity.this, "Prints must be less than 50", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
