package org.example;

class PreciseFormat {

    public static void main(String[] args) {
        float a = 3.33f;
        float b = 1.234f;

        printInFormat(a, b); // Die Methode wird aufgerufen

    }
    static void printInFormat(float a, float b) {
        float result = a/b;
        String output = String.format("%.3f", result);

        System.out.println(result );
        System.out.println(output);
    }

}

