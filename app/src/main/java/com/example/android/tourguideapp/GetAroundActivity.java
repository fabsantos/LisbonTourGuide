package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GetAroundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Creates the ArrayList of GetAroundObjects
        ArrayList<GetAroundObject> transports = new ArrayList<GetAroundObject>();
        //Adds Get Around Objects to the ArrayList
        transports.add(new GetAroundObject("SUBWAY", "Metro de Lisboa", "6 AM to 1AM", "€1.40", R.drawable.subway_map));
        transports.add(new GetAroundObject("DAY BUS", "Carris", "????", "????", R.drawable.bus_network_map));
        transports.add(new GetAroundObject("NIGHT BUS", "Carris", "????", "???", R.drawable.night_bus_network_map));

        //Creates an object of type LearnAdapter
        GetAroundAdapter adapter = new GetAroundAdapter(this, transports);
        //Finds the list view where the items of the list will be displayed, that basically only
        //does the job of adding one item after the other.
        ListView listView = (ListView) findViewById(R.id.list_layout);
        //Sets the adapter on that view. This adapter will handle the visualization of list items, as it knows where
        //each type of data on the place goes.
        listView.setAdapter(adapter);
    }
}



