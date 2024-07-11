package org.example;

public class PrimeNumber {

    static void primeN(int N) {

        //Variablen deklarieren
        int x, y, flg;

        //Eine Nachricht wird gedrückt

        System.out.println("Die Primzahlen zwischen 1 und " + N + " sind: ");

        for(x = 1; x <= N; x++) {

            //1 und 0 überspringen
            if(x == 1 || x == 0)
                continue;

            //flag variable wird benutzt um zu prüfen ob x eine Primzahl ist

            flg = 1;
            for (y = 2; y <= x/2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.println(x + " ");

        }

    }

    public static void main(String[] args) {
        int N = 45;

        primeN(N);
    }
}
