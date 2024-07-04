package org.example;

import java.util.List;

public class Area {
    public static double calculateArea(int choice, List<Integer> arr) {
        switch (choice) {
            case 1:
                int R = arr.get(0);
                return Math.PI * R * R;
            case 2:
                int L = arr.get(0);
                int B = arr.get(1);
                return L * B;
            default:
                throw new IllegalArgumentException("Ungültige Wahl:" + choice);

        }
    }

    public static void main(String[] args) {
        //Bsp 1
        int choice1 = 1;
        List<Integer> arr2 = List.of(5);
        System.out.println("Fläche: " + calculateArea(choice1, arr2));

        //Bsp 2
        int choice2 = 2;
        List<Integer> arr1 = List.of(5,34);
        System.out.println("Fläche: " + calculateArea(choice2,arr1));
    }
}
