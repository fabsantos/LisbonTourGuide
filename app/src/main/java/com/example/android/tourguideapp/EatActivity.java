package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Creates the ArrayList of LearnFunEatObjects
        ArrayList<LearnFunEatObject> eatPlaces = new ArrayList<LearnFunEatObject>();
        //Adds Objects to the ArrayList
        eatPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));
        eatPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));
        eatPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));
        eatPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));
        eatPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));

        //Creates an object of type LearnFunEatAdapter
        LearnFunEatAdapter adapter = new LearnFunEatAdapter(this, eatPlaces, R.color.eat_color);
        //Finds the list view where the items of the list will be displayed, that basically only
        //does the job of adding one item after the other.
        ListView listView = (ListView) findViewById(R.id.list_layout);
        //Sets the adapter on that view. This adapter will handle the visualization of list items, as it knows where
        //each type of data on the place goes.
        listView.setAdapter(adapter);
    }
}
