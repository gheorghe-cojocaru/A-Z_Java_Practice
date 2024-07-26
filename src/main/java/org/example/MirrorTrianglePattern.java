package org.example;

public class MirrorTrianglePattern {

    private static void upperPart(int size) {

        //Variablen deklarieren
        int m, n;

        //äussere Schleife für Reihen
        for (m = size - 1; m > 0; m--) {

            //innere Schleife nr 1
            for (n = 0; n <m ; n++) {

                //Leerzeichen drücken
                System.out.print(" ");
            }

            //innere Schleife nr 2

            for ( n = m; n <= size - 1; n++) {

                //Stern mit Leerzeichen drücken
                System.out.print("*" + " ");
            }

            //hier ist fertig mit eine Reihe und geht zur nächsten

            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Grösse des Dreiecks
        int size = 7;

        //Methode abrufen
        upperPart(size);
    }
}
