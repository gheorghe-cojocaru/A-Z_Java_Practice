package org.example;

public class Swap2Numb {


    //Funktion mit einer Temp Variable;(1 Variante)
    static void swapTwoNumb(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Getauschte nummer a ist: " + a + "\ngetauschte nummer b ist:" + b);

    }
    //Funktion ohne Temp Variable(2 Variante);

    static void swapTwoNumb2(int a, int b) {
        a = a-b;
        b=a+b;
        a = b-a;

        System.out.println("Getauschte nummer a ist: " + a + "\ngetauschte nummer b ist:" + b);
    }

    //Funktion mit Verwendung der Rechenoperatoren

    static void swapTwoNumb3(int a, int b) {

        a = (a+b) - (b=a);

        System.out.println("Getauschte nummer a ist: " + a + "\ngetauschte nummer b ist:" + b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 23;

        //Einer von den Funktionen wird abgerufen;
       swapTwoNumb3(a,b);
    }
}
