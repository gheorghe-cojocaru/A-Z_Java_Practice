package org.example;

public class LCM {
   /*
   Erste Option

   public static void main(String[] args) {

        int a = 15, b = 25;

        //Hersausfinden welche Nummer ist die grösste
        int ant = (a > b) ? a : b;

        //Herausfinden welche Nummer ist die "kleinstes gemeinsames Vielfaches" die durch beide nummern dividert werden kann
        while(true) {
            if (ant % a == 0 && ant % b == 0)
                break;
            ant++;
        }
        System.out.println("KGV von diesen 2 Nummern ist : " + ant);
    }*/

    //Zweite Option


        static int GCD(int a, int b) {
            if (a == 0)
                return b;
            return GCD(b % a, a);

    }
        static int LCD(int a, int b) {
            return (a / GCD(a,b)) * b;
        }

    public static void main(String[] args) {
        int a = 244, b = 23;

        System.out.println("LCM von den 2 Nummern ist: " + LCD(a,b));
    }


}
