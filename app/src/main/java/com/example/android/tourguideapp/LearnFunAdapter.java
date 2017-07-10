package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fabiola on 06/07/2017.
 * This class extends the ArrayAdapter to be used with objects of type Learn and Fun
 */

public class LearnFunAdapter extends ArrayAdapter<LearnFunObject> {

    //Variable that stores the list background color
    private int mListColorResourceId;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.learn_fun_list_item, parent, false);
        }
        //Get the Learn or Fun Object at the current position
        LearnFunObject currentLearnFunObject = getItem(position);

        //Find the view that will hold its name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        //Set the text on that view
        nameTextView.setText(currentLearnFunObject.getName());

        //Find the view that will hold the address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.item_address);
        //Set the text on that view
        addressTextView.setText(currentLearnFunObject.getAddress());

        //Find the wiew that will hold the operation hours
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.item_hours);
        //Set the text on that view
        hoursTextView.setText(currentLearnFunObject.getHours());

        //Find the wiew that will hold the price
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.item_price);
        //Set the text on that view
        priceTextView.setText(currentLearnFunObject.getPrice());

        // Set the theme color for the list item
        View listText = listItemView.findViewById(R.id.list_item_root);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mListColorResourceId);
        // Set the background color of the text container View
        listText.setBackgroundColor(color);

        // Return the whole item
        return listItemView;

    }

    public LearnFunAdapter (Activity context, ArrayList<LearnFunObject> learnFunPlaces, int color){
        super(context, 0, learnFunPlaces);
        mListColorResourceId = color;
    }
}

