package org.example;

public class IfElse {
        public static String compareNM(int n, int m) {
            if (n < m) {
                return "lesser";
            } else if (n > m) {
                return "greater";
            } else { // n == m
                return "equal";
            }
        }

        public static void main(String[] args) {
            int n = 5;
            int m = 3;
            System.out.println(compareNM(n, m)); // Beispielaufruf und Ausgabe
    }

}
