package org.example;

public class Test {
    public static void main(String[] args) {

      int[] marks = {123, 125, 33, 544, 223, 98};

      int highestMarks = maximum(marks);
        System.out.println("Die grösste Zahl ist: " + highestMarks);

    }
    public static int maximum(int[] numbers) {
        int maxOfArr = numbers[0];

        for (int num : numbers) {
            if (num > maxOfArr) {
                maxOfArr = num;
            }
        }
        return maxOfArr;
    }

}