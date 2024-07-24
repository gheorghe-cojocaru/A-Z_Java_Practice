package org.example;

public class PascalTriangle {

    // Methode zur Berechnung des Faktorials (a!)
    public int factorial(int a) {
        if (a == 0) // Basisfall: 0! ist 1
            return 1;

        return a * factorial(a - 1); // Rekursiver Aufruf: a * (a-1)!
    }

    public static void main(String[] args) {
        int k = 5;  // Anzahl der Zeilen im Pascal-Dreieck

        int a, b;

        PascalTriangle pascalTriangle = new PascalTriangle(); // Erstellen eines Objekts der Klasse PascalTriangle

        for (a = 0; a <= k; a++) {  // Äußere Schleife für jede Zeile
            for (b = 0; b <= k - a; b++) {  // Schleife zum Drucken der Leerzeichen
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {  // Schleife zum Drucken der Binomialkoeffizienten
                System.out.print(" " + pascalTriangle.factorial(a) / (pascalTriangle.factorial(a - b) * pascalTriangle.factorial(b)) );
            }

            System.out.println();  // Neue Zeile nachdem eine Zeile fertig gedruckt ist
        }
    }
}
