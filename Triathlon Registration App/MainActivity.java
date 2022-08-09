package com.example.triathlonregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity 
{
    double costPerAthlete = 725;
    int numberOfAthlete;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get input from TextView and Spinner
        final EditText tickets = (EditText) findViewById(R.id.txtAthletes);
        final Spinner group = (Spinner) findViewById(R.id.txtGroup);

        // define Button
        Button cost = (Button)findViewById(R.id.btnCost);

        // define onClickListener and onClick methods
        cost.setOnClickListener(new View.OnClickListener() 
        {
            final TextView result = (TextView) findViewById(R.id.txtResult);

            @Override
            public void onClick(View view) 
            {
                numberOfAthlete = Integer.parseInt(tickets.getText().toString());
                totalCost = costPerAthlete * numberOfAthlete;

                // define a formatting object
                DecimalFormat currency = new DecimalFormat("$###,###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText(groupChoice + " race team fee is " + currency.format(totalCost));
            } // end onClick
        }); // end setOnClickListener
    }
}
