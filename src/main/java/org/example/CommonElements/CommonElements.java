package org.example.CommonElements;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public ArrayList<Integer> commonElement(int v1[], int v2[]) {
        //Ergebnisliste für die gesamte Elemente
        ArrayList<Integer> result = new ArrayList<>();

        //Beide Arrays werden sortiert
        Arrays.sort(v1);
        Arrays.sort(v2);

        //Zeiger für beide Arrays
        int i = 0, j = 0;

        //Gemeinsame Elemente werden gesucht
        while (i < v1.length && j < v2.length) {
            if (v1[i] == v2[j]) {
                result.add(v1[i]);
                i++;
                j++;
            } else if (v1[i] < v2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;

    }

}
