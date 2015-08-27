package com.pri;

import java.util.Arrays;

/**
 * Created by kyle on 8/27/2015.
 */
public class Lot {
    public Car[] mCars;
    public String mName;
    public String mAddress;

    public Lot(Car[] tCars, String name, String address)
    {
        mCars = tCars;
        mName = name;
        mAddress = address;
    }

    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("Cars: ");
        str.append(Arrays.toString(mCars));
        str.append("\n");
        str.append("Address: ");
        str.append(mAddress);
        str.append("\n");
        str.append("Name: ");
        str.append(mName);
        return str.toString();
    }
}
