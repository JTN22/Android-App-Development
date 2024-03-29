package com.example.beachandmountainbikerental;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String[] attraction = {"Beach Bike Rentals", "Mountain Bike Rental", "Bike Rentals Website"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.bike, attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position)
        {
            case 0:
                startActivity(new Intent(MainActivity.this, BeachBike.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, MountainBike.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.campusbikeshop.com")));
                break;
        } // end switch
    } // end onListItemClick
}
