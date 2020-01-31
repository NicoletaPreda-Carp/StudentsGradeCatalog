package com.company;

import java.util.Scanner;

public class Console {

    private static Scanner _scanner = new Scanner(System.in);

    public static int readInt () {
        System.out.print("Int: ");
        return _scanner.nextInt();
    }

    public static String readString () {
        System.out.print("String: ");
        return _scanner.nextLine();
    }

    public static int[] readIntArray () {
        int[] array = new int [readArrayLength()];
        for (int i= 0; i < array.length; i++) {
            System.out.print("array[" + i + "]: ");
            array[i] = _scanner.nextInt();
        }
        return array;
    }

    public static String[] readStringArray () {
        String [] array = new String [readArrayLength()];
        for (int i= 0; i < array.length; i++) {
            System.out.print("array[" + i + "]: ");
            array[i] = _scanner.nextLine();
        }
        return array;
    }

    public static void displayMessage (String message) {
        System.out.println(message);
    }

    public static void displayMessage (int message) {
        System.out.println(message);
    }

    public static void displayArray (int [] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(" }");
    }

    public static void displayArray (String [] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(" }");
    }

    private static int readArrayLength () {
        System.out.print("Array Length: ");
        return _scanner.nextInt() ;
    }
}
