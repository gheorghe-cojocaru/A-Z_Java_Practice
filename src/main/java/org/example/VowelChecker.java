package org.example;

public class VowelChecker {
    //Funktion, um zu überprüfen ob ein Zeichen ein Vokal ist
    public static String isVowel(char c) {
        //Konvertiere das Zeichen in Kleinbuchstaben

        c = Character.toLowerCase(c);

        //Überprüfen, ob das Zeichen einer der Vokale ist

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }

    //Hauptmethode, um die Funktion zu prüfen

    public static void main(String[] args) {
        char c1 = 'c';
        System.out.println("Eingabe: " + c1);
        System.out.println("Ausgabe: " + isVowel(c1));
    }
}
