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

    private static void lowerPart( int size) {

        int m, n;

        //äussere Schleife für Reihen
        for (m = 1; m <= size; m++) {

            //erste innere Schleife für Dreieick
            for ( n = 1; n < m; n++) {
                System.out.print(" ");
            }

            //zweite innere Schleife
            for (n = m; n <= size; n++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 7;

        //Methoden abrufen
        upperPart(size);
        lowerPart(size);
    }


}
