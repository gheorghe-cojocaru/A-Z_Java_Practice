package org.example;

import java.util.*;

public class Test {

    public static int [] sortByFreq(int [] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }

        //Eine Liste der Elemente erstellen

        List<Integer> elements = new ArrayList<>();
        for (int num : arr) {
            elements.add(num);
        }

        //Elemente nach Frequenz und Wert sortieren
        elements.sort((a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);
            if (freqA != freqB) {
                return freqB - freqA; //Absteigende Reihenfolge der Frequenz
            } else {
                return a - b; // Aufsteigende Reihenfolge
            }
        });

        //Das sortierte Array zurückgeben
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < elements.size(); i++) {
            sortedArr[i] = elements.get(i);
        }
        return sortedArr;

    }

    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9, 3, 3, 4, 4, 5, 5, 5, 5};
        int[] result1 = sortByFreq(arr1);
        System.out.println(Arrays.toString(result1));
    }

}

