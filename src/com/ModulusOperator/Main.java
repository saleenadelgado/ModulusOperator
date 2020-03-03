package com.ModulusOperator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
        lastDigit();
    }

    public static void testOddness() {
        // todo even or odd
        // todo keep number contained
        // todo get the last digit

        // We want to find if a number is even or odd
        int number;



        Scanner keyboard;
        keyboard= new Scanner(System.in);

        System.out.println("Give me a positive number");
        number = keyboard.nextInt();
        System.out.println("Number is even: " + (number % 2 == 0));

        System.out.println("Number is odd: " + (number % 2 != 0));
    }

    public static void keepContained() {
        int number;
        Scanner keyboard;
        keyboard= new Scanner(System.in);

        System.out.println("Give me a positive number");
        number = keyboard.nextInt();
    System.out.println("number contained is ");
        System.out.println((number%8)+5);



    }

    public static void lastDigit() {
        int number;
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("Give me a positive number that is four digits long");
        number = keyboard.nextInt();
        System.out.println("The last of number digit is: " +(number%10));



    }
}
