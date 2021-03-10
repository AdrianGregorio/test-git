/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.vectores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrián Rosón
 */
public class Capicua {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduzca el número: ");
        try{
            int num = sc.nextInt();
            System.out.println("El número "
                    + (isCapicua(num) ? "es " : "no es ")
                    + "capicua");
        }
        catch (InputMismatchException e){
            System.out.println("Introduce un número puto");
        }
        
    }
    
    static boolean isCapicua(int n){
        char[] numArray = intToCharArray(n);
        char[] invertedNumArray = new char[numArray.length];

        for (int i = numArray.length - 1; i >= 0; i--) {
            invertedNumArray[numArray.length - 1 - i] = numArray[i];
        }
        return Arrays.equals(numArray, invertedNumArray);
    }
    
    static char[] intToCharArray(int n) {
        
	String numString = Integer.toString(n);
        char[] arr = numString.toCharArray();
        
        return arr; 
    }
    
}
