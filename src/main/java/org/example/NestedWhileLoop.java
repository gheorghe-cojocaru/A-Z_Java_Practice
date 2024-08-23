package org.example;
/*
public class NestedWhileLoop {
    public static void main(String[] args) {
            int row = 1, column = 1;
            int x;
            do {
                x = 4;
                do {
                    System.out.print("");
                    x--;
                } while (x >= row);
                column = 1;
                do {
                    System.out.print(column + " ");
                    column++;
                } while (column <= 5);
                System.out.println(" ");
                row++;
            } while (row <= 5);


    }
}
*/
public class NestedWhileLoop {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;
        int i = 1;
        //outer loop
        while (i <= weeks) {
            System.out.println("Week: " + i);

            //inner loop
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Days: " + j);
            }
            ++i;
        }
    }
}