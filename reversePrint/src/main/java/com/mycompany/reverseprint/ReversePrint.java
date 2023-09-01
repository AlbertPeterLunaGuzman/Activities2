/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverseprint;

/**
 *
 * @author Albert
 */
import java.util.*;
public class ReversePrint {

    public static void main(String[] args) {
        int[] array = intArray();
        ReversePrint.printArrayInReverse(array);
    }
    private static int[] intArray(){
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the elements of the array: ");
            for(int i = 0; i < a.length; i++){
                a[i] = s.nextInt();
            }
        return a;
    }
    private static void printArrayInReverse(int[] array){
        System.out.println("\nThe reversed array is: ");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
