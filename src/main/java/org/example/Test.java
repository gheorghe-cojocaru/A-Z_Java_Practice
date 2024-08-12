package org.example;

import java.util.*;

public class Test {

    public static double calculateArea(int choice, List<Double> arr) {
        double area = 0;
        switch (choice) {
            case 1:
                double R = arr.get(0);
                area = Math.PI * R * R;
                break;
            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                area = L * B;
                break;
            default:
                throw new IllegalArgumentException("Falsch eingegeben. Geben sie bitte 1 oder 2.");
        }
        return area;
    }

    public static void main(String[] args) {
        List<Double> circleDimensions = Arrays.asList(5.0);
        System.out.println("Die Fläche des Kreises ist: " + calculateArea(1, circleDimensions));

        List<Double> rectangleDimensions = Arrays.asList(5.0, 6.0);
        System.out.println("Die Fläche des Rechteckes ist: " + calculateArea(2, rectangleDimensions));
    }

}

