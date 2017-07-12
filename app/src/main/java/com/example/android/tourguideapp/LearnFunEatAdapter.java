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
 * This class extends the ArrayAdapter to be used with objects of type Learn, Fun and Eat
 */

public class LearnFunEatAdapter extends ArrayAdapter<LearnFunEatObject> {

    //Variable that stores the list background color
    private int mListColorResourceId;

    public LearnFunEatAdapter(Activity context, ArrayList<LearnFunEatObject> learnFunEatPlaces, int color) {
        super(context, 0, learnFunEatPlaces);
        mListColorResourceId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.learn_fun_eat_list_item, parent, false);
        }
        //Get the Learn or Fun Object at the current position
        LearnFunEatObject currentLearnFunEatObject = getItem(position);

        //Find the view that will hold its name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        //Set the text on that view
        nameTextView.setText(currentLearnFunEatObject.getName());

        //Find the view that will hold the address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.item_address);
        //Set the text on that view
        addressTextView.setText(currentLearnFunEatObject.getAddress());

        //Find the wiew that will hold the operation hours
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.item_hours);
        //Set the text on that view
        hoursTextView.setText(currentLearnFunEatObject.getHours());

        //Find the wiew that will hold the price
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.item_price);
        //Set the text on that view
        priceTextView.setText(currentLearnFunEatObject.getPrice());

        // Set the theme color for the list item
        View listText = listItemView.findViewById(R.id.list_item_root);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mListColorResourceId);
        // Set the background color of the text container View
        listText.setBackgroundColor(color);

        // Return the whole item
        return listItemView;

    }
}

