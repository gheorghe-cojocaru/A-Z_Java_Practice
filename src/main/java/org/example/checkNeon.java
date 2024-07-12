package org.example;

public class checkNeon {

    // Kurze Erklärung: eine Neonzahl ist eine Zahl bei der die summe der Ziffern des Quadrats gleich mit der Zahl ist.
    // Bsp: 9 --> 9 * 9 = 81; 8 + 1 = 9;

    // Die Methode zur überprüüfung, ob eine Zahl jeine Neon-Zahl ist
    public static boolean checkNeon(int n) {

        int square = n * n;

        int sum = 0;

        while (square > 0) {

            int r = square % 10;

            sum += r;

            square = square / 10;
        }

        //Bedingung prüfen
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int n = 234;

        if (checkNeon(n))

            System.out.println("Die gegebene Zahl " + n + " ist eine Neon-Zahl");
        else
            System.out.println("Die gegebene Zahl " + n + " ist keine Neon-Zahl");
    }
}


