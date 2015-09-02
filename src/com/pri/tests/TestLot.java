package com.pri.tests;

import com.pri.Car;
import com.pri.CarType;
import com.pri.Lot;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Tests Lot.java
 */
public class TestLot {

    @Test
    public void testSize() {
        Lot lot = new Lot(new ArrayList<Car>() {{
            add(new Car(CarType.Coupe, "Honda", "Civic"));
            add(new Car(CarType.Sedan, "Hyundai", "Sonata"));
        }}, "All Things Auto", "1234 56th St Ct E");
        assertEquals(lot.size(), 2);
    }
}
