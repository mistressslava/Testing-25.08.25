package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isPositive(int number) {

        return number >= 0;
    }

    public static String getFirstLetter(String text) {

        if (text != null && !text.isEmpty()) {
            return text.substring(0, 1);
        }
        return null;
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Argument 'divisor' is 0");

        return (double) a / b;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i +=2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return "" + n;
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //Exercise 4

    public static String reverseString(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    //Exercise 5

    public static boolean isPalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();

        return reversed.equalsIgnoreCase(str);

    }

    //Exercise 6

    public static int countVowels(String str) {
        String strVowels = "aeiou";

        ArrayList<Character> vowels = new ArrayList<>();

        for (int i = 0; i < strVowels.length(); i++) {
            vowels.add(strVowels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    //Exercise 7

    public static int factorial(int n) {
        int res = 1;
        if (n == 0) return res;
        for (int i = n; i >= 1; i--) {
            res *= i;
        }
        return res;
    }

    //Exercise 8

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Exercise 9

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            mergedArray[i] = a[i];
        }

        for (int i = 0; i < b.length ; i++) {
            mergedArray[a.length + i] = b[i];
        }

        return mergedArray;
    }
}
