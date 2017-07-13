package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Creates the ArrayList of LearnFunObjects
        final ArrayList<LearnFunEatObject> learnPlaces = new ArrayList<LearnFunEatObject>();
        //Adds Learn Objects to the ArrayList
        learnPlaces.add(new LearnFunEatObject("Centro Cultural de Belém", "Praça do Império, 1449-003 Lisboa", "Varies with events", "Free", "geo:38.695500, -9.208400"));
        learnPlaces.add(new LearnFunEatObject("Museu Bordalo Pinheiro", "Campo Grande 382", "10 AM to 6PM", "Num xei", "geo:38.7627953,-9.1542141"));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));
        learnPlaces.add(new LearnFunEatObject("Museu", "Rua Grande", "9 to five", "10 euros", ""));

        //Creates an object of type LearnAdapter
        LearnFunEatAdapter adapter = new LearnFunEatAdapter(this, learnPlaces, R.color.learn_color);
        //Finds the list view where the items of the list will be displayed, that basically only
        //does the job of adding one item after the other.
        ListView listView = (ListView) findViewById(R.id.list_layout);
        //Sets the adapter on that view. This adapter will handle the visualization of list items, as it knows where
        //each type of data on the place goes.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get a clicked item position and the corresponding Uri
                String geolocation = learnPlaces.get(position).getGeolocation();
                //Call show map on the corresponding geolocation
                showMap(Uri.parse(geolocation));
            }

        });
    }
        public void showMap(Uri geoLocation) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(geoLocation);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }

