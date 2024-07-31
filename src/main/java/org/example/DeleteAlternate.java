package org.example;

public class DeleteAlternate {

    //Funktion zum Löschen der Zeichen an ungeraden Indizes
    public static String deleteOddInd(String s) {
        StringBuilder result = new StringBuilder();

        //Iterieren durch die Zeichenkette und nur die Zeichen an ungeraden Indizes hinzufügen;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Cojocaru Gheorghe Victor";
        System.out.println(deleteOddInd(s));
    }

}
