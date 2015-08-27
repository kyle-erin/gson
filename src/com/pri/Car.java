package com.pri;

/**
 * A class used to serialize/deserialize car data.
 */
public class Car {
    public CarType mType;
    public String mMake;
    public String mModel;

    public Car(CarType theType, String make, String model) {
        mType = theType;
        mMake = make;
        mModel = model;
    }

    public String toString()
    {
        return mMake + " " + mModel + "( " + mType + " )";
    }
}
