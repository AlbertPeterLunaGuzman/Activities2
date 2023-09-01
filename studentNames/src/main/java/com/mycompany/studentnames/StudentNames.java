/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentnames;
/**
 *
 * @author Albert
 */
import java.util.Arrays;
import java.util.Scanner;
public class StudentNames {

    public static void main(String[] args) {
        String[] studentNamesArray = StudentNames.strArray();
        
        StudentNames.printStrArray(studentNamesArray);
        StudentNames.Sorter(studentNamesArray);
        StudentNames.strSearch(studentNamesArray);
    }
    
    private static String [] strArray (){
        Scanner s = new Scanner(System.in);
        String [] names = new String [5];
        System.out.println("Enter Names: ");
            for(int i = 0; i < names.length; i++){
                names[i] = s.nextLine();
            }
        return names;
    }
    private static void printStrArray(String[] array) {
        System.out.println("\nPrinted Names: ");
        for(String names: array){
            System.out.println(names);
        }
    }
    private static void Sorter(String[] array){
        Arrays.sort(array);
        System.out.println("\nThe sorted Array: ");
        for(String names : array)
            System.out.println(names);
        
    }
    private static void strSearch(String[] array){
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a name: ");
        String name = s.nextLine();
        
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase(name)){
                index = i;
                break;
            } 
        }
        if(index != -1){ System.out.println("The index of the name is: " + index);} 
        else { System.out.println("Name not found"); }
    }
}
