package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("./text.txt"))) {

            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Не удалось считать файл!");
        }

        CarsService carsService = new CarsService();

        System.out.println(carsService.toString());


        System.out.println("Введите год машины для поиска: ");
        String year = new InputOutputService().input();
    }
}
