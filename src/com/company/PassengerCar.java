package com.company;

public class PassengerCar extends Car {
    private Integer passengerSeats;

    public PassengerCar(String year, String brand, String bill, Integer passengerSeats) {
        super(year, brand, bill);
        this.passengerSeats = passengerSeats;
    }
}
