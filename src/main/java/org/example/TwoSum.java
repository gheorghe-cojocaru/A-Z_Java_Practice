package org.example;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // HashMap um die Zahlen und Indizes zu speichern

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            //Prüfen, ob die Ergänzung in der HashMap vorhanden ist.
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i }; // Indizes zurückgeben, wenn die Ergänzung gefunden wurde

            }
            //Wenn die Ergänzung nicht gefunden wurde, füge die aktuelle Zahl und ihren Indizes zur HashMap hinzu
            map.put(nums[i], i);
        }
        //Ein leeres Array wird zurückgegeben, wenn keine Lösung gefunden wird
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 7, 11, 34, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Ergebnis : [ " + result[0] + ", " + result[1] + "]");
    }

}
