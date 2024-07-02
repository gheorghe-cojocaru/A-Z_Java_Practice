package org.example;

public class ReversedString {

    public static String reverseIt(String str) {
        char[] chars = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();

    }
    public static void main (String[]args){
        String original = "Guten Tag";
        String reversed = reverseIt(original);
        System.out.println("Umgekehrt: " + reversed);

    }
}