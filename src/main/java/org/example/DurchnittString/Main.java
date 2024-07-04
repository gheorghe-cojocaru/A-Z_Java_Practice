package org.example.DurchnittString;

public class Main {
    public static void main(String[] args) {
        Average average = new Average();

        int[] A = {1,2,3,4,5,6,7,11,23,12,};
        int N = A.length;

        // Die Methode wird aufgerufen
        String output = average.calc(A, N);

        System.out.println("Der Druchnitt ist: " + output);
    }
}
