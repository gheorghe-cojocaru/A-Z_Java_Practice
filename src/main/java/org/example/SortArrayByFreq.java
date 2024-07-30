package org.example;

import java.util.*;

public class SortArrayByFreq {

    public static int[] sortByFreq(int[] arr) {
        // Schritt 1: Frequenzen der Elemente zählen
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Schritt 2: Liste der Elemente erstellen
        List<Integer> elements = new ArrayList<>();
        for (int num : arr) {
            elements.add(num);
        }

        // Schritt 3: Elemente nach Frequenz und Wert sortieren
        elements.sort((a, b) -> {
            int freqA = frequency.get(a);
            int freqB = frequency.get(b);
            if (freqA != freqB) {
                return freqB - freqA; // Absteigende Reihenfolge der Frequenz
            } else {
                return a - b; // Aufsteigende Reihenfolge der Werte
            }
        });

        // Schritt 4: Sortiertes Array zurückgeben
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < elements.size(); i++) {
            sortedArr[i] = elements.get(i);
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 5, 4, 6, 4};
        int[] result1 = sortByFreq(arr1);
        System.out.println(Arrays.toString(result1)); // Erwartete Ausgabe: [4, 4, 5, 5, 6]

        int[] arr2 = {9, 9, 9, 2, 5};
        int[] result2 = sortByFreq(arr2);
        System.out.println(Arrays.toString(result2)); // Erwartete Ausgabe: [9, 9, 9, 2, 5]
    }
}
