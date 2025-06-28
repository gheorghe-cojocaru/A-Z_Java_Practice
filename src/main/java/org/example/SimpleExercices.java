package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleExercices {
    public static void main(String[] args) {

      /*  String[] farben = {"Rot", "Grün", "Blau", "Lila", "Beige"};

        for (String farbe : farben) {
            System.out.println("Farbe: " + farbe); */


          /*  ArrayList<String> staedte = new ArrayList<>();
            staedte.add("Berlin");
            staedte.add("Frankfurt");
            staedte.add("Bonn");

            staedte.add("Wöllstein");

            System.out.println("Städte: " + staedte); */

       /* int a = 5;
        int b = 14;

        System.out.println("Vorher: a = " + a + " b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Nacher: a = " + a + " b= " + b);
        } */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib dein Alter ein: " );

        int alter = scanner.nextInt();

        if (alter >= 18) {
            System.out.println("Du bist Volljährig");
        } else {
            System.out.println("Du bist minderjährig");
        }

        scanner.close();


    }
}


