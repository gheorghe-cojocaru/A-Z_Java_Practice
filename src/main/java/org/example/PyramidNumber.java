package org.example;

public class PyramidNumber {

    public static void main(String[] args) {

        int num = 15;
        int x = 0;

        //Äussere Schleife für Reihen

        for (int i = 1; i <= num; i++) {
            x = i - 1;

            //eine innere Schleife
            for (int j = i; j <= num - 1; j++) {
                //Leerzeichen für die erste Zahl
                System.out.print("  ");

                //Leerzeichen zwischen die Nummern
                System.out.print(" ");

            }

            //Pyramide drucken
            for (int j = 0; j <= x; j++)
                System.out.print((i + j) < 10
                                        ? (i + j) + " "
                                        :(i + j) + " ");
            for (int j = 1; j <= x; j++)
                System.out.print((i + x - j) < 10
                                            ?(i + x - j) + " "
                                            : (i + x - j) + " ");

            System.out.println();

        }
    }
}
