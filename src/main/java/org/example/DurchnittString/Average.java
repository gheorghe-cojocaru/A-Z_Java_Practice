package org.example.DurchnittString;

public class Average {

    //Methode zur Berechnung des Durchnitts eines Strings

    String calc (int A[], int N) {
        float sum = 0;
        for(int i = 0; i<N; i++){
            sum+=A[i];
        }
        double average = (double)(sum/N);
        String output = String.format("%.2f",average);
        return output;
    }
}
