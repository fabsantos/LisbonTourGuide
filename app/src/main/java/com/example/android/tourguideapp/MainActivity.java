package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to be activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Learn in Lisbon category
        TextView learn = (TextView) findViewById(R.id.learn);

        // Set a click listener on that View
        learn.setOnClickListener(new View.OnClickListener() {
            // This will be executed when view is clicked on.
            @Override
            public void onClick(View view) {
                Intent learnIntent = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(learnIntent);
            }
        });

        // Find the View that shows the Fun in Lisbon category
        TextView fun = (TextView) findViewById(R.id.fun);

        // Set a click listener on that View
        fun.setOnClickListener(new View.OnClickListener() {
            // This will be executed when view is clicked on.
            @Override
            public void onClick(View view) {
                Intent funIntent = new Intent(MainActivity.this, FunActivity.class);
                startActivity(funIntent);
            }
        });

        // Find the View that shows the Shop in Lisbon category
        TextView shop = (TextView) findViewById(R.id.shop);

        // Set a click listener on that View
        shop.setOnClickListener(new View.OnClickListener() {
            // This will be executed when view is clicked on.
            @Override
            public void onClick(View view) {
                Intent shopIntent = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(shopIntent);
            }
        });

        // Find the View that shows the GetAround in Lisbon category
        TextView getAround = (TextView) findViewById(R.id.get_around);

        // Set a click listener on that View
        getAround.setOnClickListener(new View.OnClickListener() {
            // This will be executed when view is clicked on.
            @Override
            public void onClick(View view) {
                Intent getAroundIntent = new Intent(MainActivity.this, GetAroundActivity.class);
                startActivity(getAroundIntent);
            }
        });
    }
}
