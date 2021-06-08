package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size cannot exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Property list:");
        for (int k : array) {
            System.out.println(k);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property in the list is " + max + " at " + index);
    }
}
