package com.pri.tests;

import com.pri.Car;
import com.pri.CarType;
import com.pri.Lot;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests Lot.java
 */
public class TestLot {

    @Test
    public void testSize()
    {
        Car car1 = new Car(CarType.Coupe, "Honda", "Civic");
        Car car2 = new Car(CarType.Sedan, "Hyundai", "Sonata");

        Lot lot = new Lot(new Car[]{car1, car2}, "All Things Auto", "1234 56th St Ct E");
        assertEquals(lot.size(), 2);
    }
}
