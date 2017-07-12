package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Creates the ArrayList of LearnFunObjects
        ArrayList<LearnFunEatObject> learnPlaces = new ArrayList<LearnFunEatObject>();
        //Adds Learn Objects to the ArrayList
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros"));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros"));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros"));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros"));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros"));

        //Creates an object of type LearnAdapter
        LearnFunEatAdapter adapter = new LearnFunEatAdapter(this, learnPlaces, R.color.learn_color);
        //Finds the list view where the items of the list will be displayed, that basically only
        //does the job of adding one item after the other.
        ListView listView = (ListView) findViewById(R.id.list_layout);
        //Sets the adapter on that view. This adapter will handle the visualization of list items, as it knows where
        //each type of data on the place goes.
        listView.setAdapter(adapter);
    }
}
