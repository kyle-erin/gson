package com.pri;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Holds cars.
 */
public class Lot {
    public ArrayList<Car> mCars;
    public String mName;
    public String mAddress;

    public Lot(ArrayList<Car> tCars, String name, String address)
    {
        mCars = tCars;
        mName = name;
        mAddress = address;
    }

    public String toString()
    {
        String str = "";
        str += "Cars: ";
        str += Arrays.toString(mCars.toArray());
        str += "\n";
        str += "Address: ";
        str += mAddress;
        str += "\n";
        str += "Name: ";
        str += mName;
        return str;
    }

    public int size()
    {
        return mCars.size();
    }

}
