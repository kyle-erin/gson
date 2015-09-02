package com.pri;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        final Car car1 = new Car(CarType.Coupe, "Honda", "Civic");
        final Car car2 = new Car(CarType.Sedan, "Hyundai", "Sonata");

        Lot lot = new Lot(new ArrayList<Car>(){{add(car1);add(car2);}}, "All Things Auto", "1234 56th St Ct E");

        String json = gson.toJson(lot);
        System.out.println("*** JSON ***");
        System.out.println(json);
        System.out.println();

        Lot lot1 = gson.fromJson(json, Lot.class);
        System.out.println("*** Lot Object ***");
        System.out.println(lot1);
    }
}
