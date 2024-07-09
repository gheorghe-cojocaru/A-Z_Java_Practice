package org.example;

public class GCDandHCF {

    static int GCD(int a, int b) {
        //Euklidishe Algorithmus
        if (a == 0)
        return b;

        if (b == 0)
        return a;

        if(a == b)
        return a;

        if(a > b)
        return GCD(a-b, b);
        return GCD(a, b-a);
    }

    public static void main(String[] args) {
        int a = 189, b = 222;
        System.out.println("GCD von: "+ a + " und " + b + " ist: "+ GCD(a,b));
    }
}
