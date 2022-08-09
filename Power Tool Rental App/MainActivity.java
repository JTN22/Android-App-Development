package com.example.powertoolrental;

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
    double price1 = 55.99;
    double price2 = 68.99;
    double dayEntered;
    double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText day = (EditText) findViewById(R.id.txtTool);
        final RadioButton washer = (RadioButton) findViewById(R.id.radWasher);
        final RadioButton tiller = (RadioButton) findViewById(R.id.radTiller);
        TextView result = (TextView) findViewById(R.id.txtResult);

        Button cost = (Button) findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dayEntered = Double.parseDouble(day.getText().toString());
                DecimalFormat decimal = new DecimalFormat("$#,###.##");

                if (washer.isChecked())
                {
                    if (dayEntered <= 7)
                    {
                        totalCost = dayEntered * price1;
                        result.setText("The cost is " + decimal.format(totalCost));
                    }
                    else
                    {
                        result.setText("");
                        Toast.makeText(MainActivity.this, "Days must be less than 7", Toast.LENGTH_LONG).show();
                    }
                }

                if (tiller.isChecked())
                {
                    if (dayEntered <= 7)
                    {
                        totalCost = dayEntered * price2;
                        result.setText("The cost is " + decimal.format(totalCost));
                    }
                    else
                    {
                        result.setText("");
                        Toast.makeText(MainActivity.this, "Days must be less than 7", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
