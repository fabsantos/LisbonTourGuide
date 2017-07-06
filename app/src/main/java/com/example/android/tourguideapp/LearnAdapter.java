package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fabiola on 06/07/2017.
 * This class extends the ArrayAdapter to be used with objects of type Learn
 */

public class LearnAdapter extends ArrayAdapter<LearnObject> {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.learn_list_item, parent, false);
        }
        //Get the Learn Object at the current position
        LearnObject currentLearnObject = getItem(position);

        //Find the view that will hold its name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.learn_item_name);
        //Set the text on that view
        nameTextView.setText(currentLearnObject.getName());

        //Find the view that will hold the address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.learn_item_address);
        //Set the text on that view
        addressTextView.setText(currentLearnObject.getAddress());

        //Find the wiew that will hold the operation hours
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.learn_item_hours);
        //Set the text on that view
        hoursTextView.setText(currentLearnObject.getHours());

        //Find the wiew that will hold the price
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.learn_item_price);
        //Set the text on that view
        priceTextView.setText(currentLearnObject.getPrice());

        // Return the whole item
        return listItemView;

    }

    public LearnAdapter (Activity context, ArrayList<LearnObject> learnPlaces){
        super(context, 0, learnPlaces);
    }
}

