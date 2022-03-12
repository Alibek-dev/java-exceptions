package com.company;

import java.util.ArrayList;

public class CarsService {

    private ArrayList<Car> cars;

    public CarsService() {
        cars = new ArrayList<>();
        cars.add(new AutoTruck("2018", "DAF", "17900000", 44));
        cars.add(new PassengerCar("2019", "Toyota", "14200000", 4));
        cars.add(new PassengerCar("2013", "BMW", "23500000", 4));
        cars.add(new AutoTruck("2014", "Volvo", "33000000", 56));
        cars.add(new PassengerCar("2010", "Nissan", "1050000", 6));
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        String template = "";
        for (Car car: cars) {
            template = template + car.getBrand() + " " + car.getBill() + " " + car.getYear() + "\n";
        }
        return template;
    }
}
