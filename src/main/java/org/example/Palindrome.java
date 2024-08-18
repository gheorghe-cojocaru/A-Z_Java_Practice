package org.example;

public class Palindrome {
    public boolean isPalindrome(int x) {
        //Negative Zahlen sind keine Palindrome
        if (x < 0) {
            return false;
        }

        //Konvertiere die Zahl in String
        String s = String.valueOf(x);

        int left = 0;
        int right = s.length() - 1;

        //Überprüfe, ob die Zeichen von beiden Enden übereinstimmen
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindrome(121));
        System.out.println(palindrome.isPalindrome(-121));
        System.out.println(palindrome.isPalindrome(123321));
        System.out.println(palindrome.isPalindrome(23));

    }
}
