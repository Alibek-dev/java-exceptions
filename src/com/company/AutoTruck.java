package com.company;

public class AutoTruck extends Car {
    private Integer carrying;

    public AutoTruck(String year, String brand, String bill, Integer carrying) {
        super(year, brand, bill);
        this.carrying = carrying;
    }
}
