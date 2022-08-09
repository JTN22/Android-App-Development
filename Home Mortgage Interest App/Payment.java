package com.example.homemortgageinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Payment extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView interest = (TextView) findViewById(R.id.txtInterest);
        ImageView image = (ImageView) findViewById(R.id.imgYears);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int intYears = sharedPref.getInt("key1", 0);
        int intLoan = sharedPref.getInt("key2", 0);
        float decMonthlypayment = sharedPref.getFloat("key3", 0);
        float decInterest;

        decInterest = (decMonthlypayment * 12 * intYears) - intLoan;
        DecimalFormat currency = new DecimalFormat("$###,###.##");

        interest.setText("Total interest paid " + currency.format(decInterest));
        if (intYears == 10)
            image.setImageResource(R.drawable.ten);
        else if (intYears == 20)
            image.setImageResource(R.drawable.twenty);
        else if (intYears == 30)
            image.setImageResource(R.drawable.thirty);
        else
            interest.setText("Enter 10, 20, or 30 years");
    }
}
