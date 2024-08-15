package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
     /*   {
            int[] marks = {124, 132, 99, 345, 113, 110};

            int highest_marks = maximum(marks);
            System.out.println("Die grösste Zahl ist: " + highest_marks);
        }
    }
    public static int maximum(int[] numbers) {
        int maxOfAr = numbers[0];

        //for each loop
        for (int num : numbers)
        {
            if (num > maxOfAr)
            {
                maxOfAr = num;
            }
        }
        return maxOfAr;
        */

        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        //Type 1
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int i : list) {
            int a = i;
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("For eac loop :: " + (endTime - startTime) + " ms");

        //Type 2
        startTime = Calendar.getInstance().getTimeInMillis();
        for (int j = 0; j < list.size(); j++) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");

        //Type 3
        startTime = Calendar.getInstance().getTimeInMillis();
        int size = list.size();
        for (int j = 0; j < size; j++) {
            int a = list.get(j);
        }
        endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("By calculating collection.size() first :: " + (endTime - startTime) + " ms");
        
    }
}
