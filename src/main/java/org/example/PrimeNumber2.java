package org.example;

public class PrimeNumber2 {
    public static String isPrime(int n) {
        if (n <= 1) {
            return "No";
        }
        if (n == 2) {
            return "Yes";
        }
        if (n % 2 == 0) {
            return "No";
        }

        // Check for odd divisors from 3 up to sqrt(n)
        int sqrt_n = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < sqrt_n; i += 2) {
            if (n % i == 0) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrime(1)); // Output: No
        System.out.println(isPrime(2)); // Output: Yes
        System.out.println(isPrime(17)); // Output: Yes
        System.out.println(isPrime(18)); // Output: No
        System.out.println(isPrime(19)); // Output: Yes
    }
}
