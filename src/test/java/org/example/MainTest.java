package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void isEven_shouldReturnTrue_whenCallWith2() {
        //GIVEN -> Werte die wir kennen
        int number = 2;
        boolean expected = true;

        //WHEN -> Aufruf der Methode
        boolean actual = Main.isEven(number);

        //THEN -> Vergleich von Erwartung und Realitaet
        assertEquals(expected, actual);

    }

    @Test
    void isPositive_shouldReturnTrue_whenCallWith5() {
        int number = 5;
        boolean expected = true;

        boolean actual = Main.isPositive(number);
        assertEquals(expected, actual);
    }

    @Test
    void isPositive_shouldReturnFalse_whenCallWithMinus5() {
        int number = -5;
        boolean expected = false;

        boolean actual = Main.isPositive(number);
        assertEquals(expected, actual);
    }

    @Test
    void isPositive_shouldReturnTrue_whenCallWith0() {
        int number = 0;
        boolean expected = true;

        boolean actual = Main.isPositive(number);
        assertEquals(expected, actual);
    }

    @Test
    void multiply_shouldReturn28_whenCallWith7and4() {
        int num1 = 7;
        int num2 = 4;
        int expected = 28;

        int actual = Main.multiply(num1, num2);

        assertEquals(expected, actual);
    }


    @Test
    void multiply_shouldReturnMinus12_whenCallWith12andMinus1() {
        int num1 = 12;
        int num2 = -1;
        int expected = -12;

        int actual = Main.multiply(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    void getFirstLetter_shouldReturnNull_whenCallWithNull() {
        String str = null;

        String actual = Main.getFirstLetter(str);

        assertNull(actual);
    }

    @Test
    void getFirstLetter_shouldReturnSmth_whenCallWithStr() {
        String str = "Hello";

        String actual = Main.getFirstLetter(str);

        assertNotNull(actual);
    }

    @Test
    void getFirstLetter_shouldReturn() {
        String str = "Mammy";
        String expected = "M";

        String actual = Main.getFirstLetter(str);

        assertEquals(expected, actual);
    }

    //TDD -> Red -> Green -> Refactor
    @Test
    void fizzBuzz_shouldReturnFizz_whenNumberIs3() {
        String expected = "Fizz";
        int n = 3;

        String actual = Main.fizzBuzz(n);

        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnBuzz_whenNumberIs5() {
        String expected = "Buzz";
        int n = 5;

        String actual = Main.fizzBuzz(n);

        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizzBuzz_whenNumberIs15() {
        String expected = "FizzBuzz";
        int n = 15;

        String actual = Main.fizzBuzz(n);

        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturn1_whenNumberIs1() {
        String expected = "1";
        int n = 1;

        String actual = Main.fizzBuzz(n);

        assertEquals(expected, actual);
    }


    @Test
    void sum_shouldReturn8_whenNumbersAre5And3() {
        int n1 = 5;
        int n2 = 3;
        int expected = 8;

        int actual = Main.sum(n1, n2);

        assertEquals(expected, actual);
    }

    @Test
    void reverseString_shouldReturn_avaJ_whenCallWithJava() {
        String s = "Java";

        String expected = "avaJ";

        String actual = Main.reverseString(s);

        assertEquals(expected, actual);
    }

    @Test
    void reverseString_shouldReturn_ollaH_whenCallWithHallo() {
        String s = "Hallo";

        String expected = "ollaH";

        String actual = Main.reverseString(s);

        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_shouldReturnTrue_whenStrIsOtto() {
        String str = "Otto";

        boolean expected = true;

        boolean actual = Main.isPalindrome(str);

        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_shouldReturnFalse_whenStrIsJava() {
        String str = "Java";

        boolean expected = false;

        boolean actual = Main.isPalindrome(str);

        assertEquals(expected, actual);
    }

    @Test
    void countVowels() {
        String str = "Hellooo";

        int expected = 4;

        int actual = Main.countVowels(str);

        assertEquals(expected, actual);
    }

    @Test
    void factorial_shouldReturn120_whenNumberIs5() {
        int n = 5;
        int expected = 120;
        int actual = Main.factorial(n);

        assertEquals(expected, actual);
    }

    @Test
    void factorial_shouldReturn1_whenNumberIs0() {
        int n = 0;
        int expected = 1;
        int actual = Main.factorial(n);

        assertEquals(expected, actual);
    }

    //I should not do this in one test, but I am lazy
    @Test
    void fibonacci() {
        int firstTest = 0;
        int secondTest = 1;
        int thirdTest = 3;
        int forthTest = 6;

        int firstTestExpected = 0;
        int secondTestExpected = 1;
        int thirdTestExpected = 2;
        int forthTestExpected = 8;

        int firstTestActual = Main.fibonacci(firstTest);
        int secondTestActual = Main.fibonacci(secondTest);
        int thirdTestActual = Main.fibonacci(thirdTest);
        int forthTestActual = Main.fibonacci(forthTest);

        assertEquals(firstTestExpected, firstTestActual);
        assertEquals(secondTestExpected, secondTestActual);
        assertEquals(thirdTestExpected, thirdTestActual);
        assertEquals(forthTestExpected, forthTestActual);
    }

    @Test
    void mergeArrays() {
        int[] a = {1, 2};
        int[] b = {3,4};

        int[] expected = {1, 2, 3, 4};
        int[] actual = Main.mergeArrays(a, b);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}