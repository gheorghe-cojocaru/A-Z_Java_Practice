package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BiggestOfThree {

    /* static int biggestOf(int a, int b, int c) {

         return a > (b>c ? b:c) ? a : ((b>c) ? b:c);
     }

    public static void main(String[] args) {

         int result;
         int a,b,c;
         a = 10;
         b = 34;
         c = 4;

         result = biggestOf(a,b,c);

        System.out.println("Die grösste Zahl ist: "+ result);

    }*/

    //Oder diese Methode mit ArrayList und Collections
    public static void main(String[] args) {
        int a,b,c;
        a = 12;
        b = 22;
        c = 2334;

        ArrayList<Integer> x = new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);

        System.out.println("Die grösste Zahl ist: " + Collections.max(x));
    }

    //Man kann noch mit if else versuchen oder Math.max;
}
