package org.example.CommonElements;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CommonElements comm_el = new CommonElements();
        int[] v1 = {1,2,3,4,5,6,7};
        int[] v2 = {3,4,6,7,8,9};

        ArrayList <Integer> finalResult = comm_el.commonElement(v1,v2);
        System.out.println(finalResult);
    }
}
