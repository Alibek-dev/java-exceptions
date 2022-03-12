package com.company;

public class Car {
    private String year;
    private String brand;
    private String bill;

    public Car(String year, String brand, String bill) {
        this.year = year;
        this.brand = brand;
        this.bill = bill;
    }

    public String getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getBill() {
        return bill;
    }
}
