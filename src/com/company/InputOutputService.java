package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputService {
    public String input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        try {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (s.equals("")) {
            throw new Error("String can not be empty!");
        }
        return s;
    }
}
