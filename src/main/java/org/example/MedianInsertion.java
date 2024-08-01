package org.example;

import java.util.Arrays;

public class MedianInsertion {

    // Funktion zur Bestimmung der minimalen Anzahl von hinzuzufügenden Elementen, damit x der Median wird
    public static int minElementsToAdd(int[] arr, int x, int n) {
        Arrays.sort(arr);

        // Wenn x bereits der Median ist, keine Elemente hinzufügen
        if (isMedian(arr, x, n)) {
            return 0;
        }

        // Binäre Suche zur Bestimmung der minimalen Anzahl an hinzuzufügenden Elementen
        int left = 0, right = 2 * n; // upper bound großzügig auf 2 * n gesetzt
        while (left < right) {
            int k = left + (right - left) / 2;
            if (canBeMedianWithAdditionalElements(arr, x, n, k)) {
                right = k; // Versuche mit weniger Elementen
            } else {
                left = k + 1; // Erhöhe die Anzahl der Elemente
            }
        }
        return left;
    }

    // Hilfsfunktion zur Überprüfung, ob x der Median sein kann mit k zusätzlichen Elementen
    private static boolean canBeMedianWithAdditionalElements(int[] arr, int x, int n, int k) {
        int newSize = n + k;
        int medianIndex = (newSize - 1) / 2;

        // Zählt die Anzahl der Elemente im Array, die kleiner als x sind
        int count = 0;
        for (int value : arr) {
            if (value < x) {
                count++;
            }
        }

        // Überprüft, ob x an der Position medianIndex platziert werden kann
        return count <= medianIndex && count + k > medianIndex;
    }

    // Hilfsfunktion zur Überprüfung, ob x bereits der Median des aktuellen Arrays ist
    private static boolean isMedian(int[] arr, int x, int n) {
        int medianIndex = (n - 1) / 2;
        return arr[medianIndex] == x;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 9, 7, 11, 33};
        int x = 2;
        int n = arr.length;
        System.out.println(minElementsToAdd(arr, x, n)); // Beispiel-Ausgabe
    }
}

