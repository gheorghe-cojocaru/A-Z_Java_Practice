public class TriangleStarPattern {

    public static void dreieckStern(int n) {

        int a, b;

        //wir brauchen ein Loop für die Reihen

        for (a = 0; a < n; a++) {

            // und noch ein Loop für die Säulen
            for (b = 0; b <= a; b++) {

                // die Sterne drucken

                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        int k = 7;
        dreieckStern(k);
    }
}
