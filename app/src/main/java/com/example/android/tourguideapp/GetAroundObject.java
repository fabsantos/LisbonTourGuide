package com.example.android.tourguideapp;

/**
 * Created by Fabiola on 10/07/2017.
 * This class defines the contents of a Get Around Object. This will have a type of transport, the operator name, hours of
 * operation, a ticket price and a map of the network.
 */

public class GetAroundObject {

    //Variable to store the type of transport
    private String mTypeOfTransport;

    //Variable to store the operator name
    private String mOperatorName;

    //Variable to store the hours of operation
    private String mHoursOfOperation;

    //Variable to store the ticket price
    private String mTicketPrice;

    //Variable to store the Network Map, i.e., an int refering to the resource.
    private int mNetworkMap;

    /**
     * Constructor
     * @param typeOfTransport The transport type (e.g. Subway, bus)
     * @param operatorName The name of the company that operates that transport
     * @param hoursOfOperation The hours of operation of the transport
     * @param ticketPrice The price of a ticket
     * @param networkMap The map of the transport network
     */
    public GetAroundObject (String typeOfTransport, String operatorName, String hoursOfOperation, String ticketPrice, int networkMap){
        mTypeOfTransport = typeOfTransport;
        mOperatorName = operatorName;
        mHoursOfOperation = hoursOfOperation;
        mTicketPrice = ticketPrice;
        mNetworkMap = networkMap;
    }

    //Getters
    public String getTypeOfTransport() {
        return mTypeOfTransport;
    }

    public String getOperatorName() {
        return mOperatorName;
    }

    public String getHoursOfOperation() {
        return mHoursOfOperation;
    }

    public String getTicketPrice() {
        return mTicketPrice;
    }

    public int getNetworkMap(){ return mNetworkMap; }
}


