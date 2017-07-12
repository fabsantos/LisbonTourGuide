package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fabiola on 10/07/2017.
 * This class extends the ArrayAdapter to be used with objects of the type Get Around
 */

public class GetAroundAdapter extends ArrayAdapter<GetAroundObject> {

    //Constructor
    public GetAroundAdapter(Activity context, ArrayList<GetAroundObject> transports) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, transports);

    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        // Checks if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.get_around_list_item, parent, false);


        }

        //Get the GetAround Object in a given position
        GetAroundObject currentGetAroundObject = getItem(position);

        //Find the view that will hold the Type of Transport
        TextView typeTextView = (TextView) listItemView.findViewById(R.id.transport_type);
        //Set the text on that view
        typeTextView.setText(currentGetAroundObject.getTypeOfTransport());

        //Find the view that will hold the name of the operator
        TextView operatorTextView = (TextView) listItemView.findViewById(R.id.transport_operator);
        //Set the text on that view
        operatorTextView.setText(currentGetAroundObject.getOperatorName());

        //Find the view that will hold the hours of operation
        TextView hoursOfOperationTextView = (TextView) listItemView.findViewById(R.id.hours_of_operation);
        //Set the text on that view
        hoursOfOperationTextView.setText(currentGetAroundObject.getHoursOfOperation());

        //Find the view that will hold the price of the ticket
        TextView priceOfTicketTextView = (TextView) listItemView.findViewById(R.id.ticket_price);
        //Set the text on that view
        priceOfTicketTextView.setText(currentGetAroundObject.getTicketPrice());

        //Find the view that will hold the network map image
        ImageView networkMapImageView = (ImageView) listItemView.findViewById(R.id.network_map);
        //Make it gone so it only appears when clicked
        networkMapImageView.setVisibility(View.VISIBLE);
        //Find the image that corresponds to the current object
        networkMapImageView.setImageResource(currentGetAroundObject.getNetworkMap());

        //Return the whole list item
        return listItemView;
    }


}


