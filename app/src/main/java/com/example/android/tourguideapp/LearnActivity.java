package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        //Creates the ArrayList of LearnFunObjects
        ArrayList<LearnFunEatObject> learnPlaces = new ArrayList<LearnFunEatObject>();
        //Adds Learn Objects to the ArrayList
        learnPlaces.add(new LearnFunEatObject("Centro Cultural de Belém", "Praça do Império, 1449-003 Lisboa", "Varies with events", "Free"));
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

        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    showMap(Uri.parse("geo:38.695500, -9.208400"));
                } else
                    Toast.makeText(LearnActivity.this, "cliquei em outro", Toast.LENGTH_SHORT).show();

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

