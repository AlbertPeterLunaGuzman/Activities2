/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.squarenumbers;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class SquareNumbers {

    public static void main(String[] args) {
        int arraySize = size();
        int[] intArray = intArray(arraySize);
        int[] squaredValues = squareInt(intArray, intArray.length);
        printIntArray(squaredValues);
    }
     private static int size(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number of elements: ");
        int size = s.nextInt();
        return size;
    }
    private static int[] intArray(int size) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[size];

        System.out.println("\nEnter the elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }
    private static int[] squareInt(int[] array, int size) {
        int[] squaredArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }
    private static void printIntArray(int[] array) {
        System.out.println("\nThe Squared Elements of the array: ");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
