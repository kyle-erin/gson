package com.pri.tests;
import com.pri.Car;
import com.pri.CarType;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests Car.java
 */
public class TestCar {

    @Test
    public void testToString()
    {
        Car car = new Car(CarType.Sedan, "Toyota", "Prius");
        assertEquals(car.toString(), "Toyota Prius( Sedan )" );
    }
}
