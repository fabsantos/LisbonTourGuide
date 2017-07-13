package com.example.android.tourguideapp;

/**
 * Created by Fabiola on 06/07/2017.
 * This class defines the contents of a Learn Object. This will have a name, an address, operation hours and entry price.
 * {@link LearnFunEatObject}
 */

public class LearnFunEatObject {

    //Variable that will store the name of the place
    private String mName;

    //Variable that will store the address
    private String mAddress;

    //Variable that will store the operation hours
    private String mHours;

    //Variable that will store the entry price
    private String mPrice;

    //Variable that will store the geolocation
    private String mGeolocation;


    /**
     * Constructor
     * @param name The name of the place, a museum, a library, etc.
     * @param address
     * @param hours The hours of operation
     * @param price The entry price
     */
    public LearnFunEatObject(String name, String address, String hours, String price, String geolocation){
        mName = name;
        mAddress = address;
        mHours = hours;
        mPrice = price;
        mGeolocation = geolocation;
    }

    //Getters
    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getHours() {
        return mHours;
    }

    public String getPrice() {
        return mPrice;
    }

    public String getGeolocation() {return mGeolocation; }
}
